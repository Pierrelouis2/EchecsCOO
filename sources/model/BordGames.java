package model;

public interface BordGames {
    boolean move(int xInit, int yInit, int xFinal, int yFinal);
    boolean isEnd();
    java.lang.String getMessage();
    Couleur getColorCurrentPlayer();
    Couleur getPieceColor(int x,int y);
}
