package peopleManager;

import optional_Interface.YoungChild_Inter;
import profileManager.Profile;
import profileManager.Profile_v01;

/*
 * Person类使用注意事项:在创建该类之前需要先判断年龄的大小	int age
 * */
public abstract class Person_v01 implements YoungChild_Inter {
	private int age;//它的年龄
	private String name;//这个人的名字
	private String general;//他的性别
	
	
	Profile_v01 profile = new Profile_v01();
	//增加一个盆友	在创建一个指定岁数的对象以后 让他们来实现interface
	/*public void addFriend(String name){
		profile.addFriend(name);
	}
	//增加一个展示所以朋友
	public void showFriend(){
		profile.showFriend();
	}*/
	//ArrayList<Profile> profileInPerson = new ArrayList<Profile>();
	//这个变量是用于设置储存一个人的文档
	
	//以下方法是Person的有参构造
	Person_v01(int age, String name, String general) {
		this.age = age;// 把age放在前面的原因是要先判断此人是 哪类人
		this.name = name;
		this.general = general;
	}
	//以下方法是基本的get set方法，其中包括 name ,age ,general
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getGeneral() {
		return general;
	}

	public void setGeneral(String general) {
		this.general = general;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}//基础set get 方法结束
	
	/*由于实现接口:YoungChild_Inter
	 * 所以必须实现其方法
	 * 增加
	 * 	A1:		父母 ,兄弟
	 * 显示
	 * 	B1:		父母 ,兄弟
	 * */
	@Override//A1:增加：父母 ,兄弟
	public void addParents(String name) {
		// TODO Auto-generated method stub
		profile.addParents(name+"  ");
	}

	@Override
	public void addSiblings(String name) {
		// TODO Auto-generated method stub
		profile.addSiblings(name+"  ");
	}//A1 结束

	@Override//B1:显示父母 ,兄弟
	public void showParents() {
		// TODO Auto-generated method stub
		profile.showParents();
	}

	@Override
	public void showSiblings() {
		// TODO Auto-generated method stub
		profile.showSiblings();
	}//B1 结束
	
	
	
	//以下是基础返回 其中 不包括profile 值得返回
	@Override
	public String toString() {
		return "Person [name=" + name + ", general=" + general + ", age=" + age
				+ "]";
	}
	
	//以下是基础的equals方法

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person_v01 other = (Person_v01) obj;
		if (age != other.age)
			return false;
		if (general == null) {
			if (other.general != null)
				return false;
		} else if (!general.equals(other.general))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

	
}
