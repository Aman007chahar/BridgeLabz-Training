package string;

import java.util.Scanner;

public class DeckOfCards {

    // Method to initialize the deck
    static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomIndex = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
        return deck;
    }

    // Method to distribute cards to players
    static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        if (numCards > deck.length || numCards % numPlayers != 0) {
            System.out.println("Cannot distribute " + numCards + " cards to " + numPlayers + " players evenly.");
            return null;
        }
        int cardsPerPlayer = numCards / numPlayers;
        String[][] players = new String[numPlayers][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    // Method to print players' cards
    static void printPlayersCards(String[][] players) {
        if (players == null) return;
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : players[i]) {
                System.out.print(card + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);

        System.out.print("Enter number of cards to distribute: ");
        int numCards = sc.nextInt();
        System.out.print("Enter number of players: ");
        int numPlayers = sc.nextInt();

        String[][] players = distributeCards(deck, numCards, numPlayers);
        printPlayersCards(players);
    }
}
