package role;

import abStract.Character;
import abStract.DataObject;
import abStract.Item;
import item.ItemList;
import map.Room;
import map.World;
import net.Client;

public class Player extends Character{
	private Player player;
	private String designationRank;
	private String password;
	private Client client;
	public Player(String name,String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}
	
	public void moveToDes(Room r){
		if(this.getLocation() != null){
			((Room)this.getLocation()).removePlayer(player);
		}
		this.setLocation(r);
		r.addPlayer(this);
		this.room_id = r.getDatabaseRef();
		this.sayToPlayer(((Room)this.getLocation()).getDescription());
	}
	public void setRoomId(int id){
		this.room_id = id;
	}
//	public void reBirth(){
//		player.setLocation(World.getWorld().getDataObj(0));
//	}

	public void setClient(Client c) {
		this.client = c;
		
	}

}
