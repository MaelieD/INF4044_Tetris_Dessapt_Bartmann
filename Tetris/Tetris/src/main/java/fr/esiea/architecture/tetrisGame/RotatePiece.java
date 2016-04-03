package fr.esiea.architecture.tetrisGame;

public class RotatePiece extends TetrisPiece{


    public RotatePiece() {

    }

    public TetrisPiece rotate(TetrisPiece tetrisPiece){
        if (tetrisPiece.getPieceFormat() == PieceFormat.Oform)
            return tetrisPiece;
        TetrisPiece rotatedPiece = tetrisPiece;

        for(int i = 0; i< 4; i++){
            rotatedPiece.setCoordonateX(i, tetrisPiece.getCoordonateY(i));
            rotatedPiece.setCoordonateY(i, -1*tetrisPiece.getCoordonateX(i));
        }

        return rotatedPiece;

    }


}