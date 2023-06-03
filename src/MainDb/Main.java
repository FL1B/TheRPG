package MainDb;

import Game.Prompts;

public class Main
{
    public static void main(String[] args) {
        MyJDBC.getConnection();
        Game.Prompts.startGame();
        Game.Prompts.gamePlay();
    }
}
