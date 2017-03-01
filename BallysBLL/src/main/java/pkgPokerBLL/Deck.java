package pkgPokerBLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class Deck {

	private UUID DeckID;
	private ArrayList<Card> DeckCards = new ArrayList<Card>();
	
	public Deck()
	{
		//TODO: Implement This Constructor (no-arg Deck should build up a deck with 52 cards)
		DeckCards = buildDeck();
		//	This method will do a for/each, returning each rank in the enum.
		for (eRank Rank : eRank.values()) {
			System.out.println(Rank.getiRankNbr());
		}
	}
	
	private ArrayList<Card> buildDeck(){
		ArrayList<Card> tempList = new ArrayList<Card>(); //Add a 52???
		for(eSuit suit: eSuit.values()){
			for(eRank rank: eRank.values()){
				tempList.add(new Card(rank, suit));
			}
		}
		Collections.shuffle(tempList);
		return tempList;
	}
	
	public Card DrawCard()
	{
		//	TODO: Implement this method... should draw a card from the deck.
		return DeckCards.remove(0);
	}
	
	public int cardsRemaining(){
		return DeckCards.size();
	}
	
}
