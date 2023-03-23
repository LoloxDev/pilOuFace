public class Piece {

    public String coteVisible;
    public Piece(){

        coteVisible = (Math.random() <= 0.5) ? "Pile" : "Face";

    }

    public static Piece lancerUnePiece(){

        return new Piece();

    }

}
