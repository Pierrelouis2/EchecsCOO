package model;

import java.util.Objects;

public  class Echiquier implements BoardGames {
    private Jeu jeuBlanc;
    private Jeu jeuNoir;
    private Jeu jeuCourant;
    private Jeu jeuNoncourant;
    private String message;
    private Jeu ;

    public Echiquier(){
        this.jeuBlanc = new Jeu(Couleur.BLANC);
        this.jeuNoir = new Jeu(Couleur.NOIR);
        this.jeuCourant = jeuBlanc;
        this.jeuNoncourant = jeuNoir;
    }
    public String getmessage() {
        return message;
    }
    private void setMessage() {
        this.message = toString();
    }
    @Override
    public String toString(){
        String ret = jeuBlanc.toString() + '\n' + '\n';
        ret += jeuNoir.toString() + '\n' + '\n';
        ret += jeuCourant.toString() + '\n' + '\n';
        ret += jeuNoncourant.toString() + '\n' + '\n';
        return ret;
    }

    @Override
    public boolean move(int xInit, int yInit, int xFinal, int yFinal) {
        return false;
    }

    @Override
    public boolean isEnd() {
        return false;
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public Couleur getColorCurrentPlayer() {
        return null;
    }

    @Override
    public Couleur getPieceColor(int x, int y) {
        return null;
    }
    public void switchJoueur(){
        Jeu jeuPivot;
        jeuPivot = jeuCourant;
        jeuCourant = jeuNoncourant;
        jeuNoncourant = jeuPivot;
    }
    public boolean obstacle(){
        return false;
    }
    public boolean isMoveOk(int xInit, int yInit, int xFinal, int yFinal){
        if(jeuCourant.isPieceHere(xInit,yInit)){
            if(jeuCourant.isMoveOk(xInit, yInit, xFinal, yFinal)){
                if(!obstacle() || (Objects.equals(jeuCourant.getPieceType(xInit, yInit), "Cavalier"))){
                    if(!jeuCourant.isPieceHere(xFinal,yFinal) || (Objects.equals(jeuCourant.getPieceType(xInit, yInit), "Roi"))){

                    }

                }
            };
        }
    }
    public static void main(String[] args) {
        Echiquier echiquier = new Echiquier();
        System.out.println(echiquier);
        echiquier.switchJoueur();
        System.out.println(echiquier);

    }
}
