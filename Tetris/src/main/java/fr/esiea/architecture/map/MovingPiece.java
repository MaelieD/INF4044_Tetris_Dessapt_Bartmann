package fr.esiea.architecture.map;

import fr.esiea.architecture.domain.Position;
import fr.esiea.architecture.movement.Movable;
import fr.esiea.architecture.movement.MovementValidator;
import fr.esiea.architecture.tetromino.Tetromino;

import java.util.Collection;
import java.util.Set;

/**
 * Created by Maélie on 22/03/2016.
 */
class MovingPiece implements Movable {

    private Position position;
    private Tetromino tetromino;

    MovingPiece(Position position, Tetromino tetromino) {
        this.position = position;
        this.tetromino = tetromino;
    }

    public void goDown(MovementValidator movementValidator) {
        Position newPosition = position.getUnderPosition();
        if(movementValidator.isValid(getNewPosition(tetromino,newPosition)))
            position = newPosition;
    }

    public void goRight(MovementValidator movementValidator) {

    }

    public void turnLeft(MovementValidator movementValidator) {
        Tetromino newTetromino = position.getLeftTetromino();
        if(movementValidator.isValid(getNewPosition(newTetromino,position)))
            tetromino = newTetromino;
    }

    private Set<Position> getNewPosition(Tetromino tetromino, Position newPosition) {
        return Collection.EMPTY_SET;
    }
}
