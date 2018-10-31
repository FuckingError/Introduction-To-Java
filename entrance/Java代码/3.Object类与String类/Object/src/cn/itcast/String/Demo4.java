package cn.itcast.String;

import java.util.Arrays;

/*
 * 转换方法
 * 字节数组与字符数组、字符串三者之间是可以互相转换的
 */
public class Demo4 {
	public static void main(String[] args)
	{
		String str = "asadasf";
		char[] buf = str.toCharArray();
		System.out.println("字符数组："+Arrays.toString(buf));
		
		byte[] buf2 = str.getBytes();
		System.out.print("字节数组:"+Arrays.toString(buf2));
	
	}

}
