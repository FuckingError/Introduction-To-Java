package cn.itcast.String;

/*
 *String 获取的方法 
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc中国a";
		System.out.println("字符串长度：" + str.length());
		System.out.println("根据索引值查找对应的字符：" + str.charAt(0));//索引值+1
		System.out.println("查找字串第一次出现的索引值：" + str.indexOf('a'));
		System.out.println("查找字串最后一次出现的索引值：" + str.lastIndexOf('a'));
	}

}
