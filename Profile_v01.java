package profileManager;

import optional_Interface.Adult_Inter;

public class Profile_v01 implements Adult_Inter{
//last_update2018/5/11 
	/*
	 * ������ profile�еĸ����б�
	 * 	���а���:	���ѣ�ͬ�£�ͬѧ�����£��ҳ�
	 * 
	 * ������֪:��������Ĳ�ͬ�ܹ��������б�Ҳ��ͬ
	 * 	����:�ڳ����˼�����:�������ѵķ�������СС������û�и÷���
	 */	
	String parentsList = "";//���ô���ҳ� 2��
	String SiblingsList = "";//���ô����ֵܽ���
	String friendList = "";// �е������б�
	String classmateRelations = "";//���ô���ͬѧ
	String colleagueRelations = "";//���ô���ͬ��
	String partner = "";//���ô������� 1��
	
	/*
	 * ���¹�������������״̬
	 * */
	String status = "";//����һ�仰���������ڵ�״̬
	public void setStatus(String status){
		this.status = status;
	}
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
	
	/*
	 * ���·����ֱ��ǣ�Part1
	 * 	����:��ĸ ,�ֵ� ,����,ͬѧ ,ͬ�� ,����
	 * */

	public void addParents(String name) {
		// TODO Auto-generated method stub
		parentsList = parentsList.concat(" "+name);
	}


	public void addSiblings(String name) {
		// TODO Auto-generated method stub
		SiblingsList = SiblingsList.concat(" "+name);
	}// ���ӣ���ĸ ,�ֵ� ����

	// ���ӣ�����,ͬѧ
	@Override
	public void addFriend(String name) {
		// TODO Auto-generated method stub
		friendList = friendList.concat(" "+name);
	}

	@Override
	public void addClassmate(String name) {
		// TODO Auto-generated method stub
		classmateRelations = classmateRelations.concat(" "+name);
	}// ���ӣ�����,ͬѧ����

	// ����:ͬ�� ,����
	@Override
	public void addColleague(String name) {
		// TODO Auto-generated method stub
		colleagueRelations = colleagueRelations.concat(" "+name);
	}

	@Override
	public void addPartner(String name) {
		// TODO Auto-generated method stub
		partner = partner.concat(" "+name);
	}// ����:ͬ�� ,���˽���

	/*
	 * ���·�����:Part2 ��ʾ:��ĸ ,�ֵ� ,����,ͬѧ ,ͬ�� ,����
	 */

	public void showParents() {
		// TODO Auto-generated method stub
		System.out.println("��ļ����� : "+parentsList);
	}


	public void showSiblings() {
		// TODO Auto-generated method stub
		System.out.println("�ֵܽ����� : "+SiblingsList);
	}// ��ʾ:��ĸ ,�ֵ� ����

	// ��ʾ:����,ͬѧ
	@Override
	public void showFriend() {
		// TODO Auto-generated method stub
		System.out.println("���������: "+friendList);
	}

	@Override
	public void showClassmate() {
		// TODO Auto-generated method stub
		System.out.println("���ͬѧ��: "+classmateRelations);
	}// ��ʾ:����,ͬѧ����

	// ��ʾ:ͬ�� ,����
	@Override
	public void showColleague() {
		// TODO Auto-generated method stub
		System.out.println("���ͬ����: "+colleagueRelations);
	}

	@Override
	public void showPartner() {
		// TODO Auto-generated method stub
		System.out.println("���������: "+partner);
	}// ��ʾ:ͬ�� ,���˽���

	
	
	
	
	
	
	
	
	
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