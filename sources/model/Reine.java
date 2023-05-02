package model;

public class Reine extends AbstractPiece{

    public Reine(Couleur couleur_de_piece,Coord coord){
        super(couleur_de_piece,coord);
    }
    public boolean isMoveOk(int xFinal, int yFinal){
        int dX = (Math.abs(getX() - xFinal));
        int dY = (Math.abs(getY() - yFinal));
        return xFinal >= 0 && xFinal <= 8 && yFinal >= 0 && yFinal <= 8 && (dX == dY || dX == 0 || dY == 0);
    }
}
