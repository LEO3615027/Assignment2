package People;

public class YoungChild extends Person{

	public YoungChild(int age, String name, String general) {
		super(age, name, general);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "YoungChild Name=" + getName() + ", General="
				+ getGeneral() + ", Age=" + getAge() + "]";
	}
}
