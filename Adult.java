package peopleManager;

import optional_Interface.Statement_Inter;

/**
 * ����Adult class
 * @author JINDONG ZHANG
 * @version	V1.0
 */


public class Adult extends Person implements Statement_Inter{
	/*
	 *Adult:
	 * age >=17
	 * */
	public Adult(int age, String name, String general) {
		super(age, name, general);
		// TODO Auto-generated constructor stub
	}// ������һ�����˵�ʱ����Ҫ������������, ���� �� �Ա�

	@Override
	public void setStatus(String statement) {
		// TODO Auto-generated method stub
		profile.setStatus(statement);
	}
	
	@Override
	public String getStatus() {
		return profile.getStatus();
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		return "Adult Nam: "+getName()+"; General: "+getGeneral()+"; Age: " + getAge();
	}



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
	
	

	/*
	 * ���·�����:Part2 ��ʾ:
	 * B1	��ĸ ,�ֵ� ,
	 * B2	����,ͬѧ ,
	 * B3	ͬ�� ,����
	 */
	
	
	
}
