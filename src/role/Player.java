package role;

import java.util.ArrayList;

import abStract.Character;
import abStract.Item;
import item.Clothes;
import item.Money;
import item.Weapon;
import map.Room;

public class Player extends Character{
	//�����Ϣ
	private int id;
	private String name;
	private String pass;
	//�������
	private Money money;
	private Room room;
	private int statpoints;
	//װ����
	private Weapon weapon;
	private Clothes clothes;
	//��Ʒ��
	private ArrayList<Item> itemList;
	//��ʱ��Ϣ
	boolean active;
	boolean loggedin;
	
	public Player() {
		
	}
}
