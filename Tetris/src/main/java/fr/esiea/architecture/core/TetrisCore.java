package fr.esiea.architecture.core;

import fr.esiea.architecture.map.MapGame;
import fr.esiea.architecture.movement.InputReader;
import fr.esiea.architecture.movement.Movement;
import fr.esiea.architecture.printer.Printer;

import java.util.List;

/**
 * Created by Maélie on 22/03/2016.
 */
public class TetrisCore {

    private final InputReader inputReader;
    private final MapGame mapGame;
    private final Printer printer;

    public TetrisCore(InputReader inputReader, MapGame mapGame, Printer printer) {
        this.inputReader = inputReader;
        this.mapGame = mapGame;
        this.printer = printer;
    }

    public void run() {
        while(mapGame.isNotLoose()) {
            List<Movement> movements = inputReader.getMovements();
            // and you move down
            movements.add(movements.DOWN);
            mapGame.applyMovements(movements);
            Printer.print(mapGame);
        }

    }
}
