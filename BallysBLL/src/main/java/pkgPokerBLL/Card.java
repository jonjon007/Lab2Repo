package pkgPokerBLL;
import pkgPokerEnum.eRank;
//import pkgPokerEnum.eSuit;

import java.util.Comparator;

import pkgPokerEnum.*;
import pkgPokerEnum.eRank;

public class Card implements Comparable {

	private eRank eRank;
	private eSuit eSuit;
	
	public Card(eRank rank, eSuit eSuit) {
		this.eRank = rank;
		this.eSuit = eSuit;
	}

	public eRank geteRank() {
		return eRank;
	}

	public eSuit geteSuit() {
		return eSuit;
	}
	
	public int compareTo(Object o) {
	    Card c = (Card) o; 
	    return c.geteRank().compareTo(this.geteRank()); 

	}
	
	public static Comparator<Card> CardRank = new Comparator<Card>() {

		public int compare(Card c1, Card c2) {

		   int Cno1 = c1.geteRank().getiRankNbr();
		   int Cno2 = c2.geteRank().getiRankNbr();

		   /*For descending order*/
		   return Cno2 - Cno1;

	   }};


}
