import java.util.Scanner;
public class Jeu {

    static int nbDeJeux = 0;
    static int cpt1;
    static int cpt2;
    static Joueur joueur1;
    static Joueur joueur2;

    public static void main(String[] args) {

        Jeu newJeu = new Jeu();

        while (nbDeJeux <= 100) {
            newJeu.lancerUnePiece(joueur1);
            newJeu.lancerUnePiece(joueur2);
        }
        newJeu.youWin(joueur1, joueur2);
    }

    public Jeu(){

        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Joueur 1, veuillez saisir votre pseudo");
        String nameP1 = lectureClavier.nextLine();
        System.out.println("Joueur 2, veuillez saisir votre pseudo");
        String nameP2 = lectureClavier.nextLine();

        joueur1 = new Joueur(nameP1,"Face");
        joueur2 = new Joueur(nameP2,"Pile");

    }

    public void lancerUnePiece(Joueur player){

        Piece piece = Piece.lancerUnePiece();
        if(piece.coteVisible == player.face){
            player.setCpt((player.getCpt()+1));
            System.out.println("La pièce de " + player.nom + " est tombée sur " + piece.coteVisible + ", il a gagné " + player.getCpt() + " fois.");
        } else {
            System.out.println(player.nom + " n'a pas de chance ! ");
        }

        nbDeJeux++;

    }

    public void youWin(Joueur player1, Joueur player2){

        if (player1.cpt > player2.cpt){
            System.out.println("Le joueur " + player1.nom+ " Remporte la partie");
        } else if (player2.cpt > player1.cpt) {
            System.out.println("Le joueur " + player2.nom + " Remporte la partie");
        } else {
            System.out.println("Egalité");
        }
        System.exit(0);
    }

}
