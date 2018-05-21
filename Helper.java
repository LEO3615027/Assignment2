package Profile;
/**
 * 这是Helper class
 * @author JINDONG ZHANG
 * @version	V1.0
 */
import java.util.ArrayList;

import MyException.*;
import People.Adult;
import People.Person;
//
import SocialNet.SocialNet;

public class Helper {
	
	private int index;//方便获取索引值
	
	public int getIndex(){
		return index;
	}
	/*						Part1 :
	 * ProfileHelper //通过人 【Person 类对Profile类进行直接操作(_A):
	 * 功能总结:
	 * 	Function_A1:	在指定人的任意关系列表中添加一个人
	 * 	Function_A2:	查询指定人的任意关系列表
	 * 	Function_A3: 	在指定人的任意关系列表中删除一个人
	 * 	Function_A4:	设置指定成人的Profile statement
	 * 	Function_A5:	获得指定成人的Profile statement
	 * 	Function_A6:	设置Privacy选项
	 * 	Function_A7:	获得Photo//待完善
	 * 整体逻辑:
	 * 	1、ProfileHelper 的逻辑是在 SocialNetHelper 之后的:
	 * 		当SocialNet 确定人指定的人以后,再调用ProfileHelper 进行操作
	 * 	2、如果要获取profile里面的变量\调用里面的方法,
	 * 		a、必须通过profile 创建方法(获取\设置成员变量)
	 * 		b、通过 人【Person 类里面创建的方法,然后调用profile里面方法
	 * */
	/*
	 * 添加方法须知: 1.需要在这里设置Scanner变量 2.完善后需要一个方法来对标点符号进行判断 3.完善以后对选项进行判断
	 */
	/*						//Function_A1
	 * 
	 * 添加方法: 在任意关系列表中增加一个人
	 * 参数描述:
	 * 	a.一个人【Person b.随机名字【String c.任意一个选项 
	 * 方法逻辑:
	 * 	a.获取单人【Person, 中任意已经存在的关系 
	 * 	b.简单字符串拼接成新关系 
	 * 	c.通过set方法 覆盖旧关系 
	 * 逻辑:
	 *	a.1、输入想更改关系的个人p【Person 类 , 2、要添加的人的人名(被判断过的)... 3、输入参数
	 * 	b.1、通过p调用其方法getList 2、赋值参数x 3、concat方法连接人名参数... 4、并用newList接收
	 * 	c.通过p调用setList方法,并加入参数newList以及x选项参数。
	 * x参数详情:【同样适用于show() 方法) 
	 * 	1.parentsList  2.SiblingsList  3.friendList 
	 * 	4.classmateRelations  5.colleagueRelations  6.partner
	 */
	public void add(Person p, String name, int x) {
		String newList = p.getList(x).concat(" " + name);
		p.setList(x, newList);
	}// 添加任意名字到任意List
	
							//Function_A2
	//注释:可能还需要改进
	public String show(Person p, int x) {
		return p.getList(x);
	}// 查任意人的任意List方法

	/*						//Function_A3_v02
	 * 
	 * 删除方法描述: 在任意人的任意关系列表中删除一个人[profile_list...
	 * 参数描述,及其作用:	
	 * 【Person p】用于调用p内部方法-get/set_List(),帮助查询
	 * 【String name】需要被查询的人的名字		
	 * 【int x】用于指定是哪个关系网	Re: x参数详情
	 * 方法逻辑:v_01	 
	 * 	a.找到要删除的字符【name 在该字符串中的索引位置A【indexOf(str)
	 * 	b.确定从索引 A_ 起至下个索引位置前的位置B【name.indexOf(str, fromIndex)
	 * 	c.拼接索引位置A前以及B后的字符串hoString.substring(beginIndex,
	 * endIndex).concat(hoString.substring(beginIndex)) 
	 * #逻辑:v_02#
	 * 	a.获得【name	的字符长度
	 * 	b.拼接除【name	以外的所有字符
	 * 	c.获得新List
	 * 	
	 * 	步骤详情:
	 * 	a.获得索引:	A , B
	 * 	  1.用方法[indexof()_通过输入的名字【name_
	 * 		查找在指定关系中【p.getList(x)_的第一个索引位置indexA
	 * 	  2.用方法[indexof()_查找从indexA位置到下一个空格【" " 的字符大小,来获得名字【name_的整体长度
	 * 	b.拼接新字符串:	A1, B1
	 * 	  1.通过substring方法定义第一个拼接字符串A1, 
	 * 	  2.同理定义第二个拼接字符串 B1.
	 * 	  3.用方法[concat() 拼接这两个字符串,获得新List
	 * 	c.设置新List:调用p内部方法setList进行设置
	 */
	public void delete(Person p, String name, int x) {
		int indexA = p.getList(x).indexOf(name);
		int indexB = p.getList(x).indexOf(" ", indexA);// " "为可设置的参数
		String newString = p.getList(x).substring(0, indexA - 1)
				.concat(p.getList(x).substring(indexB));
		p.setList(x, newString);
	}
	
