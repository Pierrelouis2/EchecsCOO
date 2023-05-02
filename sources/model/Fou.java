package model;

public class Fou extends AbstractPiece{

    public Fou(Couleur couleur_de_piece,Coord coord){
        super(couleur_de_piece,coord);
    }

    public boolean isMoveOk(int xFinal, int yFinal){
        int dX = (Math.abs(getX() - xFinal));
        int dY = (Math.abs(getY() - yFinal));
        if (xFinal>=0 && xFinal<=8 && yFinal>=0 && yFinal<=8 && (dX==dY)){
            return true;
        }
        return false;
    }
}
