package model;

import model.enums.*;

public class Game {
    private int currentScore;
    private Grid grid;
    private Card firstFlippedCard;
    private GameStatus gameStatus;

    public Game(int gridSize){
        this.grid = new Grid(gridSize);
        
    }   

    public int getCurrentScore() {
        return this.currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public Grid getGrid() {
        return this.grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public Card getFirstFlippedCard() {
        return this.firstFlippedCard;
    }

    public void setFirstFlippedCard(Card firstFlippedCard) {
        this.firstFlippedCard = firstFlippedCard;
    }

    public GameStatus getGameStatus() {
        return this.gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }


}
