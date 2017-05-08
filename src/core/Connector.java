package core;

import java.util.ArrayList;
import java.util.HashMap;

import map.Room;

public class Connector {
	//��
	private Room east;
	//��
	private Room west;
	//��
	private Room south;
	//��
	private Room north;
	/*
	 * Ӧ�ÿ����ٶ��������ı����¥�������ҡ����ҵȷ���
	 */
	HashMap<String,Room> map  = new HashMap<String,Room>();
	private void setMap(){
		map.put("��",this.north);
		map.put("��",this.east);
		map.put("��",this.south);
		map.put("��",this.west);
	} 
	public Connector() {
		this.east = null;
		this.west = null;
		this.south = null;
		this.north = null;	
		this.setMap();
	}
	public void setRoom(String dir,Room des){
		map.replace(dir, des);
	}
	public Room getRoom(String dir){
		return map.get(dir);
	}
}
