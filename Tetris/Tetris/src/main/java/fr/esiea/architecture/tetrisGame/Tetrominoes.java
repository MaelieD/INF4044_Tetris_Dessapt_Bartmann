package fr.esiea.architecture.tetrisGame;

/* Permet de rajouter plus tard des fonctionnalitées/ types de piece sans modifier le code */
public interface Tetrominoes {

     void randomPiece();
     TetrisPiece rotate(String side);
     int getCoordonateX(int index);
     int getCoordonateY(int index);
}