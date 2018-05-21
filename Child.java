package People;
/**
 * ÕâÊÇChild class
 * @author JINDONG ZHANG
 * @version	V1.0
 */

public class Child extends Person {
	/*
	 *Child:
	 * age >=3 && age <17
	 * */
	public Child(int age, String name, String general) {
		super(age, name, general);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Child Name=" + getName() + ", General="
				+ getGeneral() + ", Age=" + getAge() + "]";
	}
}
