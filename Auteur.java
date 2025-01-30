class Auteur {
  String citation_tragédie;
  int qualité_tragédie;

  String citation_comédie;
  int qualité_comédie;

  String citation_drame;
  int qualité_drame;

  public Auteur(
      String nom,
      int qualité_tragédie,
      String citation_tragédie,
      int qualité_comédie,
      String citation_comédie,
      int qualité_drame,
      String citation_drame) {
    //TODO
  }

  public Style point_fort() {
    if (qualité_tragédie > qualité_comédie) {
      if (qualité_drame > qualité_tragédie) {
        return Style.DRAME;
      } else {
        return Style.TRAGÉDIE;
      }
    } else {
      if (qualité_drame > qualité_comédie) {
        return Style.DRAME;
      } else {
        return Style.COMÉDIE;
      }
    }
  }
}
