package fr.esiea.architecture;

import fr.esiea.architecture.core.TetrisCore;
import fr.esiea.architecture.map.MapGame;
import fr.esiea.architecture.movement.InputReader;
import fr.esiea.architecture.printer.Printer;

/**
 * Created by Maélie on 07/03/2016.
 */
public class Main {

    //public static String name = "Maelie";

    public static void main(String[] args){
        InputReader inputReader = null;
        MapGame mapGame = null;
        Printer printer = null;
        TetrisCore tetrisCore = new TetrisCore(inputReader, mapGame, printer);
        tetrisCore.run();
        /*int var = 0;
        System.out.println("var = " + var++ + " var = " + var + " var = " + ++var);
        Player p = Player.getNewInstance(name);
        System.out.println(p.getName());*/
    }

}
