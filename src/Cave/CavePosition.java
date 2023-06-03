package Cave;

import java.util.ArrayList;

public class CavePosition
{
    // Fields
    public static int minCaveDirections = 1;
    public static int maxCaveDirections = 4;
    public static ArrayList<String> levels = new ArrayList<>();
    static {
        levels.add("dim lit");
        levels.add("dark");
        levels.add("darker");
        levels.add("pitch black");
        levels.add("burning hell");
    }

    /*
    public static int directionsRandom() {
        
    } */
}
