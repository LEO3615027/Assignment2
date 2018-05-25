package peopleManager;

import optional_Interface.Statement_Inter;

/**
 * 这是Adult class
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
	}// 当创建一个成人的时候需要输入它的年龄, 名字 ， 性别

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
	
	

	/*
	 * 以下方法是:Part2 显示:
	 * B1	父母 ,兄弟 ,
	 * B2	朋友,同学 ,
	 * B3	同事 ,情人
	 */
	
	
	
}
