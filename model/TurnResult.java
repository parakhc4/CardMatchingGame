package model;
import java.util.Objects;

public class TurnResult {
    private Card flippedCard;
    private Boolean isMatch;     
    private Boolean isGameComplete;


    public TurnResult(Card flippedCard, Boolean isMatch, Boolean isGameComplete) {
        this.flippedCard = flippedCard;
        this.isMatch = isMatch;
        this.isGameComplete = isGameComplete;
    }

    public Card getFlippedCard() {
        return this.flippedCard;
    }

    public void setFlippedCard(Card flippedCard) {
        this.flippedCard = flippedCard;
    }

    public Boolean isIsMatch() {
        return this.isMatch;
    }

    public Boolean getIsMatch() {
        return this.isMatch;
    }

    public void setIsMatch(Boolean isMatch) {
        this.isMatch = isMatch;
    }

    public Boolean isIsGameComplete() {
        return this.isGameComplete;
    }

    public Boolean getIsGameComplete() {
        return this.isGameComplete;
    }

    public void setIsGameComplete(Boolean isGameComplete) {
        this.isGameComplete = isGameComplete;
    }

    public TurnResult flippedCard(Card flippedCard) {
        setFlippedCard(flippedCard);
        return this;
    }

    public TurnResult isMatch(Boolean isMatch) {
        setIsMatch(isMatch);
        return this;
    }

    public TurnResult isGameComplete(Boolean isGameComplete) {
        setIsGameComplete(isGameComplete);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TurnResult)) {
            return false;
        }
        TurnResult turnResult = (TurnResult) o;
        return Objects.equals(flippedCard, turnResult.flippedCard) && Objects.equals(isMatch, turnResult.isMatch) && Objects.equals(isGameComplete, turnResult.isGameComplete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flippedCard, isMatch, isGameComplete);
    }

    @Override
    public String toString() {
        return "{" +
            " flippedCard='" + getFlippedCard() + "'" +
            ", isMatch='" + isIsMatch() + "'" +
            ", isGameComplete='" + isIsGameComplete() + "'" +
            "}";
    }
    
}