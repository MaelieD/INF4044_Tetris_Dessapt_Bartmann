import domain.Player;

/**
 * Created by Maélie on 07/03/2016.
 */
public class Main {

    public static String name = "Maelie";

    public static void main(String[] args){
        int var = 0;
        System.out.println("var = " + var++ + " var = " + var + " var = " + ++var);
        Player p = Player.getNewInstance(name);
        System.out.println(p.getName());
    }

}
