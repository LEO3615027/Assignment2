package Profile;

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
	public void setStatus(String status){
		this.status = status;
	}
	
	/*
	 * ���¹�������������״̬
	 * */
	String status = "";//����һ�仰���������ڵ�״̬
	
	/*
	 * ��ʾ������status��ѡ���
	 * */
	int SH = 1;//��ʾ
	public void setSH(int SH){
		this.SH = SH;
	}
	/*���¹�������չʾ֮��ĵ���չʾstatus������
	 * */
	public void showSH(){
		if(SH == 1){
			System.out.println(status);
		}else{
			System.out.println("I do not want to show my status");
		}
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