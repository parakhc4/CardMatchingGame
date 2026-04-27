package model;

import model.enums.*;
import java.util.Random;

public class Card {
    private Long id;
    private int cardNumber;
    private CardStatus cardStatus;
    private Random r = new Random();
    
    public Card(int cardNumber){
        this.id = r.nextLong();
        this.cardStatus=CardStatus.HIDDEN;
        this.cardNumber = cardNumber;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CardStatus getCardStatus() {
        return this.cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", cardNumber='" + getCardNumber() + "'" +
            ", cardStatus='" + getCardStatus() + "'" +
            ", r='" + getR() + "'" +
            "}";
    }

    public Random getR() {
        return this.r;
    }

    public void setR(Random r) {
        this.r = r;
    }
}
