package net.wonhe.util;

public enum EnumT {
	Normal("正常", 1), Update("已更新", 2), Deleted("已删除", 3), Fired("已屏蔽", 4);
	//成员变量
	private String name;
	private int index;

	//构造方法，注意：构造方法不能是public,因为enum不可以被实例化
	private EnumT(String name, int index) {
		this.name = name;
		this.index = index;
	}
	
	public static String getName(int index){
		for(EnumT e : EnumT.values()){
			if(e.getIndex() == index){
				return e.name;
			}
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public static void main(String[] args) {
		System.out.println(EnumT.getName(6));
	}
}
