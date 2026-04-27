package service;

import model.*;
public class GameService {
    private User user;
    private Game game;
    
    public Game startGame(String name, int gridSize){
        this.user = new User(name);
        this.game = new Game(gridSize);
        return game;
    }

    public TurnResult playTurn(int row, int col){
    }
}
