package vue;

import java.awt.Color;
import controler.ChessGameControlers;
import tools.ChessImageProvider;
import model.Couleur;


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class ChessGameGUI extends JFrame implements MouseListener, MouseMotionListener,Observer {
    JLayeredPane layeredPane;
    JPanel chessBoard;
    JLabel chessPiece;
    int xAdjustment;
    int yAdjustment;

    public ChessGameGUI(){
        Dimension boardSize = new Dimension(600, 600);

        //  Use a Layered Pane for this this application
        layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane);
        layeredPane.setPreferredSize(boardSize);
        layeredPane.addMouseListener(this);
        layeredPane.addMouseMotionListener(this);

        //Add a chess board to the Layered Pane

        chessBoard = new JPanel();
        layeredPane.add(chessBoard, JLayeredPane.DEFAULT_LAYER);
        chessBoard.setLayout( new GridLayout(8, 8) );
        chessBoard.setPreferredSize( boardSize );
        chessBoard.setBounds(0, 0, boardSize.width, boardSize.height);

        for (int i = 0; i < 64; i++) {
            JPanel square = new JPanel( new BorderLayout() );
            chessBoard.add( square );

            int row = (i / 8) % 2;
            if (row == 0)
                square.setBackground( i % 2 == 0 ? Color.black : Color.white );
            else
                square.setBackground( i % 2 == 0 ? Color.white : Color.black );
        }

        //Add a few pieces to the board

        JLabel piece = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Tour", Couleur.NOIR)) );
        JPanel panel = (JPanel)chessBoard.getComponent(0);
        panel.add(piece);
        JLabel piece1 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Cavalier", Couleur.NOIR)) );
        JPanel panel1 = (JPanel)chessBoard.getComponent(1);
        panel1.add(piece1);
        JLabel piece2 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Fou", Couleur.NOIR)) );
        JPanel panel2 = (JPanel)chessBoard.getComponent(2);
        panel2.add(piece2);
        JLabel piece3 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Reine", Couleur.NOIR)) );
        JPanel panel3 = (JPanel)chessBoard.getComponent(3);
        panel3.add(piece3);
        JLabel piece4 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Roi", Couleur.NOIR)) );
        JPanel panel4 = (JPanel)chessBoard.getComponent(4);
        panel4.add(piece4);
        JLabel piece5 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Fou", Couleur.NOIR)) );
        JPanel panel5 = (JPanel)chessBoard.getComponent(5);
        panel5.add(piece5);
        JLabel piece6 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Cavalier", Couleur.NOIR)) );
        JPanel panel6 = (JPanel)chessBoard.getComponent(6);
        panel6.add(piece6);
        JLabel piece7 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Tour", Couleur.NOIR)) );
        JPanel panel7 = (JPanel)chessBoard.getComponent(7);
        panel7.add(piece7);

        JLabel piece8 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Pion", Couleur.NOIR)) );
        JPanel panel8 = (JPanel)chessBoard.getComponent(8);
        panel8.add(piece8);
        JLabel piece9 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Pion", Couleur.NOIR)) );
        JPanel panel9 = (JPanel)chessBoard.getComponent(9);
        panel9.add(piece9);
        JLabel piece10 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Pion", Couleur.NOIR)) );
        JPanel panel10 = (JPanel)chessBoard.getComponent(10);
        panel10.add(piece10);
        JLabel piece11 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Pion", Couleur.NOIR)) );
        JPanel panel11 = (JPanel)chessBoard.getComponent(11);
        panel11.add(piece11);
        JLabel piece12 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Pion", Couleur.NOIR)) );
        JPanel panel12 = (JPanel)chessBoard.getComponent(12);
        panel12.add(piece12);
        JLabel piece13 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Pion", Couleur.NOIR)) );
        JPanel panel13 = (JPanel)chessBoard.getComponent(13);
        panel13.add(piece13);
        JLabel piece14 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Pion", Couleur.NOIR)) );
        JPanel panel14 = (JPanel)chessBoard.getComponent(14);
        panel14.add(piece14);
        JLabel piece15 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Pion", Couleur.NOIR)) );
        JPanel panel15= (JPanel)chessBoard.getComponent(15);
        panel15.add(piece15);



        JLabel piece21 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Pion", Couleur.BLANC)) );
        JPanel panel21 = (JPanel)chessBoard.getComponent(48);
        panel21.add(piece21);
        JLabel piece22 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Pion", Couleur.BLANC)) );
        JPanel panel22 = (JPanel)chessBoard.getComponent(49);
        panel22.add(piece22);
        JLabel piece23 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Pion", Couleur.BLANC)) );
        JPanel panel23 = (JPanel)chessBoard.getComponent(50);
        panel23.add(piece23);
        JLabel piece24 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Pion", Couleur.BLANC)) );
        JPanel panel24 = (JPanel)chessBoard.getComponent(51);
        panel24.add(piece24);
        JLabel piece25 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Pion", Couleur.BLANC)) );
        JPanel panel25 = (JPanel)chessBoard.getComponent(52);
        panel25.add(piece25);
        JLabel piece26 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Pion", Couleur.BLANC)) );
        JPanel panel26 = (JPanel)chessBoard.getComponent(53);
        panel26.add(piece26);
        JLabel piece27 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Pion", Couleur.BLANC)) );
        JPanel panel27 = (JPanel)chessBoard.getComponent(54);
        panel27.add(piece27);
        JLabel piece28 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Pion", Couleur.BLANC)) );
        JPanel panel28 = (JPanel)chessBoard.getComponent(55);
        panel28.add(piece28);

        JLabel piece29 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Tour", Couleur.BLANC)) );
        JPanel panel29 = (JPanel)chessBoard.getComponent(56);
        panel29.add(piece29);
        JLabel piece30 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Cavalier", Couleur.BLANC)) );
        JPanel panel30 = (JPanel)chessBoard.getComponent(57);
        panel30.add(piece30);
        JLabel piece31 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Fou", Couleur.BLANC)) );
        JPanel panel31 = (JPanel)chessBoard.getComponent(58);
        panel31.add(piece31);
        JLabel piece32 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Reine", Couleur.BLANC)) );
        JPanel panel32 = (JPanel)chessBoard.getComponent(59);
        panel32.add(piece32);
        JLabel piece33 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Roi", Couleur.BLANC)) );
        JPanel panel33 = (JPanel)chessBoard.getComponent(60);
        panel33.add(piece33);
        JLabel piece34 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Fou", Couleur.BLANC)) );
        JPanel panel34 = (JPanel)chessBoard.getComponent(61);
        panel34.add(piece34);
        JLabel piece35 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Cavalier", Couleur.BLANC)) );
        JPanel panel35 = (JPanel)chessBoard.getComponent(62);
        panel35.add(piece35);
        JLabel piece36 = new JLabel( new ImageIcon(ChessImageProvider.getImageFile("Tour", Couleur.BLANC)) );
        JPanel panel36= (JPanel)chessBoard.getComponent(63);
        panel36.add(piece36);

    }

    public ChessGameGUI(String s, ChessGameControlers chessGameControler, Dimension dim) {
    this();
    }

    public void mousePressed(MouseEvent e){
        chessPiece = null;
        Component c =  chessBoard.findComponentAt(e.getX(), e.getY());

        if (c instanceof JPanel)
            return;

        Point parentLocation = c.getParent().getLocation();
        xAdjustment = parentLocation.x - e.getX();
        yAdjustment = parentLocation.y - e.getY();
        chessPiece = (JLabel)c;
        chessPiece.setLocation(e.getX() + xAdjustment, e.getY() + yAdjustment);
        chessPiece.setSize(chessPiece.getWidth(), chessPiece.getHeight());
        layeredPane.add(chessPiece, JLayeredPane.DRAG_LAYER);
    }

    //Move the chess piece around

    public void mouseDragged(MouseEvent me) {
        if (chessPiece == null) return;
        chessPiece.setLocation(me.getX() + xAdjustment, me.getY() + yAdjustment);
    }

    //Drop the chess piece back onto the chess board

    public void mouseReleased(MouseEvent e) {
        if(chessPiece == null) return;

        chessPiece.setVisible(false);
        Component c =  chessBoard.findComponentAt(e.getX(), e.getY());

        if (c instanceof JLabel){
            Container parent = c.getParent();
            parent.remove(0);
            parent.add( chessPiece );
        }
        else {
            Container parent = (Container)c;
            parent.add( chessPiece );
        }

        chessPiece.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {

    }
    public void mouseMoved(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e){

    }
    public void mouseExited(MouseEvent e) {

    }
    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub
    }

}