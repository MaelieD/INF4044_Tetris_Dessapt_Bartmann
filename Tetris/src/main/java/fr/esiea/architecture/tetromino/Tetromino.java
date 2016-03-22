package fr.esiea.architecture.tetromino;

import fr.esiea.architecture.domain.Position;
import java.util.Set;

/**
 * Created by Maélie on 22/03/2016.
 */
public interface Tetromino {
    void turnLeft();
    void turnRight();

    Set<Position> getRelativePosition();
}