	/*						//Function_A4
	 * 
	 * 设置宣言方法描述:在指定的人的文档[profile 中设置它的当前状态[state
	 * 用法说明:在这之前请先做判断
	 * */
	public void setStatement(Person p, String statement) {
		if(p instanceof Adult) {
			Adult a = (Adult)p;
			a.setStatus(statement);
		}
	}
	
	/*						//Function_A5
	 * 
	 * 获得Profile state 宣言
	 * 不完善
	 * */
	public String getStatement(Person p) {
		if(p instanceof Adult) {
			Adult a = (Adult)p;
			String statement = a.getStatus();
			return statement; 
		}
		return "这个人没有任何satus";
	}
	
	/*						//Function_A6
	 * 
	 * 设置Privacy选项
	 * */
	public void setPrivacy(Person p,boolean option) {
		p.setPrivacy(option);
	}
	
	/*						//Function_A7
	 * 
	 * 获得Photo
	 * */
	public void getPhoto(Person p) {
		if(p.getPrivacy()==true) {
			p.getPhoto();
		}
	}
	
	
	
	//----------------------衔接分割线1-----------------------//
	
	
	
	/* 						Part2:
	 *  SocialNetHelper //对SocialNet类进行直接操作(_B):
	 * 功能总结:
	 * 	Function_B1:	添加一个人到社交网络中	[SocialNet_array
	 * 	Function_B2:	从社交网络中删除一个人	[SocialNet_array
	 * 	Function_B3: 	查看指定的人是否存在于社交网络之中	[SocialNet_array
	 * 	Function_B4:	显示整个社会网络
	 * 	Function_B5:	查询指定的任意两人的关系:
	 * 整体逻辑:
	 * 	ProfileHelper 的逻辑是在 SocialNetHelper 之后的:
	 * 		当SocialNet 确定人指定的人以后,再调用ProfileHelper 进行操作
	 * 	
	 * */
		
	/*						//Function_B1
	 * 
	 * 添加方法描述:添加一个人到当前的社交网络中[SocialNet_array
	 *	方法逻辑:a.输入一个Person类 p 添加到网络中ArrayList
	 * */
	public boolean add(Person p ,ArrayList<Person> array){//new Person("")...
		return array.add(p);
	}
	
	/*						//Function_B2
	 * 
	 * 删除方法描述:从社交网络中删除一个人[SocialNet_array
	 * 	删除一个人的方法逻辑:(组合类型:需要由多个方法参加组合完成)
	 * 		a.选人方法(checkPeople
	 * 		b.删除方法 (delete
	 * 		c.在删除前进行一次查询并加入确认判断,如果确认则获得选人方法的index值
	 * 		d.当用户确认以后调用该方法并进行删除
	 * */
	public void delete(ArrayList<Person> array , int index){
		array.remove(index);
		System.out.println("已经成功删除");
	}
	
