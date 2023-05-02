package model;

public class Cavalier extends AbstractPiece{

    public Cavalier(Couleur couleur_de_piece,Coord coord){

        super(couleur_de_piece,coord);
    }
    public boolean isMoveOk(int xFinal, int yFinal){
        int dX = (Math.abs(getX() - xFinal));
        int dY = (Math.abs(getY() - yFinal));
        if (xFinal>=0 && xFinal<=8 && yFinal>=0 && yFinal<=8 && (dX==2 && dY ==1 || dX == 1 && dY ==2)){
            return true;
        }
        return false;
    }
}