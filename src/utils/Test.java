package utils;


import map.God;
import map.Room;
import map.World;
import role.Player;

public class Test {
	
	public static void main(String[] args){
		God god = new God();
		god.createWorld();
		Player p = World.getWorld().createPlayer("����", "����Ŷ��");
		Room r1 = ((Room)p.getLocation());
		p.moveToDes(((Room)p.getLocation()).getConnectorDir("ˮ��"));
	}
}
