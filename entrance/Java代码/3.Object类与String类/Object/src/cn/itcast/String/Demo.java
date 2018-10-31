package cn.itcast.String;
//== 和 equals的区别   String字符串的两种创建方式的区别
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hello";//栈内存中储存的是字符串常量池中的地址
		String s3 = new String("hello");//在堆内存中会复制字符串常量池中的字符串，并创建一个对象，栈内存中储存的是堆内存中的地址
		String s4 = new String("hello");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);//比较的是地址
		System.out.println(s3.equals(s2));//比较的是内容
 
	}
}
