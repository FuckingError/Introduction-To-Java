package cn.itcast.String;
/*
 * 判断的方法
 */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Demo.java";
		
		System.out.println("是否以指定的字符串结束："+str.endsWith("a"));
		System.out.println("判断字符串是否为空内容："+str.isEmpty());
        System.out.println("是否包含指定内容："+str.contains("."));//注意参数为字符串，如果需要是字符，也用双引号“”
        System.out.println("判断两个字符串的内容是否一致："+"Demo.java".equals(str));
        System.out.println("判断两个字符串内容是否一致，忽略大小写："+"demo.java".equalsIgnoreCase(str));
	}
}
