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
	}// 增加：父母 ,兄弟 结束
*/
	// 增加：朋友,同学
	@Override
	public void addFriend(String name) {
		// TODO Auto-generated method stub
		profile.addFriend(name);
	}

	@Override
	public void addClassmate(String name) {
		// TODO Auto-generated method stub
		profile.addClassmate(name);
	}// 增加：朋友,同学结束
	
/*	@Override
	public void showParents() {
		// TODO Auto-generated method stub
		profile.showParents();
	}

	@Override
	public void showSiblings() {
		// TODO Auto-generated method stub
		profile.showSiblings();
	}// 显示:父母 ,兄弟 结束
*/
	// 显示:朋友,同学
	@Override
	public void showFriend() {
		// TODO Auto-generated method stub
		profile.showFriend();
	}

	@Override
	public void showClassmate() {
		// TODO Auto-generated method stub
		profile.showClassmate();
	}// 显示:朋友,同学结束
	
	@Override
	public String toString() {
		return "Child Name=" + getName() + ", General="
				+ getGeneral() + ", Age=" + getAge() + "]";
	}
}
