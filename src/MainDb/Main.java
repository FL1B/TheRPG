package MainDb;

public class Main
{
    public static void main(String[] args) {
        MyJDBC.getConnection();
        Game.Prompts.startGame();
    }
}
