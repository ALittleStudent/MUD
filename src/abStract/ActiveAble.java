package abStract;

import map.Room;

public interface ActiveAble {
	//�˷�������ǹ��ʵ���˾���ĶԻ�
	//�������ң������ڽ���
	public void sayToPlayer(String msg);
	
	//�˷���������������
	public void attack(Character enemy);
	
	//�ƶ�
	public void moveToDes(Room r);
	
	//ʹ����Ʒ
	public void useItem(String name);
	
	//
}
