package profileManager;
/**
 * ����Helper class
 * @author JINDONG ZHANG
 * @version	V1.0
 */
import java.util.ArrayList;

import myException.*;
import peopleManager.Adult;
import peopleManager.Person;
import socialNet.SocialNet;

public class Helper {
	
	private int index;//�����ȡ����ֵ
	
	public int getIndex(){
		return index;
	}
	/*						Part1 :
	 * ProfileHelper //ͨ���� ��Person ���Profile�����ֱ�Ӳ���(_A):
	 * �����ܽ�:
	 * 	Function_A1:	��ָ���˵������ϵ�б������һ����
	 * 	Function_A2:	��ѯָ���˵������ϵ�б�
	 * 	Function_A3: 	��ָ���˵������ϵ�б���ɾ��һ����
	 * 	Function_A4:	����ָ�����˵�Profile statement
	 * 	Function_A5:	���ָ�����˵�Profile statement
	 * 	Function_A6:	����Privacyѡ��
	 * 	Function_A7:	���Photo//������
	 * �����߼�:
	 * 	1��ProfileHelper ���߼����� SocialNetHelper ֮���:
	 * 		��SocialNet ȷ����ָ�������Ժ�,�ٵ���ProfileHelper ���в���
	 * 	2�����Ҫ��ȡprofile����ı���\��������ķ���,
	 * 		a������ͨ��profile ��������(��ȡ\���ó�Ա����)
	 * 		b��ͨ�� �ˡ�Person �����洴���ķ���,Ȼ�����profile���淽��
	 * */
	/*
	 * ��ӷ�����֪: 1.��Ҫ����������Scanner���� 2.���ƺ���Ҫһ���������Ա����Ž����ж� 3.�����Ժ��ѡ������ж�
	 */
	/*						//Function_A1
	 * 
	 * ��ӷ���: �������ϵ�б�������һ����
	 * ��������:
	 * 	a.һ���ˡ�Person b.������֡�String c.����һ��ѡ�� 
	 * �����߼�:
	 * 	a.��ȡ���ˡ�Person, �������Ѿ����ڵĹ�ϵ 
	 * 	b.���ַ���ƴ�ӳ��¹�ϵ 
	 * 	c.ͨ��set���� ���Ǿɹ�ϵ 
	 * �߼�:
	 *	a.1����������Ĺ�ϵ�ĸ���p��Person �� , 2��Ҫ��ӵ��˵�����(���жϹ���)... 3���������
	 * 	b.1��ͨ��p�����䷽��getList 2����ֵ����x 3��concat����������������... 4������newList����
	 * 	c.ͨ��p����setList����,���������newList�Լ�xѡ�������
	 * x��������:��ͬ��������show() ����) 
	 * 	1.parentsList  2.SiblingsList  3.friendList 
	 * 	4.classmateRelations  5.colleagueRelations  6.partner 7.childrenList
	 */
	public void add(Person p, String name, int x) {
		String newList = p.getList(x).concat(" " + name);
		p.setList(x, newList);
	}// ����������ֵ�����List
	
	public void add(Person p, Person p2,int x) {
		String newList = p.getList(x).concat(" " + p2.getName());
		p.setList(x, newList);
		String newList2 = p2.getList(x).concat(" " + p.getName());
		p2.setList(x, newList2);
	}
	
	//���ø�ĸ������
	public void add(Person p, Person p2, Person child_C, int x) {
		//���ø�ĸ��p,p2  �� childrenList,	//x������childrenList
		String newList = p.getList(x).concat(" " + child_C.getName());
		p.setList(x, newList);

		String newList2 = p2.getList(x).concat(" " + child_C.getName());
		p2.setList(x, newList2);
		
		//����С����	parentList//��һ������Ϊ1��ԭ����:��Ҫ�õ�����parentList
		String newList3 = child_C.getList(1).concat(" " + p.getName() +"  "+ p2.getName());
		child_C.setList(1, newList3);
	}
	
							//Function_A2
	//ע��:���ܻ���Ҫ�Ľ�
	public String show(Person p, int x) {
		return p.getList(x);
	}// �������˵�����List����

