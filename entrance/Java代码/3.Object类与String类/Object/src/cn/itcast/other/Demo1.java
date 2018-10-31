package cn.itcast.other;

import java.util.Arrays;
import java.util.Properties;

/*
 *  System类  主要用于获取系统的属性数据 
 * arraycopy() 
 * currentTimeMillis()
 * exit(int status) 退出jvm 如果参数是0，表示正常退出jvm，非零表示异常退出jvm
 * gc() 建议jvm启动垃圾回收器回收垃圾
 * finalize() 如果一个对象被垃圾回收器回收的时候，会先调用对象的finalize()方法
 */

class Person{
	String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public void finalize() throws Throwable{
		super.finalize();
		System.out.println(this.name+"被回收了！！！");
	}
}

public class Demo1 {
	public static void main(String[] args)
	{
//		int[] arr = {0,1,2,3,4,5};
//		int[] newarr = new int[4];
//		System.arraycopy(arr, 1, newarr, 2, 2);
//		//System.exit(1);//jvm退出  
//		System.out.println("目标数组的元素"+Arrays.toString(newarr));
//		System.out.println("当前系统时间："+System.currentTimeMillis());
//		
		/*gc() 建议jvm启动垃圾回收器回收垃圾
		for(int i = 1;i<=4;i++){
			new Person("郝爽"+i);
			System.gc();
		}
		*/
		
		/*
	    Properties properties = System.getProperties();
		properties.list(System.out);
		*/
		
		String value = System.getProperty("os.name");
		System.out.println(value);
	}

}
