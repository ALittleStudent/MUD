package abStract;

import map.Room;

public abstract class Item extends DataObject implements Comparable<Item>{
//Item����Ʒ�ĳ�����	
	public Item(String name,String des) {
		super(name,des);
		// TODO Auto-generated constructor stub
	}
	public int id;
	public String name;
	public int ACK;//��������
	public int DEF;//������
	public int STR;//����
	public int HIT;//������
	public int SPD;//�ٶ�
	public int value;//��ֵ
	public Room room;
}
