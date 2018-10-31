package cn.itcast.file;

import java.io.File;

/*
 * 路径问题:
 * 
 * */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(".");
		System.out.println("当前路径是："+file.getAbsolutePath());
		
		//.. 上一层     相对路径不能改变盘符
		File file2 = new File("..\\a.txt");
		System.out.println("存在吗？"+file2.exists());

	}

}
