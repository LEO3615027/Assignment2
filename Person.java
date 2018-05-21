package People;
/**
 * 这是abstract Person class
 * @author JINDONG ZHANG
 * @version	V1.0
 */
import Profile.Profile;

/*
 * Person类使用注意事项:在创建该类之前需要先判断年龄的大小	int age
 * */
public abstract class Person{
	private int age;//它的年龄
	private String name;//这个人的名字
	private String general;//他的性别
	Profile profile = new Profile();
	
	/*
	 * public String getFa(){//p1 return profile.getParentsList();
	 * public void setFa(String parentsList){//p2
	 * profile.setParentsList(parentsList); } }
	 */
	
	/*
	 * 	获得List文件
	 * 	逻辑:		通过输入不同的参数得到不同的List文件
	 * 	x参数详情:【同样适用于show() 方法) 
	 * 		1.parentsList	2.SiblingsList	3.friendList
	 * 		4.classmateRelations			5.colleagueRelations
	 * 		6.partner
	 * 	tip:x参数必须一致
	 * */
	public String getList(int keyEnter){
		String a = null;
		if(keyEnter ==1){
			a = profile.getParentsList();
		}else{
			a = profile.getSiblingsList();
		}
		return a;
	}
	

	/*
	 * 设置List文件
	 * 逻辑:	
	 * 		1、通过Helper 获得不同的List文件 
	 * 		2、通过Helper 获得参数,
	 * 		3、根据参数的不同,调用底层Profile中方法 设置List
	 * */
	public void setList(int keyEnter2,String anyList){
		if(keyEnter2 == 1){
			profile.setParentsList(anyList);
		}else{
			profile.setSiblingsList(anyList);
		}
	}

	public void setPrivacy(boolean option) {
		profile.setPrivacy(option);
	}
	
	public boolean getPrivacy() {
		return profile.getPrivacy();
		
	}
	
	public void getPhoto() {
		profile.getPhoto();	
	}
	
	//以下方法是Person的有参构造
	Person(int age, String name, String general) {
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
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
