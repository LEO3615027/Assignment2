package peopleManager;
/**
 * ÕâÊÇYoungChild class
 * @author JINDONG ZHANG
 * @version	V1.0
 */
public class YoungChild extends Person{
	/*
	 *YoungChild:
	 * age >=0 && age <3
	 * */

	public YoungChild(int age, String name, String general) {
		super(age, name, general);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "YoungChild Name=" + getName() + ", General="
				+ getGeneral() + ", Age=" + getAge() ;
	}
}
