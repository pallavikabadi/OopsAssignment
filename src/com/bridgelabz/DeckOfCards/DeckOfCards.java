package com.bridgelabz.DeckOfCards;

import java.util.List;

public class DeckOfCards {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        String[] players = {"Player 1", "Player 2", "Player 3", "Player 4"};
        Card[][] hands = new Card[4][9];

        for (int i = 0; i < 4; i++) {
            List<Card> hand = deck.deal(9);
            for (int j = 0; j < 9; j++) {
                hands[i][j] = hand.get(j);
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(players[i] + " received:");
            for (int j = 0; j < 9; j++) {
                System.out.println(hands[i][j]);
            }
            System.out.println();
        }
    }

}
