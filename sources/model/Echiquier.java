package model;

public abstract class Echiquier implements BoardGames {
    private Jeu jeuBlanc;
    private Jeu jeuNoir;
    private Jeu jeuCourant;
    private Jeu jeuNoncourant;
    private String message;

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

    public static void main(String[] args) {
        Echiquier echiquier = new Echiquier();


    }



}
