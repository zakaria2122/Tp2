import dionysies.Tournoi;

@SuppressWarnings("unused")
class Main {
  public static void main(String[] args) {
    String citation_antigone =
        "C'est ainsi que j'irai reposer près de lui, chère à qui m'est cher, saintement"
            + " criminelle.";

    String citation_limiers =
        "Un bruit? Voilà bien de mes froussards! Vous avez peur? Fétides individus, pétris de\n"
            + " pâte à nouilles, la pire faune de couards! La moindre ombre que vous voyez vous\n"
            + " épouvante, vous avez peur de tout! Pas de nerf, pas de tenue, pas francs du\n"
            + " collier! A vous voir, vous n'êtes que des outres, des jacasses et des\n"
            + " viédazes!";

            Auteur sophocle = new Auteur("Sophocle", citation_antigone, 95, "", 0, citation_limiers, 60);
            System.out.println(sophocle.getNom());
    String citation_hécube =
        "et elle, ayant entendu la parole des maîtres, saisissant ses voiles par l'épaule, les\n"
            + " déchira jusqu'à la hanche, à hauteur du nombril, montra ses seins et son buste,\n"
            + " comme d'une statue, splendide, puis, ayant mis genou en terre, elle tint ce\n"
            + " discours, le plus héroïque en bravoure : \" Voici, jeune homme: si c'est mon"
            + " buste\n"
            + " que tu désires frapper, frappe. Mais si c'est le cou, ma gorge est là, prête, la\n"
            + " voici.\" ";

    String citation_cyclope =
        "La richesse, chétif mortel, est le dieu des sages : tout le reste n'est que vanité et\n"
            + " belles paroles. Que m'importent à moi les promontoires consacrés à mon père? et\n"
            + " pourquoi m'en fais-tu un si pompeux étalage? Étranger, la foudre de Jupiter ne me\n"
            + " fait point trembler ; je ne sais point que Jupiter soit un dieu plus puissant que\n"
            + " moi : au surplus, je ne m'en soucie guère. Et pourquoi je ne m'en soucie pas, le\n"
            + " voici : Si ce dieu verse la pluie du haut du ciel, j'ai sous ce rocher un abri\n"
            + " solide et couvert; j'y mange un veau rôti ou quelque bête sauvage, et j'arrose"
            + " mon\n"
            + " ventre étendu, en vidant une amphore pleine de lait ; et je frappe dessus,\n"
            + " rivalisant, par ce bruit, avec le tonnerre de Jupiter. Et lorsque le Thrace\n"
            + " Borée verse la neige à gros flocons, je couvre mon corps de peaux de bêtes, je"
            + " fais\n"
            + " grand feu, et je me ris de la neige. La terre, de gré ou de force, fait naître de\n"
            + " l'herbe pour engraisser mes troupeaux. Je me garde bien de les immoler à quelque\n"
            + " autre dieu qu'à moi-même et à mon ventre, qui est le plus grand des dieux. Boire"
            + " et\n"
            + " manger chaque jour, et ne s'inquiéter de rien, voilà le Jupiter des sages. Que"
            + " ceux\n"
            + " qui ont établi des lois, et embarrassé la vie humaine de mille soins inutiles,\n"
            + " soient maudits. Je ne cesserai point, pour leur plaire, de me réjouir le cœur, et\n"
            + " je ne t'en croquerai pas moins. Voici donc les dons d'hospitalité que je t'offre,\n"
            + " afin d'être irréprochable devant toi. Un bon feu, et cette marmite de la maison"
            + " de\n"
            + " mes pères, qui te fera bouillir a merveille et le vêtira chaudement. Allons,"
            + " entrez\n"
            + " là-dedans; allez à l'autel du dieu de cette caverne, et préparez-moi un bon"
            + " festin.\n"
            + " ";

    Auteur euripide = new Auteur("Euripide", citation_hécube, 0, "", 80, citation_cyclope,70);
            System.out.println(euripide.getNom());
    String citation_guêpes =
        "TRYGÉE : Tiens, voilà quelqu'un qui s'amène avec une couronne de lauriers sur la tête.\n"
            + "LE SERVITEUR : Qui ça peut-il être ?\n"
            + "TRYGÉE : Il a une tête de charlatan.\n"
            + "LE SERVITEUR : Un devin peut-être ?";

    String citation_thesmophories =
        "La fortune a vite fait de changer en mal et de régner sous une autre face.";

        Auteur aristophane = new Auteur("Aristophane", citation_thesmophories, 5, citation_guêpes, 100, "", 0);
            System.out.println(aristophane.getNom());
    // Ajoutez vos tests ici
    
    // assert 2 == 2;
    System.out.println("TOTO");
    assert euripide.getNom().equals("Euripide");
    assert aristophane.getNom().equals("Aristophane")  ;
    assert sophocle.getNom().equals("Sophocle");
    assert sophocle.getQualité_tragédie() == 95;


    assert sophocle.pointFort() == Style.TRAGÉDIE;
    assert euripide.pointFort() == Style.DRAME;
    assert aristophane.pointFort() == Style.TRAGÉDIE;

    assert sophocle.qualitéStyle(Style.TRAGÉDIE) ==  sophocle.getQualité_tragédie();
    assert sophocle.qualitéStyle(Style.COMÉDIE) ==  sophocle.getQualité_comédie();
    assert sophocle.qualitéStyle(Style.DRAME) ==  sophocle.getQualité_drame();

    assert sophocle.citationStyle(Style.TRAGÉDIE) ==  sophocle.getCitation_tragédie();
    assert aristophane.citationStyle(Style.COMÉDIE) ==  aristophane.getCitation_comédie();
    assert euripide.citationStyle(Style.TRAGÉDIE) ==  euripide.getCitation_tragédie();
      // Création des journées
    
    // Première journée
    Epreuve matin1 = new Epreuve(Style.COMÉDIE, 150);
    Epreuve aprem1 = new Epreuve(Style.DRAME, 80);
    Epreuve soiree1 = new Epreuve(Style.TRAGÉDIE, 200);
    Journée j1 = new Journée(matin1, aprem1, soiree1);

    // Deuxième journée
    Epreuve matin2 = new Epreuve(Style.COMÉDIE, 80);
    Epreuve aprem2 = new Epreuve(Style.DRAME, 100);
    Epreuve soiree2 = new Epreuve(Style.TRAGÉDIE, 35);
    Journée j2 = new Journée(matin2, aprem2, soiree2);

    // Ecrivez vos tests pour la classe Journée ici

    assert j1.scoreAuteur(aristophane) == matin1.auteurScore(aristophane) + aprem1.auteurScore(aristophane) + soiree1.auteurScore(aristophane);
    assert j1.scoreAuteur(euripide) == matin1.auteurScore(euripide) + aprem1.auteurScore(euripide) + soiree1.auteurScore(euripide);
    assert j1.scoreAuteur(sophocle) == matin1.auteurScore(sophocle) + aprem1.auteurScore(sophocle) + soiree1.auteurScore(sophocle);
    System.out.println(j1);
    // Gestion du tournoi
    Tournoi<Auteur> t = new Tournoi<Auteur>("Tournoi des auteurs");
    System.out.println(t);
    // inscription des auteurs
    t.inscrire(euripide);
    t.inscrire(sophocle);
    t.inscrire(aristophane);
    //demarrage du tournoi
    t.débute();
    //lancer le premier match  
  Auteur A = t.participantAProchaineJournée();
  Auteur B = t.participantBProchaineJournée();
  boolean g = j1.gagnant(A, B);
  System.out.println(g);
  System.out.println(A);
  System.out.println(B);
  }


}
