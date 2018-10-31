package cn.itcast.String;
/*
 * String类的构造方法:
 */
public class Demo1 {
	public static void main(String[] args)
	{
		byte[] buf = {97,98,99};
		String str = new String();
		
		//字节码数组转换成字符串
		//str = new String(buf);
		str = new String(buf,1,2);
		
		//字符数组转换成字符串
		char[] arr = {'周','杰','伦'};
		str = new String(arr,0,1);
		
		//字节码转换成字符串
		int[] arr1 = {97,98,99};
		str = new String(arr1,0,2);
		
		System.out.println(str);
		
		
	}

}
