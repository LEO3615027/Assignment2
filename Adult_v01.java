package peopleManager;
/**
 * ����Menu class
 * @author JINDONG ZHANG
 * @version	V1.0
 */

import optional_Interface.Adult_Inter;

public class Adult_v01 extends Person_v01 implements Adult_Inter {

	public Adult_v01(int age, String name, String general) {
		super(age, name, general);
		// TODO Auto-generated constructor stub
	}// ������һ�����˵�ʱ����Ҫ������������, ���� �� �Ա�

	/*
	 * ���ӵı������� Scanner sc = new Scanner(System.in); String name = sc.nextLine();
	 * Scanner sc1 = new Scanner(System.in); String general = sc1.nextLine();
	 * Scanner sc2 = new Scanner(System.in); int age = sc2.nextInt();
	 */
	/*
	 * ���·����ֱ��ǣ�Part1 ����:
	 * A1:	��ĸ ,�ֵ� ,
	 * A2:	����,ͬѧ ,
	 * A3:	ͬ�� ,����
	 */
	/*���ڼ̳е�ԭ�����Բ���Ҫ
	 * @Override//A1	��ĸ ,�ֵ�
	public void addParents(String name) {
		// TODO Auto-generated method stub
		profile.addParents(name+"  ");
	}

	@Override
	public void addSiblings(String name) {
		// TODO Auto-generated method stub
		profile.addSiblings(name+"  ");
	}// A1 ����
*/
	@Override//A2	����,ͬѧ
	public void addFriend(String name) {
		// TODO Auto-generated method stub
		profile.addFriend(name+"  ");
	}

	@Override
	public void addClassmate(String name) {
		// TODO Auto-generated method stub
		profile.addClassmate(name+"  ");
	}//A2����

	@Override//A3	����:ͬ�� ,����
	public void addColleague(String name) {
		// TODO Auto-generated method stub
		profile.addColleague(name+"  ");
	}

	@Override
	public void addPartner(String name) {
		// TODO Auto-generated method stub
		profile.addPartner(name+"  ");
	}//A3����

	/*
	 * ���·�����:Part2 ��ʾ:
	 * B1	��ĸ ,�ֵ� ,
	 * B2	����,ͬѧ ,
	 * B3	ͬ�� ,����
	 */
	
	/*	���ڼ̳и���Person���Բ���Ҫ������ʾB1����
	 * @Override//B1	��ĸ ,�ֵ� 
	public void showParents() { // TODO Auto-generated method stub
		profile.showParents();
	}

	@Override
	public void showSiblings() { // TODO Auto-generated method stub
		profile.showSiblings();
	}//B1 ����
	 */
	
	@Override//B2	����,ͬѧ
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
	}// //B2����

	@Override//B3	ͬ�� ,����
	public void showColleague() {
		// TODO Auto-generated method stub
		profile.showColleague();
	}

	@Override
	public void showPartner() {
		// TODO Auto-generated method stub
		profile.showPartner();
	}//B3����

}
