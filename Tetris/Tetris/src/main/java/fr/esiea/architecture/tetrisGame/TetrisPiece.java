package fr.esiea.architecture.tetrisGame;

import java.util.Random;

public class TetrisPiece {

    private PieceFormat piece;
    private int pieceMatrice[][];

    // Utilisation du Design PATTERN BUILDER afin de pouvoir forcer le format d'une piece a la création
    @SuppressWarnings("static-access")
    public TetrisPiece(){
        pieceMatrice = new int[4][2];
        setPieceFormat(piece.noForm);
    }
    public TetrisPiece withForm(PieceFormat piece){
        pieceMatrice = new int[4][2];
        setPieceFormat(piece);
        return this;
    }
    public TetrisPiece build(){
        return new TetrisPiece();
    }


    @SuppressWarnings("static-access")
    public void randomPiece(){
        int random = Math.abs(new Random().nextInt())%7+1;
        setPieceFormat(piece.values()[random]);
    }

    private void setPieceFormat(PieceFormat piece) {

        switch (piece) {
            case noForm:
                pieceMatrice = new int[][] {{0,0},{0,0},{0,0},{0,0}};
                break;
            case Zform:
                pieceMatrice = new int[][] {{0,-1},{0,0},{-1,0},{-1,1}};
                break;
            case Sform:
                pieceMatrice = new int[][] {{0,-1},{0,0},{1,0},{1,1}};
                break;
            case Longform:
                pieceMatrice = new int[][] {{0,-1},{0,0},{0,1},{0,2}};
                break;
            case tform:
                pieceMatrice = new int[][] {{-1,0},{0,0},{1,0},{0,1}};
                break;
            case Oform:
                pieceMatrice = new int[][] {{0,0},{1,0},{0,1},{1,1}};
                break;
            case Lform:
                pieceMatrice = new int[][] {{-1,-1},{0,-1},{0,0},{0,1}};
                break;
            case invertLform:
                pieceMatrice = new int[][] {{1,-1},{0,-1},{0,0},{0,1}};
                break;
            default:
                pieceMatrice = new int[][] {{0,0},{0,0},{0,0},{0,0}};
                break;
        }
        this.piece = piece;
    }

    public TetrisPiece rotate(String side){

        RotatePiece resultPiece= new RotatePiece();
        resultPiece.rotate(this);
        return resultPiece;
    }
    public PieceFormat getPieceFormat(){
        return piece;
    }

    public void setCoordonateX(int index, int x){
        pieceMatrice[index][0]=x;
    }
    public void setCoordonateY(int index, int y){
        pieceMatrice[index][1]=y;
    }
    public int getCoordonateX(int index){
        return pieceMatrice[index][0];
    }
    public int getCoordonateY(int index){
        return pieceMatrice[index][1];
    }



}


