/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blackjackgroupproject;

/**
 *
 * @author Nathan.Law
 */
public class BlackJackGroupProject {

    public static void main(String[] args) {
         // create a new game
        BlackJackGame game = new BlackJackGame();
        
        // add player
        Player player1 = new Player();
        game.addPlayer(player1);
        
        // game start
        game.play();
    }
}
