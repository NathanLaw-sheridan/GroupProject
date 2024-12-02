/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjackgroupproject;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class BlackJackGame {
    private Deck deck;
    private ArrayList<Player> players;
    private Dealer dealer;

    // Constructor initializes the deck, player list, and dealer
    public BlackJackGame() {
        deck = new Deck();
        players = new ArrayList<>();
        dealer = new Dealer();
    }

    // Adds a player to the game
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Main game logic
    public void play() {
        System.out.println("Welcome to Blackjack!");
        
        // Deal two cards to each player
        for (Player player : players) {
            player.addCard(deck.dealCard());
            player.addCard(deck.dealCard());
        }
        
        // Deal two cards to the dealer
        dealer.addCard(deck.dealCard());
        dealer.addCard(deck.dealCard());

        // Show dealer's first card
        System.out.println("Dealer's hand:");
        dealer.showFirstCard();

        // Each player's turn
        for (Player player : players) {
            System.out.println("\nPlayer's turn:");
            player.showHand();
            while (true) {
                System.out.println("Your current score: " + player.getScore());
                System.out.println("Do you want to (1) Hit or (2) Stand?");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                if (choice == 1) { // Hit
                    player.addCard(deck.dealCard());
                    player.showHand();
                    if (player.getScore() > 21) {
                        System.out.println("You busted!");
                        break;
                    }
                } else if (choice == 2) { // Stand
                    break;
                } else {
                    System.out.println("Invalid choice. Please choose 1 or 2.");
                }
            }
        }

        // Dealer's turn
        System.out.println("\nDealer's turn:");
        dealer.showHand();
        while (dealer.getScore() < 17) {
            dealer.addCard(deck.dealCard());
            dealer.showHand();
        }
        if (dealer.getScore() > 21) {
            System.out.println("Dealer busted!");
        }

        // Determine the winner
        System.out.println("\nGame results:");
        for (Player player : players) {
            if (player.getScore() > 21) {
                System.out.println("Player busted. Dealer wins.");
            } else if (dealer.getScore() > 21 || player.getScore() > dealer.getScore()) {
                System.out.println("Player wins!");
            } else if (player.getScore() == dealer.getScore()) {
                System.out.println("It's a tie!");
            } else {
                System.out.println("Dealer wins.");
            }
        }
    }
}
