package peopleManager;

import optional_Interface.Child_Inter;

public class Child_v01 extends Person_v01 implements Child_Inter {

	public Child_v01(int age, String name, String general) {
		super(age, name, general);
		// TODO Auto-generated constructor stub
	}

	/*@Override
	public void addParents(String name) {
		// TODO Auto-generated method stub
		profile.addParents(name);
	}

	@Override
	public void addSiblings(String name) {
		// TODO Auto-generated method stub
		profile.addSiblings(name);
	}// ���ӣ���ĸ ,�ֵ� ����
*/
	// ���ӣ�����,ͬѧ
	@Override
	public void addFriend(String name) {
		// TODO Auto-generated method stub
		profile.addFriend(name);
	}

	@Override
	public void addClassmate(String name) {
		// TODO Auto-generated method stub
		profile.addClassmate(name);
	}// ���ӣ�����,ͬѧ����
	
/*	@Override
	public void showParents() {
		// TODO Auto-generated method stub
		profile.showParents();
	}

	@Override
	public void showSiblings() {
		// TODO Auto-generated method stub
		profile.showSiblings();
	}// ��ʾ:��ĸ ,�ֵ� ����
*/
	// ��ʾ:����,ͬѧ
	@Override
	public void showFriend() {
		// TODO Auto-generated method stub
		profile.showFriend();
	}

	@Override
	public void showClassmate() {
		// TODO Auto-generated method stub
		profile.showClassmate();
	}// ��ʾ:����,ͬѧ����
	
	@Override
	public String toString() {
		return "Child Name=" + getName() + ", General="
				+ getGeneral() + ", Age=" + getAge() + "]";
	}
}
