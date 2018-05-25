package socialNet;
/**
 * 这是SocialNet class
 * @author JINDONG ZHANG
 * @version	V1.0
 */
import java.util.ArrayList;

import peopleManager.Person;

public class SocialNet {
	/*
	 * SocialNet系统和Profile系统是分开独立的 ScocialNet 主要处理所有人物的社交大关系网 Profile
	 * 则注重处理个人的具体关系,当这个人在profile消失后个体Profile"消失"
	 */
	/*
	 * 				----SoocialNet 更新:V0.2-----
	 * 移除ArrayList 原因:冗余 	
	 * 具体描述:ArrayList 只要放在Driver Class里面就可以了
	 * 移除以后描述:现在的SoocialNet 仅仅只作为一个用来List 查询存在
	 * */
	public SocialNet() {};

	// private int Index;//用于方便查找索引

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
			ListType = "父母";
		}else if(keyEnter ==2){
			ListType = "兄弟";
		}else if(keyEnter ==3) {
			ListType = "朋友";
		}else if(keyEnter ==4) {
			ListType = "同学";
		}else if(keyEnter ==5) {
			ListType = "工友";
		}else if(keyEnter ==6) {
			ListType = "情侣";
		}else{
			ListType = "";
		}
		return ListType;
	}

	/*
	 * ArrayList 不需要set方法, 原因:不明 public void setArray(ArrayList<Person> array) {
	 * this.array = array; }
	 */

	/*
	 * 如下两个a & b 方法移交给Helper 处理 //a.将一个人加入社交网络 public boolean setPerson(Person
	 * p){ return array.add(p); } //b.查看社交网络 public void showAll(){ if(array !=
	 * null){ for(Person p: array){ System.out.println(p); } } }
	 */

	/*
	 * 以下代码【selectPerson 是:选人操作 方法逻辑:当得到一个人名后，对该人名进行判断.有:返回该人名对应索引值。无:返回-1 逻辑
	 * a.输入姓名【String b.for循环array.size() c.通过array.get(index)获取单个Person对象
	 * d.通过Person对象 调用Person方法【getName() e.equals方法判断姓名与index中名字是否相同
	 * f.并获得其Index值 选人操作须知：String s 将改进Scanner类型
	 */
	/*
	 * public void selectPerson(String s) { for (int x = 0; x < array.size();
	 * x++) { if (s.equals(array.get(x).getName())) {
	 * System.out.println("你选择的人是:铛铛dang....." + s); Index = x; break;//
	 * 如果没有break 即使正确也会往最后一个索引查找 } else if (x > array.size()) {
	 * System.out.println("selectPer print:查无此人"); Index = -1; //
	 * break;//这里如果加break意味着当查询第一个人为错误时候， // 立即使得Index = -1
	 * 并跳出for循环，无法核对下一个人是否正确 } }// for 循环结束 }//selectPerson 方法结束
	 */
	/*
	 * 以下方法【opAddPerson 是:在社会网络中添加一个人 Ver_0.1
	 * 逻辑:当得到索引和要添加的好友名字后，对该索引指定的人进行添加好友操作
	 */
	/*
	 * public void opAddPerson(int Index,String name) {//当拿到索引以后进行操作
	 * //System.out.println("opPer print:"+array.get(Index).getName());
	 * //array.get(Index).setName("Lee");//这里是固定值直接操作
	 * //array.get(Index).addFriend(name); }//opPerson 方法结束
	 */
	/*
	 * 以下方法【opAddPerson 是:在社会网络中添加一个人 Ver_0.2 区别:方法返回类型为boolean public boolean
	 * opAddPerson(int Index,String name) { return
	 * array.get(Index).addFriend(name); }
	 */

	/*
	 * 以下方法【opCheckPerson 是:显示朋友 逻辑:拿到索引以后对索引指定的人物进行显示其所有好友朋友
	 */
	/*
	 * public void opCheckPerson(int Index) {//当拿到索引以后进行操作
	 * //System.out.println("opPer print:"+array.get(Index).getName());
	 * //array.get(Index).setName("Lee");//这里是固定值直接操作
	 * //array.get(Index).showFriend(); }//opPerson 方法结束
	 */
	/*
	 * 以下方法【getPerson 是:得到名字 逻辑:得到索引后，对该索引值指的人获取名字
	 */
	/*
	 * public String getPerson(int Index) {
	 * //System.out.println("opPer print:"+array.get(Index).getName()); return
	 * array.get(Index).getName(); }//getPerson 方法结束
	 */
	/*
	 * 以下方法【deletePerson 是: 从社交网络中删除一个人 Ver_0.1 逻辑:通过得到
	 */
	/*
	 * public void deletePerson(int Index){ array.remove(Index); }
	 */
}
