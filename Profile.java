package Profile;
/**
 * ����Profile class
 * @author JINDONG ZHANG
 * @version	V1.0
 */
public class Profile{
	/*
	 * ������ profile�еĸ����б�
	 * 	���а���:	���ѣ�ͬ�£�ͬѧ�����£��ҳ�
	 * 
	 * ������֪:��������Ĳ�ͬ�ܹ��������б�Ҳ��ͬ
	 * 	����:�ڳ����˼�����:�������ѵķ�������СС������û�и÷���
	 */	
	
	String parentsList = "��ĸ�ĸ��:";//���ô���ҳ� 2��
	String SiblingsList = "����ֵܽ�����: ";//���ô����ֵܽ���
	String friendList = "";// �е������б�
	String classmateRelations = "";//���ô���ͬѧ
	String colleagueRelations = "";//���ô���ͬ��
	String partner = "";//���ô������� 1��
	String childrenList = "";//����һ��С��
	
	//�����ǻ���set/get
	public String getParentsList() {
		return parentsList;
	}
	public void setParentsList(String parentsList) {
		this.parentsList = parentsList;
	}
	public String getSiblingsList(){
		return SiblingsList;
	}
	public void setSiblingsList(String SiblingsList){
		this.SiblingsList = SiblingsList;
	}
	public String getFriendList() {
		return friendList;
	}
	public void setFriendList(String friendList) {
		this.friendList = friendList;
	}
	public String getClassmateRelations() {
		return classmateRelations;
	}
	public void setClassmateRelations(String classmateRelations) {
		this.classmateRelations = classmateRelations;
	}
	public String getColleagueRelations() {
		return colleagueRelations;
	}
	public void setColleagueRelations(String colleagueRelations) {
		this.colleagueRelations = colleagueRelations;
	}
	public String getPartner() {
		return partner;
	}
	public void setPartner(String partner) {
		this.partner = partner;
	}
	
	public void setchildrenList(String childrenList) {
		this.childrenList = childrenList;
	}
	
	public String getchildrenList() {
		return childrenList;
	}
	/*
	 * ���¹�������������״̬
	 * */
	String status = "";//����һ�仰���������ڵ�״̬
	
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return status;
	}
	/*
	 * ��ʾ������status��ѡ���
	 * */
	boolean option;//��ʾ
	
	public void setPrivacy(boolean option){
		this.option = option;
	}
	
	public boolean getPrivacy(){
		return option;
	}
	/*
	 * ���¹�������չʾ֮��ĵ���չʾstatus������
	 * */
	public void getPhoto() {
		System.out.println("���Photo");
	}
	
	
	
	/*�������������֪:
	 *  1.��Ҫ����������Scanner����
	 *  2.���ƺ���Ҫһ���������Ա����Ž����ж�
	*/

	

	
	
	
	
	
	
	
	
	
	/*ʵ��interface
	 * public void addFriend(String name){
		friendList = friendList.concat(" "+name);
		//friend += name;
		//return friend;
	}
	
	public void showFriend(){
		System.out.println("���������: "+ friendList);
	}*/
	//������.....��������get/set Rela����Ӧ������Ϊinterface
	
	/*public boolean addFriend(String name){//���ﴫ�����PersonΥ���߼�
		return arrInPerson.add(name);//add�����ڱ���ֻ����arr ��������������
	}
	
	public void showFriend(){
		
		 * ��ArrayList ��������ΪObjectʱ��
		 * ����õ���������ǿfor���toStringЧ��
		 * ��ͨfor����:   ������.����
		 * 
		 * ����ArrayList arrInPerson��������ΪString ���Կ���ֱ�ӵ���������ǿfor
		 * 
		���� "Hi "+name+" ���������:" s & s��Ч�� 
		 * �߼�Ҫ��:ȷ�����Ƿ������һ�����������
		 * System.out.println("Hi "+name+" ���������:");
		for(String s: arrInPerson){
			System.out.print(s+" ");
		}
		˼��:if ,��it.hasNext() ���ж����Դ�������������
		 * ��Ϊʲô����while ���Դ��ȫ���������ڲ��߼���ʲô����
		 * Iterator<String > it = arrInPerson.iterator();
		if(it.hasNext()){
			System.out.println();
			String s = it.next();
			System.out.println(s);
		}
		
		while(it.hasNext()){
			System.out.println();
			String s = it.next();
			System.out.println(s);
		}
		
		���õ���������ж��߼�
		 * �߼�����:
		 * while + it.hasNext()��Ϊ�ⲿѭ�����ȫ����
		 * if + it.hasNext()��Ϊ�ڲ��жϡ�
		
		 Iterator<String > it = arrInPerson.iterator();
		 System.out.print("Hi "+name+" ���������:");
			while(it.hasNext()){
				String s = it.next();
				System.out.print(s);
				if(it.hasNext()){
					System.out.print(" and ");
				}else{
					System.out.print("; ");
				}
			}
	}*/
}