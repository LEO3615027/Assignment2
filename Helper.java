package Profile;

import java.util.ArrayList;
import People.Person;
import SocailNet.SocialNet;

public class Helper {

	// Part1 :ProfileHelper //��Profile����и�������
	/*
	 * ��ӷ�����֪: 1.��Ҫ����������Scanner���� 2.���ƺ���Ҫһ���������Ա����Ž����ж� 3.�����Ժ��ѡ������ж�
	 */

	/*
	 * ��ӷ����߼�: �������ϵ�б�������һ���� ��������:a.һ���ˡ�Person b.������֡�String c.����һ��ѡ�� �����߼�:
	 * a.��ȡ���ˡ�Person, �������Ѿ����ڵĹ�ϵ b.���ַ���ƴ�ӳ��¹�ϵ c.ͨ��set���� ���Ǿɹ�ϵ �߼�:
	 * a.1����������Ĺ�ϵ�ĸ���p��Person �� , 2��Ҫ��ӵ��˵�����(���жϹ���)... 3���������
	 * b.1��ͨ��p�����䷽��getList 2����ֵ����x 3��concat����������������... 4������newList����
	 * c.ͨ��p����setList����,���������newList�Լ�xѡ����� x��������:��ͬ��������show() ����) 1.parentsList
	 * 2.SiblingsList 3.friendList 4.classmateRelations 5.colleagueRelations
	 * 6.partner
	 */
	public void add(Person p, String name, int x) {
		String newList = p.getList(x).concat(" " + name);
		p.setList(x, newList);
	}// ����������ֵ�����List

	public String show(Person p, int x) {
		return p.getList(x);
	}// �������˵�����List����

	/*
	 * ɾ�������߼� �������ϵ�б���ɾ��һ���� �����߼� a.�ҵ�Ҫɾ�����ַ��ڸ��ַ����е�����λ��A��indexOf(str)
	 * b.��¼�Ӹ�����λ�������¸�����λ��ǰ��λ��B��name.indexOf(str, fromIndex)
	 * c.ƴ������λ��Aǰ�Լ�B����ַ���hoString.substring(beginIndex,
	 * endIndex).concat(hoString.substring(beginIndex)) �߼�:
	 * a.�õ���һ��indexA,ͨ��Ҫ����ҵ����� b.�õ��ڶ���indexB,ͨ���б�����,���Ҵ������䣬��һ������λ�õ��ַ���
	 * c.ͨ��substring���������һ��ƴ���ַ���, d.ͬ����ڶ���ƴ���ַ��� e.ƴ���������ַ���,��ò�������List
	 */
	public void delete(Person p, String name, int x) {
		int indexA = p.getList(x).indexOf(name);
		int indexB = p.getList(x).indexOf(" ", indexA);// " "Ϊ�����ò���
		String newString = p.getList(x).substring(0, indexA - 1)
				.concat(p.getList(x).substring(indexB));
		p.setList(x, newString);
	}

	// Part1 ProfileHelper ��End

	// Part2 SocialNetHelper
	
	/*
	 *	����һ���˵���ǰ���罻�����С�SocialNet
	 *	�����߼�:a.����һ��Person�� p ��ӵ�������ArrayList
	 * */
	public void add(Person p ,ArrayList<Person> array){//new Person("")...
		array.add(p);
	}
	
	public void show(ArrayList<Person> array){//sn.getArray
		System.out.println("��Ϣ����:");
		for(Person p: array){
			System.out.println(p);
		}
	}
	/*
	 * Helper��ѯ���������˵Ĺ�ϵ:�����߼� a.��ȡ�������ж��������,A B b.��A�������� B�����ȫ���б��в����Ƿ���ڣ�����������б�
	 */
	public void checkRela(String name, String name2, SocialNet sn) {
		// ArrayList<Person> a = sn.getArray();
		sn.getArray().get(1).getName();
	}

	/*
	 * �������������֪: 1.��Ҫ����������Scanner���� 2.���ƺ���Ҫһ���������Ա����Ž����ж�
	 */
	/*
	 * ���·����ֱ��ǣ�Part1 ����:��ĸ ,�ֵ� ,����,ͬѧ ,ͬ�� ,����
	 */

	// ��Ϊ���ӹ��ܣ�ѡ�����û��ж����Ժ󣬼���̶��ַ���

	/*
	 * public void addParents(String parentsList,String name) { // TODO
	 * Auto-generated method stub parentsList = parentsList.concat(" "+name); }
	 * 
	 * 
	 * public void addSiblings(String SiblingsList,String name) { // TODO
	 * Auto-generated method stub SiblingsList = SiblingsList.concat(" "+name);
	 * }// ���ӣ���ĸ ,�ֵ� ����
	 * 
	 * // ���ӣ�����,ͬѧ public void addFriend(String friendList,String name) { //
	 * TODO Auto-generated method stub friendList = friendList.concat(" "+name);
	 * }
	 * 
	 * public void addClassmate(String classmateRelations,String name) { // TODO
	 * Auto-generated method stub classmateRelations =
	 * classmateRelations.concat(" "+name); }// ���ӣ�����,ͬѧ����
	 * 
	 * // ����:ͬ�� ,���� public void addColleague(String colleagueRelations, String
	 * name) { // TODO Auto-generated method stub colleagueRelations =
	 * colleagueRelations.concat(" "+name); }
	 * 
	 * public void addPartner(String partner, String name) { // TODO
	 * Auto-generated method stub partner = partner.concat(" "+name); }// ����:ͬ��
	 * ,���˽���
	 */
	/*
	 * ���·�����:Part2 ��ʾ:��ĸ ,�ֵ� ,����,ͬѧ ,ͬ�� ,���� ��Ϊ��ʾ����: ֻҪ���ж�֮��ֻҪ�����ַ������ɣ�
	 * exp:"���XX�� : "+parentsList
	 */

	/*
	 * public void showParents(String parentsList) { // TODO Auto-generated
	 * method stub System.out.println("��ļ����� : "+parentsList); }
	 * 
	 * 
	 * public void showSiblings(String SiblingsList) { // TODO Auto-generated
	 * method stub System.out.println("�ֵܽ����� : "+SiblingsList); }// ��ʾ:��ĸ ,�ֵ� ����
	 * 
	 * // ��ʾ:����,ͬѧ
	 * 
	 * @Override public void showFriend() { // TODO Auto-generated method stub
	 * System.out.println("���������: "+friendList); }
	 * 
	 * @Override public void showClassmate() { // TODO Auto-generated method
	 * stub System.out.println("���ͬѧ��: "+classmateRelations); }// ��ʾ:����,ͬѧ����
	 * 
	 * // ��ʾ:ͬ�� ,����
	 * 
	 * @Override public void showColleague() { // TODO Auto-generated method
	 * stub System.out.println("���ͬ����: "+colleagueRelations); }
	 * 
	 * @Override public void showPartner() { // TODO Auto-generated method stub
	 * System.out.println("���������: "+partner); }// ��ʾ:ͬ�� ,���˽���
	 */
}
