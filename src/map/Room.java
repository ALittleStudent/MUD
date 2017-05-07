package map;

import java.util.ArrayList;
import java.util.HashMap;

import abStract.Character;
import abStract.DataObject;
import abStract.Item;
import role.Player;

public class Room extends DataObject{
	private ArrayList<Room> roomList;
	private ArrayList<Item> itemList;
	private ArrayList<Character> peopleList;
	
	public Room(String name,String des) {
		super(name,des);
		// TODO Auto-generated constructor stub
	}

	private int id;
	private String name;
	private ArrayList<HashMap<String,Integer>> mapList;

	public void setMapList(int bei,int dong,int nan,int xi){
		HashMap<String,Integer> map  = new HashMap<String,Integer>();
		map.put("��", bei);
		map.put("��", dong);
		map.put("��", nan);
		map.put("��", xi);
		mapList.add(map);
	}

	@Override
	public int getDatabaseRef() {
		// TODO Auto-generated method stub
		return 0;
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
	
	
	//�򷿼�����(���/NPC)�б��������
	public boolean addPeople(Character c){
		if(this.peopleList.add(c)){
			//�ж��ǲ������
			if(c instanceof Player){
				c.sayToPlayer("�Һ������ֻ����ˣ�");
				this.refreshEnemy();
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
		c.setLocation(null);
		return this.peopleList.remove(c);
	}
	
	
	private void refreshEnemy() {
		// TODO Auto-generated method stub
		
	}
	
	
	private void refreshPlayer() {
		// TODO Auto-generated method stub
		
	}
}