	/*						//Function_A3_v02
	 * 
	 * ɾ����������: �������˵������ϵ�б���ɾ��һ����[profile_list...
	 * ��������,��������:	
	 * ��Person p�����ڵ���p�ڲ�����-get/set_List(),������ѯ
	 * ��String name����Ҫ����ѯ���˵�����		
	 * ��int x������ָ�����ĸ���ϵ��	Re: x��������
	 * �����߼�:v_01	 
	 * 	a.�ҵ�Ҫɾ�����ַ���name �ڸ��ַ����е�����λ��A��indexOf(str)
	 * 	b.ȷ�������� A_ �����¸�����λ��ǰ��λ��B��name.indexOf(str, fromIndex)
	 * 	c.ƴ������λ��Aǰ�Լ�B����ַ���hoString.substring(beginIndex,
	 * endIndex).concat(hoString.substring(beginIndex)) 
	 * #�߼�:v_02#
	 * 	a.��á�name	���ַ�����
	 * 	b.ƴ�ӳ���name	����������ַ�
	 * 	c.�����List
	 * 	
	 * 	��������:
	 * 	a.�������:	A , B
	 * 	  1.�÷���[indexof()_ͨ����������֡�name_
	 * 		������ָ����ϵ�С�p.getList(x)_�ĵ�һ������λ��indexA
	 * 	  2.�÷���[indexof()_���Ҵ�indexAλ�õ���һ���ո�" " ���ַ���С,��������֡�name_�����峤��
	 * 	b.ƴ�����ַ���:	A1, B1
	 * 	  1.ͨ��substring���������һ��ƴ���ַ���A1, 
	 * 	  2.ͬ����ڶ���ƴ���ַ��� B1.
	 * 	  3.�÷���[concat() ƴ���������ַ���,�����List
	 * 	c.������List:����p�ڲ�����setList��������
	 */
	public void delete(Person p, String name, int x) {
		int indexA = p.getList(x).indexOf(name);
		int indexB = p.getList(x).indexOf(" ", indexA);// " "Ϊ�����õĲ���
		String newString = p.getList(x).substring(0, indexA - 1)
				.concat(p.getList(x).substring(indexB));
		p.setList(x, newString);
	}
	
	/*						//Function_A4
	 * 
	 * �������Է�������:��ָ�����˵��ĵ�[profile ���������ĵ�ǰ״̬[state
	 * �÷�˵��:����֮ǰ�������ж�
	 * */
	public void setStatement(Person p, String statement) {
		if(p instanceof Adult) {
			Adult a = (Adult)p;
			a.setStatus(statement);
		}
	}
	
	/*						//Function_A5
	 * 
	 * ���Profile state ����
	 * ������
	 * */
	public String getStatement(Person p) {
		if(p instanceof Adult) {
			Adult a = (Adult)p;
			String statement = a.getStatus();
			return statement; 
		}
		return "�����û���κ�satus";
	}
	
	/*						//Function_A6
	 * 
	 * ����Privacyѡ��
	 * */
	public void setPrivacy(Person p,boolean option) {
		p.setPrivacy(option);
	}
	
	/*						//Function_A7
	 * 
	 * ���Photo
	 * */
	public void getPhoto(Person p) {
		if(p.getPrivacy()==true) {
			p.getPhoto();
		}
	}
	
	
	
	//----------------------�νӷָ���1-----------------------//
	
	
	
	/* 						Part2:
	 *  SocialNetHelper //��SocialNet�����ֱ�Ӳ���(_B):
	 * �����ܽ�:
	 * 	Function_B1:	���һ���˵��罻������	[SocialNet_array
	 * 	Function_B2:	���罻������ɾ��һ����	[SocialNet_array
	 * 	Function_B3: 	�鿴ָ�������Ƿ�������罻����֮��	[SocialNet_array
	 * 	Function_B4:	��ʾ�����������
	 * 	Function_B5:	��ѯָ�����������˵Ĺ�ϵ:
	 * �����߼�:
	 * 	ProfileHelper ���߼����� SocialNetHelper ֮���:
	 * 		��SocialNet ȷ����ָ�������Ժ�,�ٵ���ProfileHelper ���в���
	 * 	
	 * */
		
	/*						//Function_B1
	 * 
	 * ����ǰ��:ǰ���ж��Ժ���и÷���
	 * ��ӷ�������:���һ���˵���ǰ���罻������[SocialNet_array
	 *	�����߼�:a.����һ��Person�� p ��ӵ�������ArrayList
	 * */
	public boolean add(Person p ,ArrayList<Person> array){//new Person("")...
		return array.add(p);
	}
	
