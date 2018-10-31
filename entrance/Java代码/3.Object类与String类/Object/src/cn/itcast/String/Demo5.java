package cn.itcast.String;

import java.util.Arrays;

public class Demo5 {
	public static void main(String[] args)
	{
		String str = "周杰伦真屌";
		
		System.out.println("指定新内容替换旧的内容："+str.replace("真", "帅！！！"));
	    
		str= "大-家下-午好";
		String[] arr = str.split("-");//返回值为字符串类型数组
		System.out.println("指定字符进行切割"+Arrays.toString(arr));
	    
		str = "哼哼哈嘿";
		System.out .println("指定开始得到索引值截取字串："+str.substring(1, 3));//开始值+1 = 开始的字符  
		
		str = "  abc中国   ";
		System.out.println("转大写:"+str.toUpperCase());
		System.out.println("转小写:"+str.toLowerCase());
		System.out.println("消除空格："+str.trim());
		
		
		
	}

}
