package fr.esiea.architecture;


import fr.esiea.architecture.tetrisControl.Grid;
import fr.esiea.architecture.tetrisVisualData.Player;
import fr.esiea.architecture.tetrisVisualData.Tetris;

public class Main {

    public static void main(String[] args) {
        //Create New Player
        Player player = new Player("Cordelia");
        //Create a new game
        Tetris tetris = new Tetris();
        // Create a board
        Grid gameGrid = new Grid(tetris);
        //add the board in the game
        tetris.addgrid(gameGrid);
        //When game is over update the player score
        player.updateScore(gameGrid.getScore());
        //Save player score
        player.saveScore();
    }

}
