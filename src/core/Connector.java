package core;

import java.util.HashMap;
import map.Room;

public class Connector {

	/*
	 * Ӧ�ÿ����ٶ��������ı����¥�������ҡ����ҵȷ���
	 */
	HashMap<String,Room> map  = new HashMap<String,Room>();
	private void setMap(){
		map.put("��",null);
		map.put("��",null);
		map.put("��",null);
		map.put("��",null);
	} 
	public Connector() {
		this.setMap();
	}
	public void setRoom(String dir,Room des){
		if(map.containsKey(dir)){
			map.replace(dir, des);
		}else{
			map.put(dir, des);		
		}
	}
	public Room getRoom(String dir){
		return map.get(dir);
	}
}
