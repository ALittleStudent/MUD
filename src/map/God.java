package map;

import role.Player;

public class God {
	private World world = World.getWorld();
	public void createWorld(){
		this.buildWorld();
	}
	private void buildWorld() {
		Room r0 = world.createRoom("�ۺϰ�",
				"�ۺϰ���a����½�����ģ�����ʷ��������޾�������������");
		Room r1 = world.createRoom("�ۺ϶�",
				"�ۺ϶�ԭ����a����½�������У�����һ�����ֺ�����˴�");
		Room r2 = world.createRoom("���ֶ��",
				"'�����Ű�'����ʿ��˵���������������սʿ��");
		Room r3 = world.createRoom("���Ǳ�",
				"��ͷ������Ƭ�ڰ��Ĵ�½�ϼ�ʹ����Ҳ������");
		Room r4 = world.createRoom("ŮװȺ��",
				"ŮװȺ���ϵ��������ŷ�·������а��ͽ");
		Room r5 = world.createRoom("�ٱ�ɽ��",
				"�ҿ��������ǳ���Ҫ�氡");
		Room r6 = world.createRoom("����", "������ԣ�");
		Room r7 = world.createRoom("��ū���͹�", 
				"�����ͳ�����ƺ���è�����Ǻ͹��Ǳ��ǵж���");
		Room r8 = world.createRoom("��ũ���",
				"�����������ڶഴ����");
		Room r9 = world.createRoom("����",
				"�εεεεεεεΣ�");
		Room r10 = world.createRoom("Ȧ��",
				"��ʵ����ֶ�juan");
		Room r11 = world.createRoom("ֵ����",
				"�������������磬��ôֵ���Ҿ����ƹ������ĵظ�");
		r0.setConnectorDir("��", r2);
		r0.setConnectorDir("��", r3);
		r0.setConnectorDir("��", r4);
		r0.setConnectorDir("��", r5);
		r0.setConnectorDir("ˮ��", r1);
		r1.setConnectorDir("����", r0);
		r2.setConnectorDir("��", r0);
		r2.setConnectorDir("��", r6);
		r3.setConnectorDir("��", r0);
		r3.setConnectorDir("��", r7);
		r4.setConnectorDir("��", r0);
		r4.setConnectorDir("���", r8);
		r4.setConnectorDir("��", r9);
		r5.setConnectorDir("��", r0);
		r5.setConnectorDir("��", r10);
		r6.setConnectorDir("��", r2);
		r7.setConnectorDir("��", r3);
		r8.setConnectorDir("�˼�", r4);
		r9.setConnectorDir("��", r4);
		r10.setConnectorDir("��", r5);
		r10.setConnectorDir("��", r11);
		r11.setConnectorDir("ֵ����", r10);
		
		
		
		
	}
}
