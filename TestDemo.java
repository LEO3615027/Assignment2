package MiniNet;

import java.util.ArrayList;

import People.Adult;
import People.Child;
import People.Person;
import People.YoungChild;
import Profile.Helper;
import SocailNet.SocialNet;

public class TestDemo {

	public static void main(String[] args) {
		/*
		 *�÷���֪:
		 * ͨ������ProfileHelper ph��������Person�е�profile���в���
		 * ͨ��SocialNet sn
		 * */
		Helper ph = new Helper();
		SocialNet sn = new SocialNet();
		Person p = new Adult(13, "Lee", "Fe");
		sn.getArray();
		ph.add(new Adult(13, "Lee", "Fe"), sn.getArray());
		ph.show(sn.getArray());
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * ����һ��ɾ���ַ����� ָ���ַ��Ĳ���
		 * ʵ���߼�:
		 * 	a.�ҵ�Ҫɾ�����ַ��ڸ��ַ����е�����λ��A��indexOf()
		 * 	b.��¼�Ӹ�����λ�������¸�����λ��ǰ��λ��B��indexOf()
		 * 	c.ƴ������λ��Aǰ�Լ�B����ַ���
		 * */
		//String s = "Head App Lee Tae";
		//s.indexOf("ea");
		//System.out.println(s.indexOf("ad"));
		//String startString = s.substring(0, 2);
		//System.out.println(startString);
		//s.indexOf("App");
		//System.out.println(s.indexOf("App"));//5
		//s.indexOf(" ", 5);
		//System.out.println(s.indexOf(" ", 5));//8
		// String startString = s.substring(0, 4);//5-1
		// String endString = s.substring(8);
		// String newString = startString.concat(endString);
		// System.out.println(newString);
		
		//s.indexOf("App");
		//int indexA = s.indexOf("App");//�õ���һ��index��ֵA,ͨ������һ��������String
		//int indexB = s.indexOf(" ", startIndex);//�õ��ڶ���indexֵB:A��������xx���������ַ����е�λ��
		//String startString = s.substring(0, 4);ȷ���ַ���A1,��ȡ��0��4���ַ���
		// String endString = s.substring(8);ȷ�����ַ���B1,��ȡ��8��ĩβ���ַ���
		// String newString = startString.concat(endString);�ַ���ƴ��
		//String newString = s.substring(0, indexA-1).concat(s.substring(indexB));
		/*int indexA = s.indexOf("App");
		int indexB = s.indexOf(" ", indexA);
		String newString = s.substring(0, indexA-1).concat(s.substring(indexB));
		System.out.println(newString);*/
		/*
		 * ������ﵽ��ϵ��������֪:
		 * 		�������֮ǰ����һ���ж���䣬���������û���ڵ�ǰ��������������ӣ�
		 * 		�������һ�������ж��Ƿ�������Ǵ���������ϵ�����еģ������������ӷ������*/
		/*SocialNet sn = new SocialNet();
		Person p = new Adult(23, "Lee", "Male");
		Person p2 = new Adult(12, "Tea", "Female");
		Person p3 = new Adult(33, "Min", "Male");
		sn.setPerson(p);
		sn.setPerson(p2);
		sn.setPerson(p3);*/
		
		// String a = p.getPro();
		/*
		 * Ϊ������Profile����ʧ  ��
		 * 	�߼�:�ϲ���²�(SocialNet��Ϊ���ϲ�,Profile��Ϊ�²�,
		 * ��Ҫ�½�ʱ��ֱ�����罻����Ȧ�����½�,��ȡ����ͨ���罻�������,
		 * �������Ժ�ɾ����ʱ�����ֱ�ӱ�ɾ��,�����ڲ�������
		 * sn.setPerson(new Adult(22,"Tsa","Male"));
		 * */
		/*ph.add(p, "Yougou", 2);
		ph.add(p, "Lee", 1);
		System.out.println(ph.show(p,2));
		System.out.println(ph.show(p,1));*/
		
		/*���´���Project1�ǲ���������ѣ�չʾ����,�Լ�������֪�����ĸ���
		 * ��Ҫ��������:1��addFriend  2��showFriend
		 * Person p1 = new Adult(3, "Lee","Male");
		//System.out.println(p1.toString());
		p1.addFriend("Min");
		p1.addFriend("Tom");
		p1.showFriend();
		String a = "";
		System.out.println(a.concat("aaa"));
		//Project1���Խ���*/
		
		/*Person p1 = new Adult(3, "Lee","Male");
		Adult a = (Adult)p1;
		a.addFriend("Min");
		a.addFriend("Lee");
		a.addFriend("Xin");
		a.showFriend();*/
		
		/*Adult a = new Adult(3, "Lee","Male");
		a.addParents("Min");
		a.addFriend("Lee");
		a.addFriend("Xin");
		a.showFriend();
		a.showParents();*/
		
		
//		ph.add(p.getPro(), "Head");
//		System.out.println(ph.show(p.getPro()));
	
		/*���²��Ե�Ŀ����Ϊ����������ת�ͷ�����
		 * �����߼�Ϊ:
		 * ��ȡһ�����󣬲鿴�ö����Ƿ�����С����Ķ���,//��
		 * ��ȡһ�����󣬲鿴�ö����Ƿ���������Ķ���,//��
		 * ��ȡһ�����󣬲鿴�ö����Ƿ�����СС����Ķ���,//��
		 * ��ȡһ�����󣬲鿴�ö����Ƿ����ڴ�����Ķ���,//��
		Object ob = p2.getClass();
		if(ob == Child.class){
			System.out.println("Hi kids");
		}else{
			System.out.println("WTF");
		}
		System.out.println(ob);
		Object ob2 = a.getClass();
		System.out.println(ob2);
		 */
		
		/*ArrayList<Person> arraylist = new ArrayList<Person>();
		arraylist.add(p);
		arraylist.add(new Adult(19, "Lee","Male"));
		arraylist.add(new Child(12, "Tea","Male"));
		arraylist.add(new YoungChild(3, "Min","Male"));
		
		
		
			if(arraylist != null){
				for(Person p1: arraylist){
					System.out.println(p1);
				}
			}*/

		
		
		
	}
	
}
