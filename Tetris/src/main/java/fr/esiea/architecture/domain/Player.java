package fr.esiea.architecture.domain;

/**
 * Created by Maélie on 08/03/2016.
 */
public class Player {
    private static String name;

    public Player(String name) {
        this.name = name;
    }

    public static Player getNewInstance(String name) {
        return new Player(name);
    }

    //boobs

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
