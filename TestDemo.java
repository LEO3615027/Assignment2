package MiniNet;
/**
 * 这是TestDemo class
 * @author JINDONG ZHANG
 * @version	V1.0
 */
import java.util.ArrayList;

import People.Adult;
import People.Child;
import People.Person;
import People.YoungChild;
import Profile.Helper;
import SocialNet.SocialNet;


public class TestDemo {

	public static void main(String[] args) {
		/*
		 *用法须知:
		 * 通过调用ProfileHelper ph方法来对Person中的profile进行操作
		 * 通过SocialNet sn
		 * */
		/*
		 * 用法须知p2:
		 * 	ph.show(array);//展示所以人
		 * 	ph.checkPeople(array, "Min");//Scanner改进输入
		 * 		作用:获得index值
		 * 		逻辑:之后通过array.get(index)方法  ,进行后续操作
		 * 			1、profile 关联操作
		 * 			2、但凡是需要输入人 【Person类	 的方法的关联操作
		 * 		
		 * */
		Helper ph = new Helper();
		SocialNet sn = new SocialNet();//地址值指向地址值
		ArrayList<Person> array = sn.getArray();//嫌麻烦就用array
		/*sn.getArray().add(new Adult(13, "Lee", "Fe"));
		sn.getArray().add(new Adult(13, "Min", "Fe"));
		sn.getArray().add(new Adult(13, "Lee", "Fe"));
		sn.getArray().add(new Adult(13, "TEA", "Fe"));
		for(Person p:array) {
			System.out.println(p);
		}
		System.out.println("-----------------");
		array.remove(2);
		for(Person p:sn.getArray()) {
			System.out.println(p);
		}*/
		//不嫌麻烦就直接用 sn.getArray()
		// Person p = new Adult(13, "Lee", "Fe");
		/*ph.add(new Adult(13, "Lee", "Fe"), sn.getArray());
		ph.add(new Adult(13, "Min", "Fe"), sn.getArray());
		ph.add(new Adult(14, "Awe", "Me"), sn.getArray());
		ph.show(array);
		ph.checkPeople(array, "Min");
		//array.get(2);
		ph.setStatement(array.get(2), "NI hao me?");
		System.out.println(ph.getStatement(array.get(2)));*/
		//ph.delete(sn.getArray(), 2);
		//ph.show(array);
		/*int a = ph.getIndex();
		int a1 = ph.checkPeople(array, "Awe");
		int a2 = ph.getIndex();
		System.out.println("a :"+a);
		System.out.println("a1 :"+a1);
		System.out.println("a2 :"+a2);*/
		/*if(a == -1){
			System.out.println("a :"+a);
			//System.out.println("查无此人");//这里有个新变量来自于用户输入
		}else{
			System.out.println("a :"+a);
			//System.out.println("Lee");//这里有个新变量来自于用户输入
		}*/
		//Person p = new Adult(23, "Min", "Fe");
		/*String ListType = "";
		for (int x = 1; x <= 6; x++) {
			if(x == 3) {
				String a;
				a = "dada";
				ListType += a;
			}
		}*/
		/*ph.setStatement(p, "I love U");
		System.out.println(p);*/
		
		
		
		int a= 0;
		a = Math.abs(3-11);
		System.out.println(a);
		
		
		
		
		
		/*
		 * 这是一个删除字符串中 指定字符的测试
		 * 实现逻辑:
		 * 	a.找到要删除的字符在该字符串中的索引位置A【indexOf()
		 * 	b.记录从该索引位置起至下个索引位置前的位置B【indexOf()
		 * 	c.拼接索引位置A前以及B后的字符串
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
		//int indexA = s.indexOf("App");//拿到第一个index的值A,通过输入一个参数【String
		//int indexB = s.indexOf(" ", startIndex);//拿到第二个index值B:A起往后找xx参数在总字符串中的位置
		//String startString = s.substring(0, 4);确定字符串A1,获取从0到4的字符串
		// String endString = s.substring(8);确定第字符串B1,获取从8到末尾的字符串
		// String newString = startString.concat(endString);字符串拼接
		//String newString = s.substring(0, indexA-1).concat(s.substring(indexB));
		/*int indexA = s.indexOf("App");
		int indexB = s.indexOf(" ", indexA);
		String newString = s.substring(0, indexA-1).concat(s.substring(indexB));
		System.out.println(newString);*/
		/*
		 * 添加人物到关系网操作须知:
		 * 		添加人物之前进行一个判断语句，如果该人物没有在当前社会网络中则增加，
		 * 		添加朋友一样，先判断是否该朋友是存在在社会关系网络中的，如果存在则添加否则不添加*/
		/*SocialNet sn = new SocialNet();
		Person p = new Adult(23, "Lee", "Male");
		Person p2 = new Adult(12, "Tea", "Female");
		Person p3 = new Adult(33, "Min", "Male");
		sn.setPerson(p);
		sn.setPerson(p2);
		sn.setPerson(p3);*/
		
		// String a = p.getPro();
		/*
		 * 为了做到Profile的消失  ：
		 * 	逻辑:上层包下层(SocialNet作为最上层,Profile作为下层,
		 * 当要新建时候直接在社交网络圈里面新建,获取操作通过社交网络进行,
		 * 这样在以后删除的时候对象直接被删除,不存在残留现象
		 * sn.setPerson(new Adult(22,"Tsa","Male"));
		 * */
		/*ph.add(p, "Yougou", 2);
		ph.add(p, "Lee", 1);
		System.out.println(ph.show(p,2));
		System.out.println(ph.show(p,1));*/
		
		/*以下代码Project1是测试添加朋友，展示好友,以及创建已知条件的个人
		 * 主要包括方法:1、addFriend  2、showFriend
		 * Person p1 = new Adult(3, "Lee","Male");
		//System.out.println(p1.toString());
		p1.addFriend("Min");
		p1.addFriend("Tom");
		p1.showFriend();
		String a = "";
		System.out.println(a.concat("aaa"));
		//Project1测试结束*/
		
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
	
		/*以下测试的目的是为了设置向下转型方法，
		 * 测试逻辑为:
		 * 获取一个对象，查看该对象是否属于小孩类的对象,//是
		 * 获取一个对象，查看该对象是否属于人类的对象,//否
		 * 获取一个对象，查看该对象是否属于小小孩类的对象,//否
		 * 获取一个对象，查看该对象是否属于大人类的对象,//否
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
