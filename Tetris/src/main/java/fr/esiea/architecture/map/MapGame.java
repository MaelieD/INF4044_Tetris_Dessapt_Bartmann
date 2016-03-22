package fr.esiea.architecture.map;


import fr.esiea.architecture.movement.Movement;
import fr.esiea.architecture.movement.MovementValidator;
import fr.esiea.architecture.printer.Printable;

import java.util.Collection;

/**
 * Created by Maélie on 22/03/2016.
 */
public class MapGame implements Printable {

    private boolean loose = false;
    private MovingPiece piece;
    MovementValidator movementValidator;

    public boolean isNotLoose() {
        return !loose;
    }

    public void applyMovements(Collection<Movement> movements) {
        for (Movement movement : movements) {
            movement.move(movementValidator,piece);
        }
    }
}
