package abStract;

import inter.DataItem;

public abstract class DataObject implements DataItem {
//DateObject是游戏中基础数据类型，所有的物品都应该继承它，类似于Minecreaft中的Block
	private static final long serialVersionUID = 1L;
	private int databaseRef;
	private DataObject location;
	private String name;
	private String description;


	public DataObject(String name) {
		this.setName(name.replaceAll(" ", "_"));

		this.setDescription("你正仔细的端详着:" + this.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDataRef() {
		return this.databaseRef;
	}

	public void setDatabaseRef(int ref) {
		databaseRef = ref;
	}

	public void setDescription(String descrip) {
		this.description = descrip;
	}

	public String getDescription() {
		return this.description;
	}

	public void setLocation(DataObject location) {
		this.location = location;
	}

	public DataObject getLocation() {
		return this.location;
	}

	public String toString() {
		String result = this.getName() + ":" + this.getDataRef();
		return result;
	}
}