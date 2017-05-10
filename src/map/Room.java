package map;

import java.util.ArrayList;
import java.util.HashMap;

import abStract.Character;
import abStract.DataObject;
import abStract.Item;
import core.Connector;
import role.Player;

public class Room extends DataObject{
	private ArrayList<Room> roomList;
	private ArrayList<Item> itemList;
	private ArrayList<Player> playerList;;
	private ArrayList<Character> peopleList;
	private Connector connector;
	public Room(String name,String des) {
		super(name,des);
		this.connector = new Connector();
		this.roomList = new ArrayList<Room>();
		this.itemList = new ArrayList<Item>();
		this.playerList = new ArrayList<Player>();
		this.peopleList = new ArrayList<Character>();
	}
	//�򷿼������Ʒ
	//����Ǳ������ڷ��������Ʒ�������޸���Ʒ��λ��
	public boolean addItem(Item i) {
		if(i.getLocation() != null){
			if(i.getLocation() instanceof Room){
				((Room) i.getLocation()).removeItem(i);
			}
		}
		i.setLocation(this);
		return itemList.add(i);
	}
	//�򷿼���ӷ���
	//
	public boolean addRoom(Room r){
		if(r.getLocation() != null){
			((Room) r.getLocation()).removeRoom(r);
		}
		r.setLocation(this);
		return roomList.add(r);
	}
	
	public boolean addPlayer(Player p){
		if(this.playerList.add(p)){
			if(p instanceof Player){
//				refreshPlayer();
				return true;
			}
		}
		return false;
	}
	//�򷿼�����(���/NPC)�б��������
	public boolean addPeople(Character c){
		if(this.peopleList.add(c)){
			//�ж��ǲ������
			if(c instanceof Character){
//				refreshPeople();
				this.sayToRoom("��"+c.getName()+"�ֻ�����");
				return true;
			}
		}
		return false;
	}


	//ɾ��������Ʒ�б��е���Ʒ
	public boolean removeItem(Item i) {
		// TODO Auto-generated method stub
		i.setLocation(null);
		return this.itemList.remove(i);
	}
	
	//ɾ�����䷿���б��еķ���
	public boolean removeRoom(Room r){
		r.setLocation(null);
		return this.roomList.remove(r);
	}
	
	//ɾ�����������б��е�����
	public boolean removePeople(Character c){
		return this.peopleList.remove(c);
	}
	public boolean removePlayer(Player p){
		return this.playerList.remove(p);
	}
	
	//�Է��������е���ҽ��к���
	public void sayToRoom(String context){
		for(Player p : this.playerList){
			p.sayToPlayer(context);
		}
	}
	
	//���÷���������
	public void setConnectorDir(String dir,Room room){
		this.connector.setRoom(dir, room);
	}
	public Room getConnectorDir(String dir){
		return this.connector.getRoom(dir);
	}
	//
	public boolean isPlayerInRoom(Player p){
		for(Player player : this.playerList){
			if(player.getName().equals(p.getName())){
				return true;
			}
		}
		return false;
	}
	public ArrayList<Player> getPlayerList() {
		return this.playerList;
	}
	
	//
	private void refreshPeople() {
		for(Character c : this.peopleList){
			for(Item i : c.openBag().getItemList()){
				i = (Item) World.getWorld().getDataObj(i.getDatabaseRef());
				i.setLocation(c);
			}
		}
		
	}
	
	
	private void refreshPlayer() {
		for(Player p : this.playerList){
			for(Item i :  p.openBag().getItemList()){
				i = (Item) World.getWorld().getDataObj(i.getDatabaseRef());
				i.setLocation(p);
			}
		}
		
	}
}
