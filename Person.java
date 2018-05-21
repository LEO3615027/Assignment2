package People;
/**
 * ����abstract Person class
 * @author JINDONG ZHANG
 * @version	V1.0
 */
import Profile.Profile;

/*
 * Person��ʹ��ע������:�ڴ�������֮ǰ��Ҫ���ж�����Ĵ�С	int age
 * */
public abstract class Person{
	private int age;//��������
	private String name;//����˵�����
	private String general;//�����Ա�
	Profile profile = new Profile();
	
	/*
	 * public String getFa(){//p1 return profile.getParentsList();
	 * public void setFa(String parentsList){//p2
	 * profile.setParentsList(parentsList); } }
	 */
	
	/*
	 * 	���List�ļ�
	 * 	�߼�:		ͨ�����벻ͬ�Ĳ����õ���ͬ��List�ļ�
	 * 	x��������:��ͬ��������show() ����) 
	 * 		1.parentsList	2.SiblingsList	3.friendList
	 * 		4.classmateRelations			5.colleagueRelations
	 * 		6.partner
	 * 	tip:x��������һ��
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
	 * ����List�ļ�
	 * �߼�:	
	 * 		1��ͨ��Helper ��ò�ͬ��List�ļ� 
	 * 		2��ͨ��Helper ��ò���,
	 * 		3�����ݲ����Ĳ�ͬ,���õײ�Profile�з��� ����List
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
	
	//���·�����Person���вι���
	Person(int age, String name, String general) {
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
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