	/*						//Function_B3
	 * 
	 * 查看选择一个人是否存在于社交网络之中[SocialNet_array
	 * */
	public int checkPeople(ArrayList<Person> array , String name){
		for (int x = 0; x < array.size(); x++) {
			if (name.equals(array.get(x).getName())) {
				//System.out.println("你选择的人是:铛铛dang....." + name);
				return index = x;
				//break;// 如果没有break 即使正确也会往最后一个索引查找
			} else if( x >=array.size() ){//如果这里只有else的话判断完第一个就不判断了
				//这句话是在这个条件下【x >=array.size() 是不可能执行的
				//因为for 语句 ..所以x永远不可能大于等于size()
				//System.out.println("selectPer print:查无此人");
				//return index = -1;
				// break;//这里如果加break意味着当查询第一个人为错误时候，
				// 立即使得Count = -1 并跳出for循环，无法核对下一个人是否正确
			}
		}// for 循环结束
		return index = -1;
	}
	
	/*						//Function_B4
	 * 
	 * 查看整个社会网络
	 * */
	public void show(ArrayList<Person> array){//sn.getArray
		System.out.println("当前社交网络信息如下:");
		for(Person p: array){
			System.out.println(p);
		}
	}
	
	/*						//Function_B5
	 * 
	 * Helper查询任意两个人的关系:
	 * 方法逻辑v_01:
	 * 	a.获取两个已有对象的姓名,A B b.用A的姓名在 B对象的全部列表中查找是否存在，存在则输出列表
	 * 方法逻辑v_02:
	 * 	a.通过查询一个人的【Function_B4 方法获得一个人的index值 :	"A"
	 * 	b.通过查询一个人的【Function_B4 方法获得另一个人的index值:	"B"
	 * 	c.通过A的查看任意人的任意List方法【Function_A2 ，查看B是否在A的List里面[indexOf
	 * 	d.已此法重复,知道查看完所有的List为止
	 * 方法逻辑v_02.1:
	 * 	a.通过查询一个人的【Function_B4 方法获得一个人的index值 :	"A"
	 * 	b.通过查询一个人的【Function_B4 方法获得另一个人的index值:	"B"
	 * 	c.通过查看他们的年龄，以及类的类型关系来排除不用的list
	 * 	d.通过A的查看任意人的任意List方法【Function_A2 ，查看B是否在A的List里面[indexOf
	 * 
	 * 使用说明:调用该方法后,用一个 新的String listType接收,
	 * 	然后打印出:" 这两个人的关系是:"+ listType 如下效果
	 */
	public String checkRela(int indexA, int indexB, SocialNet sn, String listType) {
		// ArrayList<Person> a = sn.getArray();
		
		/*sn.getArray().get(indexA).getList(1).indexOf(sn.getArray().get(indexB).getName());
		sn.getArray().get(indexA).getList(2).indexOf(sn.getArray().get(indexB).getName());
		sn.getArray().get(indexA).getList(3).indexOf(sn.getArray().get(indexB).getName());
		sn.getArray().get(indexA).getList(4).indexOf(sn.getArray().get(indexB).getName());
		sn.getArray().get(indexA).getList(5).indexOf(sn.getArray().get(indexB).getName());
		sn.getArray().get(indexA).getList(6).indexOf(sn.getArray().get(indexB).getName());*/
		for(int x=1 ; x<=6 ; x++) {
			//获得SocialNet.获得人【Person.获得关系网[x.确定是否存在(获得SocialNet.获得人【Person.获得人名)
			if(sn.getArray().get(indexA).getList(x).indexOf(sn.getArray().get(indexB).getName()) != -1) {
				listType += sn.getRelationshipType(x)+" ";
			}
		}
		return listType;
	}

	
	
	//--------------------衔接分割线2----------------------//
	
	
	
	/*						Part3:
	 * 在设置所以关系之前自动打印出所有人的表格:		
	 * exp:		Adult 		: 	Lee Min Tear
	 * 			Child 		:	Anmy Emma
	 * 			YougChild	:	Bob Cathy
	 * 
	 * 通过SocialNet 进行对Profile 的操作:	[前置方法 部分——Function_C
	 * 说明书:Function_C2...开始为设置关系前置条件判断方法
	 * 待完善:
	 * 	Other_types_exception_database
	 * 	NoParentException				
	 * */
	