	/*						//Function_B2
	 * 
	 * ɾ����������:���罻������ɾ��һ����[SocialNet_array
	 * 	ɾ��һ���˵ķ����߼�:(�������:��Ҫ�ɶ�������μ�������)
	 * 		a.ѡ�˷���(checkPeople
	 * 		b.ɾ������ (delete
	 * 		c.��ɾ��ǰ����һ�β�ѯ������ȷ���ж�,���ȷ������ѡ�˷�����indexֵ
	 * 		d.���û�ȷ���Ժ���ø÷���������ɾ��
	 * */
//	public void delete(ArrayList<Person> array , int index){
//		array.remove(index);
//		System.out.println("�Ѿ��ɹ�ɾ��");
//	}
//	public void delete(Person p, String name, int x) {
//		int indexA = p.getList(x).indexOf(name);
//		int indexB = p.getList(x).indexOf(" ", indexA);// " "Ϊ�����õĲ���
//		String newString = p.getList(x).substring(0, indexA - 1)
//				.concat(p.getList(x).substring(indexB));
//		p.setList(x, newString);
//	}
	/*ɾ������*/
	public void delete(ArrayList<Person> array , String name){
		for(Person p : array) {
			for(int keyEnter = 1 ;keyEnter <8 ;keyEnter ++) {
                            if(p.getList(keyEnter) != null){
                                if(p.getList(keyEnter).contains(name)) {//˵���ж���
					int indexA = p.getList(keyEnter).indexOf(name);
					int indexB = p.getList(keyEnter).indexOf(" ", indexA);// " "Ϊ�����õĲ���
					String newString = p.getList(keyEnter).substring(0, indexA - 1)
							.concat(p.getList(keyEnter).substring(indexB));
					p.setList(keyEnter, newString);
					return;//���ѭ��ɾ��
				}
                            }
				
			}
		}
	}
	
	/*						//Function_B3
	 * 
	 * �鿴ѡ��һ�����Ƿ�������罻����֮��[SocialNet_array
	 * */
	public int checkPeople(ArrayList<Person> array , String name){
		for (int x = 0; x < array.size(); x++) {
			if (name.equals(array.get(x).getName())) {
				//System.out.println("��ѡ�������:����dang....." + name);
				return index = x;
				//break;// ���û��break ��ʹ��ȷҲ�������һ����������
			} else if( x >=array.size() ){//�������ֻ��else�Ļ��ж����һ���Ͳ��ж���
				//��仰������������¡�x >=array.size() �ǲ�����ִ�е�
				//��Ϊfor ��� ..����x��Զ�����ܴ��ڵ���size()
				//System.out.println("selectPer print:���޴���");
				//return index = -1;
				// break;//���������break��ζ�ŵ���ѯ��һ����Ϊ����ʱ��
				// ����ʹ��Count = -1 ������forѭ�����޷��˶���һ�����Ƿ���ȷ
			}
		}// for ѭ������
		return index = -1;
	}
	
	/*						//Function_B4
	 * 
	 * �鿴�����������
	 * */
	public void show(ArrayList<Person> array){//sn.getArray
		System.out.println("��ǰ�罻������Ϣ����:");
		for(Person p: array){
			System.out.println(p);
		}
	}
	
