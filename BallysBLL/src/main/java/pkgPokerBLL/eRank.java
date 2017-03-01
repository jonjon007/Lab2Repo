package pkgPokerBLL;

public enum eRank {
	HEARTS (1), SPADES (2), CLUBS (3), DIAMONDS (4), JOKERS (99);
	
	private int rank;
	eRank(int r){
		rank = r;
	}
	
	public int getiRankNbr(){
		return rank;
	}
}