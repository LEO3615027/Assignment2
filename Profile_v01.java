package profileManager;

import optional_Interface.Adult_Inter;

public class Profile_v01 implements Adult_Inter{
//last_update2018/5/11 
	/*
	 * 以下是 profile中的各类列表：
	 * 	其中包括:	朋友，同事，同学，情侣，家长
	 * 
	 * 操作须知:根据年龄的不同能够操作的列表也不同
	 * 	比如:在成年人级别有:增加朋友的方法而在小小孩级别没有该方法
	 */	
	String parentsList = "";//设置储存家长 2个
	String SiblingsList = "";//设置储存兄弟姐妹
	String friendList = "";// 中的朋友列表
	String classmateRelations = "";//设置储存同学
	String colleagueRelations = "";//设置储存同事
	String partner = "";//设置储存情侣 1个
	
	/*
	 * 以下功能是设置声明状态
	 * */
	String status = "";//这是一句话，声明现在的状态
	public void setStatus(String status){
		this.status = status;
	}
	/*
	 * 显示和隐藏status的选项功能
	 * */
	int SH = 1;//显示
	public void setSH(int SH){
		this.SH = SH;
	}
	/*以下功能用于展示之后的调用展示status的声明
	 * */
	public void showSH(){
		if(SH == 1){
			System.out.println(status);
		}else{
			System.out.println("I do not want to show my status");
		}
	}
	
	
	
	/*添加姓名方法须知:
	 *  1.需要在这里设置Scanner变量
	 *  2.完善后需要一个方法来对标点符号进行判断
	*/
	
	/*
	 * 以下方法分别是：Part1
	 * 	增加:父母 ,兄弟 ,朋友,同学 ,同事 ,情人
	 * */

	public void addParents(String name) {
		// TODO Auto-generated method stub
		parentsList = parentsList.concat(" "+name);
	}


	public void addSiblings(String name) {
		// TODO Auto-generated method stub
		SiblingsList = SiblingsList.concat(" "+name);
	}// 增加：父母 ,兄弟 结束

	// 增加：朋友,同学
	@Override
	public void addFriend(String name) {
		// TODO Auto-generated method stub
		friendList = friendList.concat(" "+name);
	}

	@Override
	public void addClassmate(String name) {
		// TODO Auto-generated method stub
		classmateRelations = classmateRelations.concat(" "+name);
	}// 增加：朋友,同学结束

	// 增加:同事 ,情人
	@Override
	public void addColleague(String name) {
		// TODO Auto-generated method stub
		colleagueRelations = colleagueRelations.concat(" "+name);
	}

	@Override
	public void addPartner(String name) {
		// TODO Auto-generated method stub
		partner = partner.concat(" "+name);
	}// 增加:同事 ,情人结束

	/*
	 * 以下方法是:Part2 显示:父母 ,兄弟 ,朋友,同学 ,同事 ,情人
	 */

	public void showParents() {
		// TODO Auto-generated method stub
		System.out.println("你的家人有 : "+parentsList);
	}


	public void showSiblings() {
		// TODO Auto-generated method stub
		System.out.println("兄弟姐妹有 : "+SiblingsList);
	}// 显示:父母 ,兄弟 结束

	// 显示:朋友,同学
	@Override
	public void showFriend() {
		// TODO Auto-generated method stub
		System.out.println("你的朋友有: "+friendList);
	}

	@Override
	public void showClassmate() {
		// TODO Auto-generated method stub
		System.out.println("你的同学有: "+classmateRelations);
	}// 显示:朋友,同学结束

	// 显示:同事 ,情人
	@Override
	public void showColleague() {
		// TODO Auto-generated method stub
		System.out.println("你的同事有: "+colleagueRelations);
	}

	@Override
	public void showPartner() {
		// TODO Auto-generated method stub
		System.out.println("你的情侣是: "+partner);
	}// 显示:同事 ,情人结束

	
	
	
	
	
	
	
	
	
	/*实现interface
	 * public void addFriend(String name){
		friendList = friendList.concat(" "+name);
		//friend += name;
		//return friend;
	}
	
	public void showFriend(){
		System.out.println("你的朋友有: "+ friendList);
	}*/
	//待完善.....以下两个get/set Rela方法应该设置为interface
	
	/*public boolean addFriend(String name){//这里传入变量Person违背逻辑
		return arrInPerson.add(name);//add方法内变量只能是arr 泛型描述的类型
	}
	
	public void showFriend(){
		
		 * 在ArrayList 泛型类型为Object时候
		 * 如果用迭代器和增强for则出toString效果
		 * 普通for可以:   变量名.方法
		 * 
		 * 这里ArrayList arrInPerson泛型类型为String 所以可以直接迭代器和增强for
		 * 
		想打出 "Hi "+name+" 你的朋友有:" s & s的效果 
		 * 逻辑要求:确定这是否是最后一个打出的索引
		 * System.out.println("Hi "+name+" 你的朋友有:");
		for(String s: arrInPerson){
			System.out.print(s+" ");
		}
		思辨:if ,以it.hasNext() 做判断所以打出单个可以理解
		 * 但为什么这里while 可以打出全部，它的内部逻辑是什么样的
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
		
		以用迭代器完成判定逻辑
		 * 逻辑分析:
		 * while + it.hasNext()作为外部循环打出全部。
		 * if + it.hasNext()作为内部判断。
		
		 Iterator<String > it = arrInPerson.iterator();
		 System.out.print("Hi "+name+" 你的朋友有:");
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