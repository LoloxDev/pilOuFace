public class Joueur {
    public String nom;
    public String face;
    public int cpt = 0;

    public Joueur(String joueur, String face) {
        this.nom = joueur;
        this.face = face;
        System.out.println(joueur + " joue avec la face : " + face);
    }

    public void setCpt(int cpt) {
        this.cpt = cpt;
    }
    public int getCpt() {
        return cpt;
    }
}
