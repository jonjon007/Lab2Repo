package pkgPokerBLL;

public enum eSuit {
	HEARTS (1), SPADES (2), CLUBS (3), DIAMONDS (4), JOKERS (99);
	
	private int suit;
	eSuit(int s){
		suit = s;
	}
}
