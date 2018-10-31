package cn.itcast.file;

import java.io.File;

/*
IO技术



*/
public class Demo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File类的三种构造方法
		
		//File file = new File("F:\\a.txt");
		
		/*
		File parentFile = new File("F:\\");
		File file = new File(parentFile,"a.txt");
		*/
		
		File file = new File("F:\\","a.txt");
		System.out.println("存在吗："+file.exists());
		//目录分隔符
		System.out.println("目录分隔符："+File.separator);
		 

	}

}
