package socialNet;
/**
 * ����SocialNet class
 * @author JINDONG ZHANG
 * @version	V1.0
 */
import java.util.ArrayList;

import peopleManager.Person;

public class SocialNet {
	/*
	 * SocialNetϵͳ��Profileϵͳ�Ƿֿ������� ScocialNet ��Ҫ��������������罻���ϵ�� Profile
	 * ��ע�ش�����˵ľ����ϵ,���������profile��ʧ�����Profile"��ʧ"
	 */
	/*
	 * 				----SoocialNet ����:V0.2-----
	 * �Ƴ�ArrayList ԭ��:���� 	
	 * ��������:ArrayList ֻҪ����Driver Class����Ϳ�����
	 * �Ƴ��Ժ�����:���ڵ�SoocialNet ����ֻ��Ϊһ������List ��ѯ����
	 * */
	public SocialNet() {};

	// private int Index;//���ڷ����������

	// public int getIndex(){
	// return Index;
	// }

//	ArrayList<Person> array = new ArrayList<Person>();
//
//	public ArrayList<Person> getArray() {
//		return array;
//	}
	
	public String getRelationshipType(int keyEnter){
		String ListType = null;
		if(keyEnter ==1){
			ListType = "��ĸ";
		}else if(keyEnter ==2){
			ListType = "�ֵ�";
		}else if(keyEnter ==3) {
			ListType = "����";
		}else if(keyEnter ==4) {
			ListType = "ͬѧ";
		}else if(keyEnter ==5) {
			ListType = "����";
		}else if(keyEnter ==6) {
			ListType = "����";
		}else{
			ListType = "";
		}
		return ListType;
	}

	/*
	 * ArrayList ����Ҫset����, ԭ��:���� public void setArray(ArrayList<Person> array) {
	 * this.array = array; }
	 */

	/*
	 * ��������a & b �����ƽ���Helper ���� //a.��һ���˼����罻���� public boolean setPerson(Person
	 * p){ return array.add(p); } //b.�鿴�罻���� public void showAll(){ if(array !=
	 * null){ for(Person p: array){ System.out.println(p); } } }
	 */

	/*
	 * ���´��롾selectPerson ��:ѡ�˲��� �����߼�:���õ�һ�������󣬶Ը����������ж�.��:���ظ�������Ӧ����ֵ����:����-1 �߼�
	 * a.����������String b.forѭ��array.size() c.ͨ��array.get(index)��ȡ����Person����
	 * d.ͨ��Person���� ����Person������getName() e.equals�����ж�������index�������Ƿ���ͬ
	 * f.�������Indexֵ ѡ�˲�����֪��String s ���Ľ�Scanner����
	 */
	/*
	 * public void selectPerson(String s) { for (int x = 0; x < array.size();
	 * x++) { if (s.equals(array.get(x).getName())) {
	 * System.out.println("��ѡ�������:����dang....." + s); Index = x; break;//
	 * ���û��break ��ʹ��ȷҲ�������һ���������� } else if (x > array.size()) {
	 * System.out.println("selectPer print:���޴���"); Index = -1; //
	 * break;//���������break��ζ�ŵ���ѯ��һ����Ϊ����ʱ�� // ����ʹ��Index = -1
	 * ������forѭ�����޷��˶���һ�����Ƿ���ȷ } }// for ѭ������ }//selectPerson ��������
	 */
	/*
	 * ���·�����opAddPerson ��:��������������һ���� Ver_0.1
	 * �߼�:���õ�������Ҫ��ӵĺ������ֺ󣬶Ը�����ָ�����˽�����Ӻ��Ѳ���
	 */
	/*
	 * public void opAddPerson(int Index,String name) {//���õ������Ժ���в���
	 * //System.out.println("opPer print:"+array.get(Index).getName());
	 * //array.get(Index).setName("Lee");//�����ǹ̶�ֱֵ�Ӳ���
	 * //array.get(Index).addFriend(name); }//opPerson ��������
	 */
	/*
	 * ���·�����opAddPerson ��:��������������һ���� Ver_0.2 ����:������������Ϊboolean public boolean
	 * opAddPerson(int Index,String name) { return
	 * array.get(Index).addFriend(name); }
	 */

	/*
	 * ���·�����opCheckPerson ��:��ʾ���� �߼�:�õ������Ժ������ָ�������������ʾ�����к�������
	 */
	/*
	 * public void opCheckPerson(int Index) {//���õ������Ժ���в���
	 * //System.out.println("opPer print:"+array.get(Index).getName());
	 * //array.get(Index).setName("Lee");//�����ǹ̶�ֱֵ�Ӳ���
	 * //array.get(Index).showFriend(); }//opPerson ��������
	 */
	/*
	 * ���·�����getPerson ��:�õ����� �߼�:�õ������󣬶Ը�����ֵָ���˻�ȡ����
	 */
	/*
	 * public String getPerson(int Index) {
	 * //System.out.println("opPer print:"+array.get(Index).getName()); return
	 * array.get(Index).getName(); }//getPerson ��������
	 */
	/*
	 * ���·�����deletePerson ��: ���罻������ɾ��һ���� Ver_0.1 �߼�:ͨ���õ�
	 */
	/*
	 * public void deletePerson(int Index){ array.remove(Index); }
	 */
}
