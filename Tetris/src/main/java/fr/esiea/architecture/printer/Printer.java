package fr.esiea.architecture.printer;

import fr.esiea.architecture.grid.Grid;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Maélie on 23/03/2016.
 */
public class Printer extends JFrame{

    JLabel label;

    Printer(){
        label = new JLabel(" 0");
        add(label, BorderLayout.SOUTH);
        setSize(300,500);
        setTitle("Tetris");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static Printer getNewInstance() {
        return new Printer();
    }

    public void addGrid(Grid grid) {
        add(grid);
        grid.start();
    }
}
