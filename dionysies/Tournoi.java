package dionysies;

import java.util.List;
import java.util.ArrayList;

/** Représente un tournoi de théâtre.
    Si le tournoi n'est pas commencé, il est possible d'inscrire
    des participants.
    On peut ensuite lancer le tournoi, au cours duquel des participants
    sont éliminés jusqu'à ce que le tournoi soit terminé.
    Quand le tournoi est terminé, on peut connaître le nom du vainqueur.
    @param <Auteur> le type des auteurs participant au tournoi.
*/
public class Tournoi<Auteur> {
    /** La liste des auteurs concurrents */
    protected List<Auteur> concurrents = new ArrayList<Auteur>();
    /** Le nom du Tournoi */
    protected String nom;
    /** Les auteurs en lice */
    protected List<Auteur> en_lice = new ArrayList<Auteur>();
    /** L'indice du premier des auteurs de la prochaine manche */
    protected int prochainA = 0;
    /** Le vainqueur du tournoi */
    protected Auteur vainqueur = null;
    
    /** Les états possibles d'un tournoi */
    private enum État {
        OUVERT,
        EN_COURS,
        TERMINÉ,
    }
    
    /** L'état du tournoi, initialisé à OUVERT */
    protected État état = État.OUVERT;

    /** Crée un tournoi avec le nom donné 
     * @param nom le nom du tournoi
    */
    public Tournoi(String  nom){
	    this.nom = nom;
    }
    /** Retourne le nom du tournoi
     * @return le nom du tournoi */
    public String getNom() {
	    return nom;
    }
    /** Inscrire un auteur au tournoi 
     * @param concurrent l'auteur à inscrire */ 
    public void inscrire(Auteur concurrent){
        if (état == État.OUVERT) {
            concurrents.add(concurrent);
        }
    }

    /** Affiche les participants au tournoi */
    public void afficheParticipants() {
        System.out.println("Les participants à " + getNom());
        for (Object p: concurrents) {
            System.out.println(" - " + p);
        }
    }

    /** Renvoie le participant A de la prochaine journée 
     * @return le participant A de la prochaine journée */
    public Auteur participantAProchaineJournée() {
	return en_lice.get(prochainA);
    }

    /** Renvoie le participant B de la prochaine journée 
     * @return le participant B de la prochaine journée */
    public Auteur participantBProchaineJournée() {
	return en_lice.get(prochainA + 1);
    }

    /** Initialisations des auteurs en lice et de l'état au début du tournoi */
    public void débute() {
	en_lice = new ArrayList<Auteur>(concurrents);
	if(en_lice.size() <= 1) {
	    état = État.TERMINÉ;
	} else {
	    état = État.EN_COURS;
	}
    }

    /** Enregistre le résultat d'une journée de tournoi.
        Si le paramètre est vrai, le participant A de la journée
        est vainqueur, sinon c'est le participant B.
        Puis on place l'état du tournoi à TERMINÉ si le tournoi est terminé.
        @param a_vainqueur vrai si le participant A est vainqueur.
    */
    public void enregistreRésultatJournée(boolean a_vainqueur) {
	if (état == État.EN_COURS) {
	    var idx_vainqueur = a_vainqueur ? 0 : 1;
	    en_lice.remove(prochainA + idx_vainqueur);
	    prochainA += 1;
	    if (prochainA + 1 >= en_lice.size()) {
		prochainA = 0;
	    }
	    if (en_lice.size() == 1) {
		état = État.TERMINÉ;
		vainqueur = en_lice.get(0);
	    }
	}
    }

    /** Renvoie vrai si le tournoi est commencé 
     * @return vrai si le tournoi est commencé */
    public boolean estCommencé() {
	    return état == État.OUVERT || état == État.TERMINÉ;
    }
    /** Renvoie vrai si le tournoi est terminé 
     * @return vrai si le tournoi est terminé */
    public boolean estTerminé() {
	    return état == État.TERMINÉ;
    }
    /** Retourne le nom du vainqueur du tournoi 
     * @return le nom du vainqueur du tournoi */
    public Auteur vainqueur() {
	    return vainqueur;
    }
};