	/*						//Function_B5
	 * 
	 * Helper��ѯ���������˵Ĺ�ϵ:
	 * ����Ԫ��˵��;SocialNet(����ԭ��:��SocialNet �ڵ�ArrayList �Ƴ�[����])
	 * �����߼�v_01:
	 * 	a.��ȡ�������ж��������,A B b.��A�������� B�����ȫ���б��в����Ƿ���ڣ�����������б�
	 * �����߼�v_02:
	 * 	0.����һ���յ�ListType
	 * 	a.ͨ����ѯһ���˵ġ�Function_B4 �������һ���˵�indexֵ :	"A"
	 * 	b.ͨ����ѯһ���˵ġ�Function_B4 ���������һ���˵�indexֵ:	"B"
	 * 	c.ͨ��A�Ĳ鿴�����˵�����List������Function_A2 ���鿴B�Ƿ���A��List����[indexOf
	 * 	d.�Ѵ˷��ظ�,֪���鿴�����е�ListΪֹ
	 * �����߼�v_02.1:
	 * 	a.ͨ����ѯһ���˵ġ�Function_B4 �������һ���˵�indexֵ :	"A"
	 * 	b.ͨ����ѯһ���˵ġ�Function_B4 ���������һ���˵�indexֵ:	"B"
	 * 	c.ͨ���鿴���ǵ����䣬�Լ�������͹�ϵ���ų����õ�list
	 * 	d.ͨ��A�Ĳ鿴�����˵�����List������Function_A2 ���鿴B�Ƿ���A��List����[indexOf
	 * 
	 * ʹ��˵��:���ø÷�����,��һ�� �µ�String listType����,
	 * 	Ȼ���ӡ��:" �������˵Ĺ�ϵ��:"+ listType ����Ч��
	 *	
	 */
	public String checkRela(int indexA, int indexB, ArrayList<Person> array, String listType,SocialNet sn) {
		// ArrayList<Person> a = sn.getArray();
		
		/*sn.getArray().get(indexA).getList(1).indexOf(sn.getArray().get(indexB).getName());
		sn.getArray().get(indexA).getList(2).indexOf(sn.getArray().get(indexB).getName());
		sn.getArray().get(indexA).getList(3).indexOf(sn.getArray().get(indexB).getName());
		sn.getArray().get(indexA).getList(4).indexOf(sn.getArray().get(indexB).getName());
		sn.getArray().get(indexA).getList(5).indexOf(sn.getArray().get(indexB).getName());
		sn.getArray().get(indexA).getList(6).indexOf(sn.getArray().get(indexB).getName());*/
		for(int x=1 ; x<=6 ; x++) {
			//���SocialNet.����ˡ�Person.��ù�ϵ��[x.ȷ���Ƿ����(���SocialNet.����ˡ�Person.�������)
			if(array.get(indexA).getList(x).indexOf(array.get(indexB).getName()) != -1) {
				listType += sn.getRelationshipType(x)+"   ";//"   "�������ü��
			}
		}
		return listType;
	}

	
	
	//--------------------�νӷָ���2----------------------//
	
	
	
	/*						Part3(ǰ�÷���):
	 * 
	 *�����ܽ�:
	 * 	Function_C1:	_����
	 * 	Function_C1_2:	_����С��
	 * 	Function_C1_3: 	_ɾ������
	 * 	Function_C2:	_���ڷ���
	 * 	Function_C3:	_����ͬѧ
	 * 	Function_C4:	_����ͬ��
	 * 	Function_C5:	_��������
	 * 
	 * 
	 * ���������Թ�ϵ֮ǰ�Զ���ӡ�������˵ı��:		
	 * exp:		Adult 		: 	Lee Min Tear
	 * 			Child 		:	Anmy Emma
	 * 			YougChild	:	Bob Cathy
	 * 
	 * ͨ��SocialNet ���ж�Profile �Ĳ���:	[ǰ�÷��� ���֡���Function_C
	 * ˵����:Function_C2...��ʼΪ���ù�ϵǰ�������жϷ���
	 * ������:
	 * 	Other_types_exception_database
	 * 	NoParentException				
	 * */
	
	//Function test
	public void beStart(int a,int b) throws TooYoungException {
		if(a ==1 || b==1) {
			throw new TooYoungException("����̫С�޷�������");
		}
	}
	
