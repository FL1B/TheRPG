package Game;

import java.util.Scanner;

public class Prompts
{
    static Scanner scanner = new Scanner(System.in);
    static boolean askAgain = true;
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
        do {
            String input = scanner.nextLine();

            switch (input.toLowerCase()) {
                case "move forward":
                    Movement.moveForward();
                    break;

                case "move left":
                    Movement.moveLeft();
                    break;

                case "move right":
                    Movement.moveRight();
                    break;

                case "move backwards":
                    Movement.moveBackwards();
                    break;

                case "search area":
                    System.out.println("Searched area");
                    break;

                case "use item":
                    System.out.println("Item used");
                    break;

                case "help":
                    listOfCommands();
                    break;

                default:
                    System.out.println("Invalid command. Please try again.");
                    System.out.println("Type 'help' for list of commands.");
            }
        } while (askAgain);
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
    }
}
