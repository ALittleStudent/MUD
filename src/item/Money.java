package item;

import abStract.Item;

public class Money extends Item{
//Ǯ��һ��ȼ��Ҳ������Ʒ

	public Money(String name,int v,String des) {
		super(name,des);
		super.value = v;
	}

	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDatabaseRef() {
		// TODO Auto-generated method stub
		return 0;
	}
}