	/*						//Function_C1
	 * 
	 * ǰ����������֮�������� 	������beforeSetAge
	 * ��������:��׼����������ʱ
	 * �߼��ж�˳��:
	 * 	a.����������ʱ ���ø÷���
	 * 	c.������a,������ʱ��,�ν���һ��������������
	 * */
	public boolean beforeSetAge(int age) throws NoSuchAgeException {
		boolean flag = true;
		if(age < 0 || age > 150) {
			throw new NoSuchAgeException("���䲻��ʵ��");
		}
		return flag;
	}
	/*						//Function_C1_2
	 * 
	 * ǰ����������֮����С��	������beforeSetChilds
	 * ��������:��׼������С��ʱ
	 * �߼�:
	 * 	a.������һ��С����������Ӹ�ĸ
	 * 		A.��ʾһ������������б��һ���ǵ���������б�
	 * 		B.��ʾ���г���������
	 * 	b.�ж�2�����Ƿ��ǳ�����
	 * 		A.����:
	 * 			c.�ж��������Ƿ��Ƿ���
	 * 				A:����:������ν�֮��ķ���
	 * 				B:û��:B2_û��:˦�쳣[NoParentException
	 * 		B.û��:NotToBeCoupledException
	 * */
//	public void beforeSetChilds(int parent_A,int parent_B, int child, ArrayList<Person> array ) throws NotToBeCoupledException, NoParentException {
//		if(array.get(parent_A).getAge() < 17  || array.get(parent_A).getAge() < 17) {
//			throw new NotToBeCoupledException("δ����G");
//		}else {
//			//�ж�һ���˵İ����б��Ƿ�����һ���˴���,������� ��indexof != -1
//			if(array.get(parent_A).getList(6).indexOf(array.get(parent_B).getName()) != -1 ) {
////				System.out.println("���Ƿ�ȷ������������Ϊ���С���ĸ�ĸ��");
//			}else {
//				throw new NoParentException("���Ƿ��ޚG");
//			}
//		}
//	}
	public void beforeSetChilds(Person a,Person b) throws NotToBeCoupledException, NoParentException {
		if(a.getAge() < 17  || b.getAge() < 17) {
			throw new NotToBeCoupledException("δ����G");
		}else {
			//�ж�һ���˵İ����б��Ƿ�����һ���˴���,������� ��indexof != -1
			if(a.getList(6).indexOf(b.getName()) != -1 ) {
//				System.out.println("���Ƿ�ȷ������������Ϊ���С���ĸ�ĸ��");
			}else {
				throw new NoParentException("���Ƿ��ޚG");
			}
		}
	}
	/*						//Function_C1_3
	 * 
	 * ǰ����������֮ɾ������	������beforeDeltetAdults
	 * ��������:��׼��ɾ������ʱ
	 * �߼�:
	 * 	a.����һ������
	 * 	b.�ж���������Ƿ���С��
	 * 		A_����:˦�쳣NoParentException
	 * 		B_û��:������,�νӲ���
	 * */
	public void beforeDeltetAdults(int a, ArrayList<Person> array ) throws NoParentException {
		if(array.get(a).getList(7) != null) {
			throw new NoParentException("���Ӳ���û�е���");
		}
//		}else {
//			System.out.println("��ȷ��ɾ�������ô��");
//		}
	}
	
	/*
	 * ����һ�����������˹�ϵ�ķ���
	 * �߼�:
	 * 	a.������ǵ�indexֵ A & B//������ˡ�Person �඼�ܽ����������
	 * 	b.�����������Ǳ��ʲô���Ĺ�ϵ 	Re: x��������
	 * 	c.���������жϽ����ж�	[exception
	 * 		1.���޷��ɹ�ʱ�� ����[exception
	 * 		2.���ɹ���ʱ�� ����
	 * 	e.
	 * �߼�v2:
	 * 	a.ͨ��ʹ�� "�鿴"������Function_B3,�ֱ���indexֵ  A B
	 * 	b.�û�������������Ҫ�Ĺ�ϵ����
	 *	c.ͨ����ͬ�Ĺ�ϵ������˦����
	 *	d.��ϵ��ѡ���ж�,�÷����ϲ��ж�
	 * */

	/*
	 * 				--------x��������:--------keyEnter
	 * 	1.parentsList	2.SiblingsList	3.friendList
	 * 	4.classmateRelations	5.colleagueRelations
	 * 	6.partner	7.childrenList
	 * */
	
