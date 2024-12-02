/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjackgroupproject;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author sebas
 */
public class Deck {
    // I created an ArrayList called cards that holds the cards in the deck, and each card is an object of the Card class.
    private List<Card> cards = new ArrayList<>();

    // I made a public constructor called Deck.
    public Deck() {
        // In this constructor I created the lists. Suits contains all the suits the cards can be: Hearts, Diamonds, Clubs, and Spades.
        // My next list is called cardNames; this list contains all the names of the cards from 2 all the way to Ace.
        // My last list I created is called values. This list contains all the values for each card.
        // 10, Jack, Queen, and King all have the same value because that is how the values work in Blackjack, and Ace has the value of 11.
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] cardNames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

        // I then created a for loop, which takes the object suit from the suits list and iterates over all the suits and card names.
        // For each suit, it creates a new Card object with a name, suit, and value, and adds it to the cards ArrayList.
        for (String suit : suits) {
            for (int i = 0; i < cardNames.length; i++) {
                cards.add(new Card(suit, cardNames[i], values[i]));
            }
        }

        // This method randomizes the order of the cards in the deck, so the card chosen will always be random.
        Collections.shuffle(cards);
    }

    // This method removes and returns the top card from the deck. If the deck is empty, it returns null.
    public Card dealCard() {
        return cards.isEmpty() ? null : cards.remove(0);
    }

    // This method checks if the deck is empty.
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    // This method allows reshuffling the deck.
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }
}
