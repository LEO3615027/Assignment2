package peopleManager;
/**
 * 这是Menu class
 * @author JINDONG ZHANG
 * @version	V1.0
 */

import optional_Interface.Adult_Inter;

public class Adult_v01 extends Person_v01 implements Adult_Inter {

	public Adult_v01(int age, String name, String general) {
		super(age, name, general);
		// TODO Auto-generated constructor stub
	}// 当创建一个成人的时候需要输入它的年龄, 名字 ， 性别

	/*
	 * 增加的变量代码 Scanner sc = new Scanner(System.in); String name = sc.nextLine();
	 * Scanner sc1 = new Scanner(System.in); String general = sc1.nextLine();
	 * Scanner sc2 = new Scanner(System.in); int age = sc2.nextInt();
	 */
	/*
	 * 以下方法分别是：Part1 增加:
	 * A1:	父母 ,兄弟 ,
	 * A2:	朋友,同学 ,
	 * A3:	同事 ,情人
	 */
	/*由于继承的原因所以不需要
	 * @Override//A1	父母 ,兄弟
	public void addParents(String name) {
		// TODO Auto-generated method stub
		profile.addParents(name+"  ");
	}

	@Override
	public void addSiblings(String name) {
		// TODO Auto-generated method stub
		profile.addSiblings(name+"  ");
	}// A1 结束
*/
	@Override//A2	朋友,同学
	public void addFriend(String name) {
		// TODO Auto-generated method stub
		profile.addFriend(name+"  ");
	}

	@Override
	public void addClassmate(String name) {
		// TODO Auto-generated method stub
		profile.addClassmate(name+"  ");
	}//A2结束

	@Override//A3	增加:同事 ,情人
	public void addColleague(String name) {
		// TODO Auto-generated method stub
		profile.addColleague(name+"  ");
	}

	@Override
	public void addPartner(String name) {
		// TODO Auto-generated method stub
		profile.addPartner(name+"  ");
	}//A3结束

	/*
	 * 以下方法是:Part2 显示:
	 * B1	父母 ,兄弟 ,
	 * B2	朋友,同学 ,
	 * B3	同事 ,情人
	 */
	
	/*	由于继承父类Person所以不需要以下显示B1功能
	 * @Override//B1	父母 ,兄弟 
	public void showParents() { // TODO Auto-generated method stub
		profile.showParents();
	}

	@Override
	public void showSiblings() { // TODO Auto-generated method stub
		profile.showSiblings();
	}//B1 结束
	 */
	
	@Override//B2	朋友,同学
	public void showFriend() {
		// TODO Auto-generated method stub
		profile.showFriend();
	}

	@Override
	public String toString() {
		return "Adult Name=" + getName() + ", General="
				+ getGeneral() + ", Age=" + getAge() + "]";
	}

	@Override
	public void showClassmate() {
		// TODO Auto-generated method stub
		profile.showClassmate();
	}// //B2结束

	@Override//B3	同事 ,情人
	public void showColleague() {
		// TODO Auto-generated method stub
		profile.showColleague();
	}

	@Override
	public void showPartner() {
		// TODO Auto-generated method stub
		profile.showPartner();
	}//B3结束

}
