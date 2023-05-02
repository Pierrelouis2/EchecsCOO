package model;

public interface Pieces {
    public boolean capture();

    public Couleur getCouleur();

    public boolean move(int xFinal, int yFinal);

    public int getX();

    public int getY();

    boolean isMoveOk(int xFinal, int yFinal);

}
