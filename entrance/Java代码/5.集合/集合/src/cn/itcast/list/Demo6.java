package cn.itcast.list;
/*
 * List 类的特有方法和LisIterator迭代器
 * */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("周杰伦");
		list.add("胡歌");
		list.add("周杰伦");
		list.add("陆毅");
		list.add("丁俊晖");
	
		/*
		 * 添加
		list.add(0,"刘清");
		
		List list2 = new ArrayList();
		list2.add("周星驰");
		list2.add("李连杰");
		
		list.addAll(1,list2);
		*/
		
		/*获取
		 * System.out.println(list.get(3));
		System.out.println(list.indexOf("丁俊晖"));
		System.out.println(list.lastIndexOf("周杰伦"));
		System.out.println(list.subList(2, 4));
*/
	/*修改
	 * 	list.set(2, "刘清");
		System.out.println(list);
	*/
		
		
		//迭代器的方法
		ListIterator it = list.listIterator();
		/*
		 * 倒序输出
		 * while(it.hasNext()){
		   it.next();//输出的是指针那条线下面的一个元素
		   }
	   while(it.hasPrevious()){
		   System.out.println("元素："+it.previous());
	   }*/
		
		/*
		 * 在指针所处位置添加元素
	   it.add("刘清");
	   System.out.println(list);
	   */
		
		/*
		 * list.size() 获取长度
		 * */
		
		
		
		
		/*替代迭代器最后一个返回的元素
		it.next();
		it.set("昆凌");
		System.out.println(list);
		*/
		
		while(it.hasNext()){
			System.out.println(it.next());//获取的始终是指针线下面的一个元素
			it.add("666");//自动添加之后跳过添加的元素向下移动一个元素
		}
		//注意：list.add()方法是在集合末尾添加元素
		//在迭代器迭代过程中，不允许使用集合方法改变集合长度，但是可以使用迭代器方法改变集合长度
		//迭代器迭代过程：从创建开始到最后一次使用迭代方法为止
		System.out.println(list);
	}

}