	/*						//Function_C1
	 * 
	 * 前置条件方法之设置年龄 	方法【beforeSetAge
	 * 启用条件:当准备设置年龄时
	 * 逻辑判断顺序:
	 * 	a.在输入年龄时 调用该方法
	 * 	c.当满足a,条件的时候,衔接下一个方法进行设置
	 * */
	public void beforeSetAge(int age) throws NoSuchAgeException {
		if(age < 0 || age > 150) {
			throw new NoSuchAgeException("年龄不合实际");
		}
	}
	/*						//Function_C1_2
	 * 
	 * 前置条件方法之创建小孩	方法【beforeSetChilds
	 * 启用条件:当准备创建小孩时
	 * 逻辑:
	 * 	a.当创建一个小孩后请求添加父母
	 * 		A.显示一个单身成年人列表和一个非单身成年人列表
	 * 		B.显示所有成年人姓名
	 * 	b.判断2个人是否是成年人
	 * 		A.满足:
	 * 			c.判断两个人是否是夫妻
	 * 				A:满足:输出并衔接之后的方法
	 * 				B:没有:B2_没有:甩异常[NoParentException
	 * 		B.没有:NotToBeCoupledException
	 * */
	public void beforeSetChilds(int a, int b, ArrayList<Person> array ) throws NotToBeCoupledException, NoParentException {
		if(array.get(a).getAge() < 17  || array.get(b).getAge() < 17) {
			throw new NotToBeCoupledException("未成年欸");
		}else {
			if(array.get(a).getList(6).indexOf(array.get(b).getName()) != -1 ) {
				System.out.println("你是否确定将他们设置为这个小孩的父母？");
			}else {
				throw new NoParentException("不是夫妻欸");
			}
		}
	}
	/*						//Function_C1_3
	 * 
	 * 前置条件方法之删除大人	方法【beforeDeltetAdults
	 * 启用条件:当准备删除大人时
	 * 逻辑:
	 * 	a.输入一个大人
	 * 	b.判断这个大人是否有小孩
	 * 		A_满足:甩异常NoParentException
	 * 		B_没有:输出语句,衔接操作
	 * */
	public void beforeDeltetAdults(int a, ArrayList<Person> array ) throws NoParentException {
		if(array.get(a).getList(7) != null) {
			throw new NoParentException("孩子不能没有爹妈");
		}else {
			System.out.println("你确定删除这个人么？");
		}
	}
	
	/*
	 * 这是一个设置两个人关系的方法
	 * 逻辑:
	 * 	a.获得他们的index值 A & B//任意的人【Person 类都能进入这个方法
	 * 	b.输入想让他们变成什么样的关系 	Re: x参数详情
	 * 	c.根据类型判断进行判断	[exception
	 * 		1.当无法成功时候 报错[exception
	 * 		2.当成功的时候 设置
	 * 	e.
	 * 逻辑v2:
	 * 	a.通过使用 "查看"方法【Function_B3,分别获得index值  A B
	 * 	b.用户输入他们所需要的关系类型
	 *	c.通过不同的关系类型来甩错误
	 *	d.关系的选择判断,得放在上层判断
	 * */

	/*
	 * 				--------x参数详情:--------
	 * 	1.parentsList	2.SiblingsList	3.friendList
	 * 	4.classmateRelations	5.colleagueRelations
	 * 	6.partner	7.childrenList
	 * */
	
	/*						//Function_C2
	 * 关于夫妻:
	 * 前置条件方法之夫妻关系 	【beforeSetPartner x参数=6
	 * 启用条件:当准备设置夫妻关系时
	 * 先决条件:在确定需要设置夫妻关系后[x参数已知,进行以下逻辑顺序
	 * 逻辑判断顺序:
	 * 	a.判断是否都大于18;
	 * A_满足:	
	 * 	b.判断此二人的partner是否都为空
	 * 		A2_满足:输出一个语句,衔接下一个方法进行设置
	 * 		B2_没有:甩异常[NoAvailableException
	 * B_没有:可能直接异常//[NotToBeCoupledException
	 * 	
	 * */
	public void beforeSetPartner(int a, int b, ArrayList<Person> array) throws NoAvailableException, NotToBeCoupledException {
		if(array.get(a).getAge()>=17 && array.get(b).getAge()>=17 ) {
			if(array.get(a).getList(6) == null &&  array.get(b).getList(6) == null) {
				System.out.println("你是否要将他们设置为:partner ?");
			}else {
				throw new NoAvailableException("Someone is already connected with another adult as a couple");
			}
		}else {
			throw new NotToBeCoupledException("其中有一个人不满足条件");
		}
	}
	
