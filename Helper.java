package Profile;

import java.util.ArrayList;
import People.Person;
import SocailNet.SocialNet;

public class Helper {

	// Part1 :ProfileHelper //对Profile类进行辅助操作
	/*
	 * 添加方法须知: 1.需要在这里设置Scanner变量 2.完善后需要一个方法来对标点符号进行判断 3.完善以后对选项进行判断
	 */

	/*
	 * 添加方法逻辑: 在任意关系列表中增加一个人 参数描述:a.一个人【Person b.随机名字【String c.任意一个选项 方法逻辑:
	 * a.获取单人【Person, 中任意已经存在的关系 b.简单字符串拼接成新关系 c.通过set方法 覆盖旧关系 逻辑:
	 * a.1、输入想更改关系的个人p【Person 类 , 2、要添加的人的人名(被判断过的)... 3、输入参数
	 * b.1、通过p调用其方法getList 2、赋值参数x 3、concat方法连接人名参数... 4、并用newList接收
	 * c.通过p调用setList方法,并加入参数newList以及x选项参数 x参数详情:【同样适用于show() 方法) 1.parentsList
	 * 2.SiblingsList 3.friendList 4.classmateRelations 5.colleagueRelations
	 * 6.partner
	 */
	public void add(Person p, String name, int x) {
		String newList = p.getList(x).concat(" " + name);
		p.setList(x, newList);
	}// 添加任意名字到任意List

	public String show(Person p, int x) {
		return p.getList(x);
	}// 查任意人的任意List方法

	/*
	 * 删除方法逻辑 在任意关系列表中删除一个人 方法逻辑 a.找到要删除的字符在该字符串中的索引位置A【indexOf(str)
	 * b.记录从该索引位置起至下个索引位置前的位置B【name.indexOf(str, fromIndex)
	 * c.拼接索引位置A前以及B后的字符串hoString.substring(beginIndex,
	 * endIndex).concat(hoString.substring(beginIndex)) 逻辑:
	 * a.拿到第一个indexA,通过要想查找的人名 b.拿到第二个indexB,通过列表特征,查找从人名其，下一个特征位置的字符串
	 * c.通过substring方法定义第一个拼接字符串, d.同理定义第二个拼接字符串 e.拼接这两个字符串,获得并设置新List
	 */
	public void delete(Person p, String name, int x) {
		int indexA = p.getList(x).indexOf(name);
		int indexB = p.getList(x).indexOf(" ", indexA);// " "为可设置参数
		String newString = p.getList(x).substring(0, indexA - 1)
				.concat(p.getList(x).substring(indexB));
		p.setList(x, newString);
	}

	// Part1 ProfileHelper 【End

	// Part2 SocialNetHelper
	
	/*
	 *	增加一个人到当前的社交网络中【SocialNet
	 *	方法逻辑:a.输入一个Person类 p 添加到网络中ArrayList
	 * */
	public void add(Person p ,ArrayList<Person> array){//new Person("")...
		array.add(p);
	}
	
	public void show(ArrayList<Person> array){//sn.getArray
		System.out.println("信息如下:");
		for(Person p: array){
			System.out.println(p);
		}
	}
	/*
	 * Helper查询任意两个人的关系:方法逻辑 a.获取两个已有对象的姓名,A B b.用A的姓名在 B对象的全部列表中查找是否存在，存在则输出列表
	 */
	public void checkRela(String name, String name2, SocialNet sn) {
		// ArrayList<Person> a = sn.getArray();
		sn.getArray().get(1).getName();
	}

	/*
	 * 添加姓名方法须知: 1.需要在这里设置Scanner变量 2.完善后需要一个方法来对标点符号进行判断
	 */
	/*
	 * 以下方法分别是：Part1 增加:父母 ,兄弟 ,朋友,同学 ,同事 ,情人
	 */

	// 作为增加功能：选择在用户判定完以后，加入固定字符串

	/*
	 * public void addParents(String parentsList,String name) { // TODO
	 * Auto-generated method stub parentsList = parentsList.concat(" "+name); }
	 * 
	 * 
	 * public void addSiblings(String SiblingsList,String name) { // TODO
	 * Auto-generated method stub SiblingsList = SiblingsList.concat(" "+name);
	 * }// 增加：父母 ,兄弟 结束
	 * 
	 * // 增加：朋友,同学 public void addFriend(String friendList,String name) { //
	 * TODO Auto-generated method stub friendList = friendList.concat(" "+name);
	 * }
	 * 
	 * public void addClassmate(String classmateRelations,String name) { // TODO
	 * Auto-generated method stub classmateRelations =
	 * classmateRelations.concat(" "+name); }// 增加：朋友,同学结束
	 * 
	 * // 增加:同事 ,情人 public void addColleague(String colleagueRelations, String
	 * name) { // TODO Auto-generated method stub colleagueRelations =
	 * colleagueRelations.concat(" "+name); }
	 * 
	 * public void addPartner(String partner, String name) { // TODO
	 * Auto-generated method stub partner = partner.concat(" "+name); }// 增加:同事
	 * ,情人结束
	 */
	/*
	 * 以下方法是:Part2 显示:父母 ,兄弟 ,朋友,同学 ,同事 ,情人 作为显示功能: 只要在判断之后，只要输入字符串即可，
	 * exp:"你的XX有 : "+parentsList
	 */

	/*
	 * public void showParents(String parentsList) { // TODO Auto-generated
	 * method stub System.out.println("你的家人有 : "+parentsList); }
	 * 
	 * 
	 * public void showSiblings(String SiblingsList) { // TODO Auto-generated
	 * method stub System.out.println("兄弟姐妹有 : "+SiblingsList); }// 显示:父母 ,兄弟 结束
	 * 
	 * // 显示:朋友,同学
	 * 
	 * @Override public void showFriend() { // TODO Auto-generated method stub
	 * System.out.println("你的朋友有: "+friendList); }
	 * 
	 * @Override public void showClassmate() { // TODO Auto-generated method
	 * stub System.out.println("你的同学有: "+classmateRelations); }// 显示:朋友,同学结束
	 * 
	 * // 显示:同事 ,情人
	 * 
	 * @Override public void showColleague() { // TODO Auto-generated method
	 * stub System.out.println("你的同事有: "+colleagueRelations); }
	 * 
	 * @Override public void showPartner() { // TODO Auto-generated method stub
	 * System.out.println("你的情侣是: "+partner); }// 显示:同事 ,情人结束
	 */
}
