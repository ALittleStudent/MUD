package abStract;

public abstract class Item extends DataObject implements Comparable<Item>{
//Item����Ʒ�ĳ�����	
	public Item(String name) {
		super(name);
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
}
