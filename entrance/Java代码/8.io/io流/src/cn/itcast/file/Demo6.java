package cn.itcast.file;

import java.io.File;

/*文件夹相关
 * File[] listRoots()  列出根目录
 * list()      列出文件名
 * listFiles() 返回当前文件夹的所有子文件和子文件夹,包含隐藏文件  存储到File类型的数组中
 **/
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*File[] roots = File.listRoots(); 
		for(File file : roots){
			System.out.println(file);
		}
		
		
		//把当前文件夹下main的所有子文件名和子文件夹名存储到一个字符串类型的数组
		/*
		  File file = new File("F:\\BaiduNetdiskDownload");
		String[] fileNames = file.list();
		
		for(String fileName : fileNames){
			System.out.println(fileName);
		}
		*/
		File file = new File("F:\\BaiduNetdiskDownload");
		File[] files = file.listFiles();
		for(File fileItem : files){
			System.out.println("文件名："+fileItem);
		}
				
		
		
		
		
		

	}

}
