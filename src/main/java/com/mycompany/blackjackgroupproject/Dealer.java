/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjackgroupproject;


/**
 *
 * @author sebas
 */
public class Dealer extends Player {
    
    // This method shows the dealer's first card.
    // It checks if the dealer's hand is not empty. If it has at least one card, it prints out the first card's name and suit.
    // If the hand is empty, it displays a message indicating there are no cards to show.
    public void showFirstCard() {
        if (!getHand().isEmpty()) {
            System.out.println("Dealer's first card: " + getHand().get(0).getCardName() + 
                               " of " + getHand().get(0).getSuit());
        } else {
            System.out.println("Dealer has no cards to show.");
        }
    }
}
