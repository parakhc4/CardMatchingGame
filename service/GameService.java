package service;

import model.*;
import model.enums.CardStatus;

public class GameService {
    private User user;
    private Game game;
    
    public Game startGame(String name, int gridSize){
        this.user = new User(name);
        this.game = new Game(gridSize);
        return game;
    }

    public boolean checkMatch(Card card){
        return card.getCardNumber() == game.getFirstFlippedCard().getCardNumber();
    }

    public boolean checkWin(){
        Grid grid = this.game.getGrid();
        Card[][] cards = grid.getGrid();

        for(int i = 0; i < grid.getGridSize(); i++){
            for(Card card : cards[i]){
                if(card.getCardStatus() != CardStatus.MATCHED){
                    return false;
                }
            }
        }
        return true;
    }

    public TurnResult playTurn(int row, int col){
        Grid grid = this.game.getGrid();
        Card[][] cards = grid.getGrid();

        if(cards[row][col].getCardStatus() != CardStatus.HIDDEN){
            return new TurnResult(null, null, null);
        }

        Card curr_card = cards[row][col];

        if(game.getFirstFlippedCard() != null){
            if(game.getFirstFlippedCard().getCardNumber() == curr_card.getCardNumber()){
                game.getFirstFlippedCard().setCardStatus(CardStatus.MATCHED);
                curr_card.setCardStatus(CardStatus.MATCHED);
                game.setCurrentScore(game.getCurrentScore() + 1);
                game.setFirstFlippedCard(null);
                boolean winStatus = checkWin();
                return new TurnResult(curr_card, true, winStatus);
            } else {
                game.getFirstFlippedCard().setCardStatus(CardStatus.HIDDEN);
                curr_card.setCardStatus(CardStatus.HIDDEN);
                game.setFirstFlippedCard(null);
                return new TurnResult(curr_card, false, false);
            }
        }

        // first flip
        game.setFirstFlippedCard(curr_card);
        curr_card.setCardStatus(CardStatus.REVEALED);
        return new TurnResult(curr_card, null, false);
    }
}