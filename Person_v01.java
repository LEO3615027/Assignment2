package peopleManager;

import optional_Interface.YoungChild_Inter;
import profileManager.Profile;
import profileManager.Profile_v01;

/*
 * Person��ʹ��ע������:�ڴ�������֮ǰ��Ҫ���ж�����Ĵ�С	int age
 * */
public abstract class Person_v01 implements YoungChild_Inter {
	private int age;//��������
	private String name;//����˵�����
	private String general;//�����Ա�
	
	
	Profile_v01 profile = new Profile_v01();
	//����һ������	�ڴ���һ��ָ�������Ķ����Ժ� ��������ʵ��interface
	/*public void addFriend(String name){
		profile.addFriend(name);
	}
	//����һ��չʾ��������
	public void showFriend(){
		profile.showFriend();
	}*/
	//ArrayList<Profile> profileInPerson = new ArrayList<Profile>();
	//����������������ô���һ���˵��ĵ�
	
	//���·�����Person���вι���
	Person_v01(int age, String name, String general) {
		this.age = age;// ��age����ǰ���ԭ����Ҫ���жϴ����� ������
		this.name = name;
		this.general = general;
	}
	//���·����ǻ�����get set���������а��� name ,age ,general
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
	}//����set get ��������
	
	/*����ʵ�ֽӿ�:YoungChild_Inter
	 * ���Ա���ʵ���䷽��
	 * ����
	 * 	A1:		��ĸ ,�ֵ�
	 * ��ʾ
	 * 	B1:		��ĸ ,�ֵ�
	 * */
	@Override//A1:���ӣ���ĸ ,�ֵ�
	public void addParents(String name) {
		// TODO Auto-generated method stub
		profile.addParents(name+"  ");
	}

	@Override
	public void addSiblings(String name) {
		// TODO Auto-generated method stub
		profile.addSiblings(name+"  ");
	}//A1 ����

	@Override//B1:��ʾ��ĸ ,�ֵ�
	public void showParents() {
		// TODO Auto-generated method stub
		profile.showParents();
	}

	@Override
	public void showSiblings() {
		// TODO Auto-generated method stub
		profile.showSiblings();
	}//B1 ����
	
	
	
	//�����ǻ������� ���� ������profile ֵ�÷���
	@Override
	public String toString() {
		return "Person [name=" + name + ", general=" + general + ", age=" + age
				+ "]";
	}
	
	//�����ǻ�����equals����

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
