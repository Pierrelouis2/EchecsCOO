package model;

public class Tour extends AbstractPiece{

    public Tour(Couleur couleur_de_piece,Coord coord){
        super(couleur_de_piece,coord);
    }

    public boolean isMoveOk(int xFinal, int yFinal){
        if (xFinal>=0 && xFinal<=8 && yFinal>=0 && yFinal<=8 && (getX() == xFinal || getY() == yFinal)){
            return getX() != xFinal || getY() != yFinal;
        }
        return false;
    }
}
