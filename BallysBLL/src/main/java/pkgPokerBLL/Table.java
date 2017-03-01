package pkgPokerBLL;

import java.util.ArrayList;
import java.util.UUID;

public class Table {

	private UUID TableID;
	private ArrayList<Player> TablePlayers = new ArrayList<Player>();
	
	public Table() {
		super();
		TableID = UUID.randomUUID();
	}
	
	public void addToTablePlayers(Player plyrs){
		TablePlayers.add(plyrs);
	}
	
	public Table AddPlayerToTable(Player p)
	{
		//TODO: Add a player to the table (should be pretty easy)
		Table tempTable = this;
		tempTable.addToTablePlayers(p);
		return tempTable;
	}
}
