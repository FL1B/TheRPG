package Game;

public class Prompts
{
    public static void startGame() {
        System.out.println("Welcome to The RPG!");
        System.out.println("");
        System.out.println("You wake up in a dim lit, moist cave, the walls");
        System.out.println("and floor are made of stone and cold to the touch.");
        System.out.println("you see a flickering light far away in the distance");
        System.out.println("");
        System.out.println("What would you like to do? -");
        listOfCommands();
    }

    public static void gamePlay() {

    }

    public static void listOfCommands() {
        System.out.println("Commands:");
        System.out.println(" - Move forward");
        System.out.println(" - Move left");
        System.out.println(" - Move right");
        System.out.println(" - Move backwards");
        System.out.println(" - Search area");
        System.out.println(" - Use item");
        System.out.println(" - Help (list of commands)");
        System.out.println("");
    }
}
