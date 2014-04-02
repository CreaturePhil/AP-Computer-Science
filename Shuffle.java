import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {
	
	public static void main(String[] args) { 
		String[] ranks = {"jack","queen","king"};
		String[] suits = {"clubs","diamond"};
		int[] pointValues = {11,12,13};
		Deck d = new Deck(ranks, suits, pointValues);
		d.shuffle();
		System.out.println(d);
	}
	
	/**
	 * cards contains all the cards in the deck.
	 */
	private ArrayList<Card> cards = new ArrayList<Card>();

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		for(int i = 0; i < ranks.length; i++) {
			for(String s : suits) {
				Card newCard = new Card(ranks[i], s, values[i]);
				cards.add(newCard);
			}
		}
		size = cards.size();
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if(cards.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* Most efficient way
		Random rand = new Random();
		size = cards.size();
		for(int i = size-1; i > 0; i--) {
			Card temp = cards.get(i);
			int rng = rand.nextInt(i+1);
			cards.set(i, cards.get(rng));
			cards.set(rng, temp);
		}
		*/
		
		/* Psuedocode Way
		size = cards.size();
		int split = size/2;
		ArrayList<Card> newArray = new ArrayList<Card>();
		for(int i = 0; i < split; i++) {
			Card firstHalf = cards.get(i);
			Card secondHalf = cards.get(i+(split-1));
			newArray.add(secondHalf);
			newArray.add(firstHalf);
		}
		for(int i = 0; i < size; i++) {
			cards.set(i, newArray.get(i));
		}*/
		
		// Clever Way
		size = cards.size();
		Random rand = new Random();
		int rng = rand.nextInt(5);
		int split = cards.size()/2;
		int check = 1;
		int start = rand.nextInt(2);
		int clumps = rand.nextInt(split);
		ArrayList<Card> newArray = new ArrayList<Card>();
		for(int i = 0; i < split; i++) {
			if (start == 1) {
				Card firstHalf = cards.get(i);
				int get = i+(split-check);
				Card secondHalf = cards.get(get);
				newArray.add(secondHalf);
				for(int j = 0; j < clumps; j++) {
					newArray.add(cards.get((split-j)));
				}
				newArray.add(firstHalf);
				for(int k = 0; k < clumps; k++) {
					newArray.add(cards.get((k)));
				}
			} else {
				Card firstHalf = cards.get(i);
				int get = i+(split-check);
				Card secondHalf = cards.get(get);
				newArray.add(firstHalf);
				for(int k = 0; k < clumps; k++) {
					newArray.add(cards.get((k)));
				}
				newArray.add(secondHalf);
				for(int j = 0; j < clumps; j++) {
					newArray.add(cards.get((split-j)));
				}
			}
		}
		for(int i = 0; i < size; i++) {
			cards.set(i, newArray.get(i));
		}
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if (cards.size() == 0) return null;
		size--;
		return cards.get(size);
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}