	/*						//Function_C3
	 * 关于同学:
	 * 前置条件方法之设置同学 	方法【beforeSetClassmates x参数=4
	 * 启用条件:当准备设置同学时
	 * 先决条件:在确定需要设置同学后[x参数已知,进行以下逻辑顺序
	 * 逻辑判断顺序:
	 * a.判断是否有一个人小于3;
	 * 	A_满足:	甩异常
	 * 	B_没有:	输出一个语句,衔接下一个方法进行设置
	 * */
	public void beforeSetClassmates(int a, int b, ArrayList<Person> array)throws NotToBeClassmatesException {
		if (array.get(a).getAge() < 3 || array.get(b).getAge() < 3) {
			throw new NotToBeClassmatesException("必须大于三岁才能有同学");
		}
	}
	
	/*						//Function_C4
	 * 关于同事:
	 * 前置条件方法之设置同事 	方法【NotToBeColleaguesException x参数=5
	 * 启用条件:当准备设置同事时
	 * 先决条件:在确定需要设置同学后[x参数已知,进行以下逻辑顺序
	 * 逻辑判断顺序:
	 * a.判断是否有一个人小于17;
	 * 	A_满足:	甩异常
	 * 	B_没有:	输出一个语句,衔接下一个方法进行设置
	 * */
	public void beforeSetColleagues(int a, int b, ArrayList<Person> array) throws NotToBeColleaguesException{
		if (array.get(a).getAge() < 17 || array.get(b).getAge() < 17) {
			throw new NotToBeColleaguesException("必须成年才能有工作");
		}else {
			System.out.println("你确定要设置同事关系么？");
		}
	}
	
	/*						//Function_C5
	 * 关于朋友:
	 * 前置条件方法之设置朋友 	方法【NotToBeFriendsException x参数=3
	 * 启用条件:当准备设置朋友时
	 * 先决条件:在确定需要设置朋友后[x参数已知,进行以下逻辑顺序
	 * 逻辑判断顺序:
	 * 	a.判断他们中是否有人小于3岁			(步骤1)
	 * A_满足:	甩异常[TooYoungException
	 * B_没有:	衔接下一个方法进行设置
	 * 
	 * 	a1.	判断是A ,B的class 是否相同	(步骤2)
	 * A_满足:	
	 * 	b.判断是否年龄差距大于3岁(相减绝对值)
	 * 		A_满足:甩异常[NotToBeFriendsException 超过3岁不能交朋友
	 * 		B_没有:输出一个语句,
	 * B_没有:	甩异常[NotToBeFriendsException 类型不相同不能叫朋友
	 * 	
	 * 错误逻辑案例:判断是否有一个人小于17(未成年)，另一个人>=17(成年)//错误
	 * */
	public void beSetFriend(int a, int b, ArrayList<Person> array) throws NotToBeFriendsException, TooYoungException {
		if(array.get(a).getAge()<3 || array.get(b).getAge()<3) {
			throw new TooYoungException("年龄太小无法交朋友");
		}
		if (array.get(a).getClass() == array.get(b).getClass()) {
			if(Math.abs(array.get(a).getAge()-array.get(b).getAge()) >3) {
				throw new NotToBeFriendsException("年龄太大不能交朋友");
			}else {
				System.out.println("你确定要设置朋友关系么？");
			}
		}else {
			throw new NotToBeFriendsException("这两个人不能交朋友呢");
		}
	}
}// end of Helper到底啦 >_< !!  back

	
	
	
