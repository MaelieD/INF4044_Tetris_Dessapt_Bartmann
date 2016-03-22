package fr.esiea.architecture.movement;

/**
 * Created by Maélie on 22/03/2016.
 */
public interface Movable {
    void goDown(MovementValidator movementValidator);

    void goRight(MovementValidator movementValidator);

    void turnLeft(MovementValidator movementValidator);
}
