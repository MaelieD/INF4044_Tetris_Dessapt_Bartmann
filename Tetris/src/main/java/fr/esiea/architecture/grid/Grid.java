package fr.esiea.architecture.grid;

import fr.esiea.architecture.tetromino.Piece;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Maélie on 23/03/2016.
 */
public class Grid extends JPanel {

    Grid() {
        setFocusable(true);
        add(new Piece());
    }

    public static Grid getNewInstance(){
        return new Grid();
    }

    public void start() {
    }
}
