package People;


public class Child extends Person {

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
