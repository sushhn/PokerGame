package poker.version_graphics.model;

import java.util.ArrayList;
import java.util.Scanner;

import poker.version_graphics.PokerGame;

public class PokerGameModel {
	private final ArrayList<Player> players = new ArrayList<>();
	private DeckOfCards deck;
	
	// Enter number of Player at beginning of the game
	public PokerGameModel() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter nr. players:");
		PokerGame.NUM_PLAYERS = scan.nextInt();
		for (int i = 0; i < PokerGame.NUM_PLAYERS; i++) {
			players.add(new Player("Player " + i));	
		}
		
		deck = new DeckOfCards();
	}
	
	public Player getPlayer(int i) {
		return players.get(i);
	}
	
	public DeckOfCards getDeck() {
		return deck;
	}
}
