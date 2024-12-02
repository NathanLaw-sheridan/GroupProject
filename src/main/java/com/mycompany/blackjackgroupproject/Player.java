/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjackgroupproject;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class Player {
    
    // Here I am making a private List from the Card class called hand and I'm setting it as an ArrayList.
    // All cards will be added to the player's hand list.
    // Then I made a private int called score and I set the default score to zero; this will keep track of the total score.
    private List<Card> hand = new ArrayList<>();
    private int score = 0;
    
    // This is my addCard method. It will add a Card object to the player's hand and then update their score
    // because each card has its own value. I then made an if statement that checks if the card added is not null.
    // If the card is valid, it gets added to the player's hand, and the score gets updated by adding the value of the card
    // using the .getValue() function.
    // Additionally, if the score exceeds 21 and there is an Ace in the hand, the Ace's value will be adjusted from 11 to 1.
    public void addCard(Card card) {
        if (card != null) {
            hand.add(card);
            score += card.getValue();
            
            // Adjust score if it exceeds 21 and there is an Ace in the hand
            if (score > 21) {
                for (Card c : hand) {
                    if (c.getCardName().equals("Ace") && score > 21) {
                        score -= 10; // Reduce Ace value from 11 to 1
                        break;
                    }
                }
            }
        }
    }
    
    // Then this will return the player's current score after a card gets added to the player's hand.
    public int getScore() {
        return score;
    }
    
    public List<Card> getHand() {
        return hand;
    }
    
    // This is a method that will show the player's hand and their score. The for loop iterates over every card in the hand list
    // and prints out each card's name and suit. Then it will print out the score of the player.
    public void showHand() {
        for (Card card : hand) {
            System.out.println(card.getCardName() + " of " + card.getSuit());
        }
        System.out.println("score: " + score);
    }
    
}
