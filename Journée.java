class Journée {
   private Epreuve epreuveMatin;
   private Epreuve epreuveAprèsMidi;
    private Epreuve epreuveSoirée;
    public Journée(Epreuve epreuveMatin, Epreuve epreuveAprèsMidi, Epreuve epreuveSoirée) {
        this.epreuveMatin = epreuveMatin;
        this.epreuveAprèsMidi = epreuveAprèsMidi;
        this.epreuveSoirée = epreuveSoirée;
    }
    public Epreuve getEpreuveMatin() {
        return epreuveMatin;
    }
    public Epreuve getEpreuveAprèsMidi() {
        return epreuveAprèsMidi;
    }
    public Epreuve getEpreuveSoirée() {
        return epreuveSoirée;
    }
   /*  #todo : deux fonction  1er : scoreTotalAuteur  param : 1auteur
    * 2eme fonctions gagnant pram : 2 auteur renvoie Vrai si auteur 1 gagne 

    */
    public int scoreAuteur( Auteur a) {
        int scoreMatin = this.epreuveMatin.auteurScore(a);
        int scoreApr = this.epreuveAprèsMidi.auteurScore(a);
        int scoreSoir = this.epreuveSoirée.auteurScore(a);
            return scoreMatin + scoreApr + scoreSoir;
}
    public boolean gagnant(Auteur a, Auteur b) {
       return this.scoreAuteur(a) >= this.scoreAuteur(b);
    }    
}
