package fr.esiea.architecture.core;

import fr.esiea.architecture.grid.Grid;
import fr.esiea.architecture.printer.Printer;

/**
 * Created by Maélie on 23/03/2016.
 */
public class TetrisCore {
    public void run() {
        Grid grid = Grid.getNewInstance();
        Printer printer = Printer.getNewInstance();
        printer.addGrid(grid);
    }
}
