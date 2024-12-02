package com.mycompany.blackjackgroupproject;

public class Card {
    private String suit;
    private String cardName;
    private int value;

    // Constructor
    public Card(String suit, String cardName, int value) {
        this.suit = suit;
        this.cardName = cardName;
        this.value = value;
    }

    // Getters and setters
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Method to represent the card as a string
    @Override
    public String toString() {
        return cardName + " of " + suit + " (Value: " + value + ")";
    }
}
