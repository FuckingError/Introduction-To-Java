package cn.itcast.genrictiry;

import java.util.ArrayList;

/*自定义泛型
 * 不存在多态的概念
 * */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		//大写换成小写
		for(int i = 0;i<list.size();i++){
			String str = (String)list.get(i);
			System.out.println(str.toLowerCase());		
		}
		
	/*	Integer i = print(1);
		Double d = print(1.2);    
		Character c = print('1');
		String s = print("123");
	    Boolean b = print(false);
	}
	//方法的要求：返回值类型要等于实参类型  <>为声明一个泛型  返回值和实参要一样  一般为T 或者 E
	public static <T>T print(T o){
		return o;*/
		
	}

}
