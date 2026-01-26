package week6;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	// Card Class
	class Card {
	    private int value;
	    private String name;
	    
	    // Constructor
	    public Card(int value, String name) {
	        this.value = value;
	        this.name = name;
	    }
	    
	    // Getters
	    public int getValue() {
	        return value;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    // Setters
	    public void setValue(int value) {
	        this.value = value;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    // Describe method
	    public void describe() {
	        System.out.println(name + " (Value: " + value + ")");
	    }
	}

	// Deck Class
	class Deck {
	    private List<Card> cards;
	    
	    // Constructor - populates deck with 52 cards
	    public Deck() {
	        cards = new ArrayList<>();
	        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	        String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", 
	                         "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	        
	        for (String suit : suits) {
	            for (int i = 0; i < ranks.length; i++) {
	                String cardName = ranks[i] + " of " + suit;
	                int cardValue = i + 2; // Values from 2-14
	                cards.add(new Card(cardValue, cardName));
	            }
	        }
	    }
	    
	    // Shuffle method
	    public void shuffle() {
	        Collections.shuffle(cards);
	    }
	    
	    // Draw method - removes and returns top card
	    public Card draw() {
	        if (cards.isEmpty()) {
	            return null;
	        }
	        return cards.remove(0);
	    }
	    
	    // Getter
	    public List<Card> getCards() {
	        return cards;
	    }
	}

	// Player Class
	class Player {
	    private List<Card> hand;
	    private int score;
	    private String name;
	    
	    // Constructor
	    public Player(String name) {
	        this.name = name;
	        this.hand = new ArrayList<>();
	        this.score = 0;
	    }
	    
	    // Describe method
	    public void describe() {
	        System.out.println("Player: " + name);
	        System.out.println("Score: " + score);
	        System.out.println("Hand:");
	        for (Card card : hand) {
	            card.describe();
	        }
	    }
	    
	    // Flip method - removes and returns top card from hand
	    public Card flip() {
	        if (hand.isEmpty()) {
	            return null;
	        }
	        return hand.remove(0);
	    }
	    
	    // Draw method - draws a card from deck and adds to hand
	    public void draw(Deck deck) {
	        Card drawnCard = deck.draw();
	        if (drawnCard != null) {
	            hand.add(drawnCard);
	        }
	    }
	    
	    // Increment score
	    public void incrementScore() {
	        score++;
	    }
	    
	    // Getters
	    public int getScore() {
	        return score;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public List<Card> getHand() {
	        return hand;
	    }
	    
	    // Setters
	    public void setScore(int score) {
	        this.score = score;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	}

	// App Class with Main Method
	public class WarGame {
	    public static void main(String[] args) {
	        System.out.println("=================================");
	        System.out.println("   WELCOME TO WAR CARD GAME!");
	        System.out.println("=================================\n");
	        
	        // Instantiate Deck and two Players
	        Deck deck = new Deck();
	        Player player1 = new Player("Player 1");
	        Player player2 = new Player("Player 2");
	        
	        // Shuffle the deck
	        deck.shuffle();
	        System.out.println("Deck has been shuffled!\n");
	        
	        // Deal cards - 52 iterations, alternating between players
	        System.out.println("Dealing cards...\n");
	        for (int i = 0; i < 52; i++) {
	            if (i % 2 == 0) {
	                player1.draw(deck);
	            } else {
	                player2.draw(deck);
	            }
	        }
	        
	        System.out.println("Cards dealt! Each player has 26 cards.\n");
	        System.out.println("=================================");
	        System.out.println("      LET THE GAME BEGIN!");
	        System.out.println("=================================\n");
	        
	        // Play 26 rounds
	        for (int round = 1; round <= 26; round++) {
	            System.out.println("--- Round " + round + " ---");
	            
	            // Each player flips a card
	            Card card1 = player1.flip();
	            Card card2 = player2.flip();
	            
	            // Display the cards
	            System.out.print(player1.getName() + " flips: ");
	            card1.describe();
	            System.out.print(player2.getName() + " flips: ");
	            card2.describe();
	            
	            // Compare values and award point
	            if (card1.getValue() > card2.getValue()) {
	                player1.incrementScore();
	                System.out.println(">>> " + player1.getName() + " wins this round!");
	            } else if (card2.getValue() > card1.getValue()) {
	                player2.incrementScore();
	                System.out.println(">>> " + player2.getName() + " wins this round!");
	            } else {
	                System.out.println(">>> It's a TIE! No point awarded.");
	            }
	            
	            // Display current scores
	            System.out.println("Current Score - " + player1.getName() + ": " + 
	                             player1.getScore() + " | " + player2.getName() + 
	                             ": " + player2.getScore());
	            System.out.println();
	        }
	        
	        // Final results
	        System.out.println("=================================");
	        System.out.println("        GAME OVER!");
	        System.out.println("=================================");
	        System.out.println("\nFinal Scores:");
	        System.out.println(player1.getName() + ": " + player1.getScore());
	        System.out.println(player2.getName() + ": " + player2.getScore());
	        System.out.println();
	        
	        // Determine and announce winner
	        if (player1.getScore() > player2.getScore()) {
	            System.out.println("🏆 WINNER: " + player1.getName() + "! 🏆");
	        } else if (player2.getScore() > player1.getScore()) {
	            System.out.println("🏆 WINNER: " + player2.getName() + "! 🏆");
	        } else {
	            System.out.println("🤝 It's a DRAW! 🤝");
	        }
	        
	        System.out.println("\n=================================");
	    }
	}