	/*						//Function_C2
	 * ���ڷ���:
	 * ǰ����������֮���޹�ϵ 	��beforeSetPartner x����=6
	 * ��������:��׼�����÷��޹�ϵʱ
	 * �Ⱦ�����:��ȷ����Ҫ���÷��޹�ϵ��[x������֪,���������߼�˳��
	 * �߼��ж�˳��:
	 * 	a.�ж��Ƿ񶼴���18;
	 * A_����:	
	 * 	b.�жϴ˶��˵�partner�Ƿ�Ϊ��
	 * 		A2_����:���һ�����,�ν���һ��������������
	 * 		B2_û��:˦�쳣[NoAvailableException
	 * B_û��:����ֱ���쳣//[NotToBeCoupledException
	 * 	
	 * */
	public void beforeSetPartner(int a, int b, ArrayList<Person> array) throws NoAvailableException, NotToBeCoupledException {
		if(array.get(a).getAge()>=17 && array.get(b).getAge()>=17 ) {
			if(array.get(a).getList(6) == null &&  array.get(b).getList(6) == null) {
				System.out.println("���Ƿ�Ҫ����������Ϊ:partner ?");
			}else {
				throw new NoAvailableException("Someone is already connected with another adult as a couple");
			}
		}else {
			throw new NotToBeCoupledException("������һ���˲���������");
		}
	}
	
	/*						//Function_C3
	 * ����ͬѧ:
	 * ǰ����������֮����ͬѧ 	������beforeSetClassmates x����=4
	 * ��������:��׼������ͬѧʱ
	 * �Ⱦ�����:��ȷ����Ҫ����ͬѧ��[x������֪,���������߼�˳��
	 * �߼��ж�˳��:
	 * a.�ж��Ƿ���һ����С��3;
	 * 	A_����:	˦�쳣
	 * 	B_û��:	���һ�����,�ν���һ��������������
	 * */
	public void beforeSetClassmates(int a, int b, ArrayList<Person> array)throws NotToBeClassmatesException {
		if (array.get(a).getAge() < 3 || array.get(b).getAge() < 3) {
			throw new NotToBeClassmatesException("����������������ͬѧ");
		}
	}
	
	/*						//Function_C4
	 * ����ͬ��:
	 * ǰ����������֮����ͬ�� 	������NotToBeColleaguesException x����=5
	 * ��������:��׼������ͬ��ʱ
	 * �Ⱦ�����:��ȷ����Ҫ����ͬѧ��[x������֪,���������߼�˳��
	 * �߼��ж�˳��:
	 * a.�ж��Ƿ���һ����С��17;
	 * 	A_����:	˦�쳣
	 * 	B_û��:	���һ�����,�ν���һ��������������
	 * */
	public void beforeSetColleagues(int a, int b, ArrayList<Person> array) throws NotToBeColleaguesException{
		if (array.get(a).getAge() < 17 || array.get(b).getAge() < 17) {
			throw new NotToBeColleaguesException("�����������й���");
		}else {
			System.out.println("��ȷ��Ҫ����ͬ�¹�ϵô��");
		}
	}
	
	/*						//Function_C5
	 * ��������:
	 * ǰ����������֮�������� 	������NotToBeFriendsException x����=3
	 * ��������:��׼����������ʱ
	 * �Ⱦ�����:��ȷ����Ҫ�������Ѻ�[x������֪,���������߼�˳��
	 * �߼��ж�˳��:
	 * 	a.�ж��������Ƿ�����С��3��			(����1)
	 * A_����:	˦�쳣[TooYoungException
	 * B_û��:	�ν���һ��������������
	 * 
	 * 	a1.	�ж���A ,B��class �Ƿ���ͬ	(����2)
	 * A_����:	
	 * 	b.�ж��Ƿ����������3��(�������ֵ)
	 * 		A_����:˦�쳣[NotToBeFriendsException ����3�겻�ܽ�����
	 * 		B_û��:���һ�����,
	 * B_û��:	˦�쳣[NotToBeFriendsException ���Ͳ���ͬ���ܽ�����
	 * 	
	 * �����߼�����:�ж��Ƿ���һ����С��17(δ����)����һ����>=17(����)//����
	 * */
	public void beSetFriend(int a, int b, ArrayList<Person> array) throws NotToBeFriendsException, TooYoungException {
		if(array.get(a).getAge()<3 || array.get(b).getAge()<3) {
			throw new TooYoungException("����̫С�޷�������");
		}
		if (array.get(a).getClass() == array.get(b).getClass()) {
			if(Math.abs(array.get(a).getAge()-array.get(b).getAge()) >3) {
				throw new NotToBeFriendsException("����̫���ܽ�����");
			}else {
				System.out.println("��ȷ��Ҫ�������ѹ�ϵô��");
			}
		}else {
			throw new NotToBeFriendsException("�������˲��ܽ�������");
		}
	}
	

}// end of Helper������ >_< !!  back

	
	
	
