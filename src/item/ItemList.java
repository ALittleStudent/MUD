package item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import abStract.ActiveAble;
import abStract.Character;
import abStract.DataObject;
import abStract.Item;
import map.Room;
import role.Player;

public class ItemList extends DataObject{
	//��Ʒ�������
	private int maxSize;
	//��Ʒ�б�
	private ArrayList<Item> bag;
	//��Ʒ��״̬
	private boolean isFull;
	
	public ItemList(String name,String des,int maxSize,boolean ifFull) {
		super(name,des);
		this.maxSize = maxSize;
		this.bag = new ArrayList<Item>();
		this.isFull = ifFull;
	}
//��Ʒ��

	@Override
	public int getDatabaseRef() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getMaxSize(){
		return this.maxSize;
	}
	//���ñ��������
	public void setMaxSize(int m){
		this.maxSize = m;
	}
	public boolean isFull(){
		return this.isFull;
	}
	//���ñ�������
	public void setIsFull(boolean b){
		this.isFull = b;
	}
	//��Ʒ����
	public Item getItemByName(String name){
		for(Item item : this.bag){
			String itemName = item.getName();
			if(itemName.equals(name)){
				return item;
			}
		}
		return null;
	}
	//ֻ��һ����Ʒ�����
	public boolean addItemInBag(Item i,ActiveAble active){
		if(isFull() || this.bag.size() == this.maxSize){
			active.sayToPlayer("��İ�����");
			return false;
		}else{
			this.bag.add(i);
			active.sayToPlayer("�㽫"+i.getName()+"�����˱���");
			return true;
		}
	}

	//�����Ʒ�����
	public boolean addItemInBag(ArrayList<Item> i,ActiveAble active){
		if(isFull() || this.bag.size() == this.maxSize){
			active.sayToPlayer("��İ�����");
			return false;
		}else{
			for(int n = 0;n < i.size();n++){
			this.bag.add(i.get(n));
			}
			active.sayToPlayer("�㽫"+i.size()+"��"+i.get(0).getName()+"�����˱���");
			return true;
		}
	}

	//��Ʒ����
	public boolean throwItem(String itemName,Room room,ActiveAble active){
		Item tmp = getItemByName(itemName);
		if(this.bag.remove(tmp)){
			room.addItem(tmp);
			tmp.setLocation(room);
		}
		return false;
	}

	//��Ʒ�鿴
	public void checkItem(Player p){
		String des = "����˱�����������һ������\n\r";
		if(!this.bag.isEmpty()){
			Collections.sort(this.bag);
			for(Item i : this.bag){
				des += "���ͳ���" + i.getName() + ":" +i.getDescription() + "\n\r";
			}
		}
		p.sayToPlayer(des);
	}
	
	
	public boolean giveItemToSb(String itemName,String otherName,ActiveAble active){
		//��Ʒ����
		return false;
	}
}
