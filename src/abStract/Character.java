package abStract;

import item.Clothes;
import item.Weapon;
import map.Room;

public class Character extends DataObject implements ActiveAble{
	public int id;
	public String name;
	public int ACK;//��������
	public int DEF;//������
	public int STR;//����
	public int HIT;//������
	public int SPD;//�ٶ�
	public int room_id;
	public Weapon weapon;
	public Clothes clothes;
	
	public Character(String name,String des) {
		super(name,des);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getDatabaseRef() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sayToPlayer(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Character enemy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveToDes(Room r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void useItem(String name) {
		// TODO Auto-generated method stub
		
	}

	
}
