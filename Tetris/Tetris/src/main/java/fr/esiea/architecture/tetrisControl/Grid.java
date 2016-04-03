package fr.esiea.architecture.tetrisControl;
import fr.esiea.architecture.tetrisGame.PieceFormat;
import fr.esiea.architecture.tetrisGame.TetrisPiece;
import fr.esiea.architecture.tetrisGame.Tetrominoes;
import fr.esiea.architecture.tetrisVisualData.Tetris;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;



public class Grid extends JPanel implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int score;
    private Timer remainingTime;
    private Boolean gameOver = false;
    private PieceFormat[] grid;
    private Boolean isCollision;
    private Tetrominoes tetrisPiece;
    private int positionX;
    private int positionY;
    int gridWidth = 20;
    int gridHeigh = 20;


    public Grid(Tetris tetris) {

        score = 0;
        isCollision = false;
        tetris.setScoreInName(score);

        remainingTime = new Timer(600,this);
        remainingTime.start();

    }


    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(isCollision == true){
            addRandomPiece();
            isCollision = false;
        } else {
            lineDown();
        }
    }


    private void lineDown() {
        // TODO Auto-generated method stub

    }


    private void addRandomPiece() {
        tetrisPiece = (Tetrominoes) new TetrisPiece();

    }

    public int getScore(){
        return score;
    }

}

