package tictactoe;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        String filePath = "C:/Users/user/Desktop/tictacotoe.txt";
        List<Game> games = new GameFactory().getGamesFromFile(filePath);
        for (Game game : games) {
            System.out.println(game.getWinner().toString());
        }
        
        
    }
}
