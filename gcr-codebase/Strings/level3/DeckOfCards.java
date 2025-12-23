/*
Write a program to create a deck of cards, shuffle the deck,
and distribute n cards to x number of players.
*/

import java.util.Scanner;

public class DeckOfCards {

    // Method to initialize the deck
    public String[] initializeDeck(String[] suits, String[] ranks) {

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }

        return deck;
    }

    // Method to shuffle the deck
    public String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            // Generate random index between i and n
            int randomCardNumber = i + (int)(Math.random() * (n - i));

            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    // Method to distribute cards to players
    // Returns 2D array: [player][cards]
    public String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {

        int totalCardsNeeded = players * cardsPerPlayer;

        // Check if distribution is possible
        if (totalCardsNeeded > deck.length) {
            return null;
        }

        String[][] playerCards = new String[players][cardsPerPlayer];

        int cardIndex = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }

        return playerCards;
    }

    // Method to print players and their cards
    public void printPlayers(String[][] players) {

        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " Cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Suits and Ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};

        DeckOfCards obj = new DeckOfCards();

        // Initialize deck
        String[] deck = obj.initializeDeck(suits, ranks);

        // Shuffle deck
        deck = obj.shuffleDeck(deck);

        // Take user input
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        // Distribute cards
        String[][] playerCards = obj.distributeCards(deck, players, cardsPerPlayer);

        if (playerCards == null) {
            System.out.println("\nCards cannot be distributed with given inputs.");
        } else {
            // Print players and cards
            obj.printPlayers(playerCards);
        }

        sc.close();
    }
}
