package net.wonhe.util;

public enum EnumT {
	Normal("����", 1), Update("�Ѹ���", 2), Deleted("��ɾ��", 3), Fired("������", 4);
	//��Ա����
	private String name;
	private int index;

	//���췽����ע�⣺���췽��������public,��Ϊenum�����Ա�ʵ����
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
