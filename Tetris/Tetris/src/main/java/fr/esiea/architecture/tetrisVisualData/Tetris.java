package fr.esiea.architecture.tetrisVisualData;


import fr.esiea.architecture.tetrisControl.Grid;

import javax.swing.JFrame;


public class Tetris extends JFrame{

    JFrame window;


    public Tetris(){
        window = new JFrame();
        window.setSize(400,400);
        window.setTitle("Bienvenue dans mon TETRIS");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void setScoreInName(int score){
        window.setTitle(Integer.toString(score));
    }


    public void addgrid(Grid gameGrid) {
        // TODO Auto-generated method stub

    }

}
