package cn.itcast.String;

public class Demo6 {
	public static void main(String[] args)
	{
		String str = " 周杰伦  ";
		myTrim(str);
		
		str = "JAVA自学\\Java代码\\2.面向对象\\21.Object类与String类\\Object\\src\\cn\\itcast\\String";
	    System.out.println(getString(str));	
		
	    str = "周杰伦好帅";
	    System.out.println(reverse(str));
	    
	    str = "javawwqfjavasdfajava";
	    System.out.println(getCount(str,"java"));
	}
	
	// 统计java的次数
	public static int getCount(String str, String target) {
		int count = 0;// 统计个数
		int fromIndex = 0;// 开始查找的索引值

		while ((fromIndex = str.indexOf(target, fromIndex)) != -1) {
			count++;
			fromIndex = fromIndex + target.length();
		}
		
		return count;
	}
	
	
	
	
	//反转
	public static String reverse(String str){
		char[] c = str.toCharArray();
		for(int startIndex = 0,endIndex = c.length-1;startIndex<endIndex;startIndex++,endIndex--){
			char temp = c[startIndex];
			c[startIndex] = c[endIndex];
			c[endIndex] = temp;
		}
		
	    return new String(c);
	
	}
	
	//需求获取String
	public static String getString(String str){
		int index = str.lastIndexOf("S");
		String s = str.substring(index);
	    return s;
	}
	
	//需求一：自己实现trim的方法
	public static void myTrim(String str){
		char[] arr = str.toCharArray();
		
		int startIndex = 0;
		int endIndex = str.length()-1;
		
		while(true){
			if(arr[startIndex]==' '){
				startIndex++;
			}
			else{
				break;
			}
		}
		
		while(true){
			if(arr[endIndex]==' '){
				endIndex--;
			}
			else{
				break;
			}
		}
		
		String str2 = str.substring(startIndex, endIndex+1);
		System.out.println(str2);
	}
			
}
