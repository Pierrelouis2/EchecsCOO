package model;

public abstract class AbstractPiece implements Pieces{
    private String name;
    private Couleur couleur;
    private Coord coord;
    public AbstractPiece(Couleur couleur, Coord coord){
        this.couleur = couleur;
        this.coord = coord;
        this.name = this.getClass().getSimpleName();
    }

    public int getX(){
        return this.coord.x;
    }
    public int getY(){
        return this.coord.y;
    }
    public Couleur getCouleur(){
        return this.couleur;
    }
    public boolean move(int x, int y){
        if(isMoveOk(x,y)){
            this.coord.x = x;
            this.coord.y = y;
            return true;
        }
        return false;
    }
    public boolean capture(){
        //TODO
        return false;
    }
    public abstract boolean isMoveOk(int xFinal, int yFinal);

    @Override
    public String toString() {
        return "Piece : " + this.name + " Couleur : " + this.couleur + " Coord : " + this.coord;
    }

    public static void main(String[] args){
        Cavalier cavalier = new Cavalier(Couleur.NOIR,new Coord(4,4));
        System.out.println(cavalier.isMoveOk(2,1));
        //testPieceMove(cavalier);

    }
    private static void testPieceMove(Pieces piece) {
        System.out.println(piece);
        System.out.println("  a b c d e f g h");
        for (int j = 0; j < 8; j++) {
            String line = (j + 1) + " ";
            for (int i = 0; i < 8; i++) {
                if (piece.getX() == i && piece.getY() == j) {
                    line += "x";
                } else {
                    line += (piece.isMoveOk(i, j) ? "O" : ".");
                }
                line += " ";
            }
            System.out.println(line);
        }
        System.out.println("\n");
    }
}
