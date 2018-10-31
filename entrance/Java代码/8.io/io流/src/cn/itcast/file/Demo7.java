package cn.itcast.file;
//过滤器和两个小练习
import java.io.File;
import java.io.FilenameFilter;



//创建一个过滤器  
class MyFliter implements FilenameFilter{
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		//过滤器删选的条件
		return name.endsWith("java");
			
	}
}

public class Demo7{
	public static void main(String[] args){
		//创建file类
		File dir = new File("F:\\BaiduNetdiskDownload\\day17\\视频");
		//使用过滤器 把满足条件的文件 文件夹都放到 File类中
		fileList(dir);
	
	}

	public static void fileList(File dir) {
		File[] files = dir.listFiles(new MyFliter());
		for(File file : files){
			System.out.println(file.getName());
		}
	}
}
//技术：/t 打印时对齐
/*
//定义一个过滤器
class MyFliter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		//System.out.println("文件夹："+dir+" 文件："+name);
		return name.endsWith(".java");//过滤器最重要的部分
	}
	
	
}

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("F:\\BaiduNetdiskDownload\\day17\\视频");
		listJava2(dir);
		

		
	}
	
	public static void listJava2(File dir){
		File[] files = dir.listFiles(new MyFliter());//过滤器主要是看return返回的是true还是false
		for(File fileItem : files){
			System.out.println(fileItem.getName());
		}
		
	}
	
	public static void listFile(File dir){
		File[] files = dir.listFiles();
		System.out.println("文件：");
		for(File fileItem : files){
			if(fileItem.isFile()){
				System.out.println("\t"+fileItem.getName());
			}
		}
		
		System.out.println("文件夹：");
		for(File fileItem : files){
			if(fileItem.isDirectory()){
				System.out.println("\t"+fileItem.getName());
			}
		}
	}
	
	public static void listJava(File dir){
		File[] files = dir.listFiles();
		for(File file : files){
			String fileName = file.getName();
		/*	if(fileName.endsWith(".java")){
				System.out.println(fileName);
			}*/
			
/*			
		}
		
	}

}
*/