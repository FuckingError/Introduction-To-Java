package cn.itcast.other;

import java.io.File;
import java.io.IOException;
//时间：2017年6月3日20:17:58
/*递归
 * 总结：写递归从最简单的两级开始想
 *     写代码时，先想第一级的整个代码
 *     方法中的形参分为两种：一种是需要调用的数据，另一种是递归中变化的量，这个量在方法中再次调用该方法时要在形参中添加变化的方式
 *     
 *     
 * */
public class Demo8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.out.println("结果是："+test(5));
		//listFile(new File("E:\\JAVA自学\\Java代码\\8.io\\io流"),"|--");
		//deleteFile(new File("F:/a"));
		moveFile(new File("F:/a"),new File("E:/"));
		//test2();
	}
	
	//实现5的阶乘
	public static int test(int number){
		if(number == 1){
			return 1;
		}else{
			return number*test(--number);
		}
	}
	
	//列出一个文件夹的子孙文件目录
	public static void listFile(File dir,String space){
		File[] files = dir.listFiles();
		for(File file : files){
			if(file.isFile()){
				System.out.println(space+file.getName());
			}else if(file.isDirectory()){
				System.out.println(space+file.getName());
				listFile(file,"|  "+space);
			}
		}
	}
	//删除一个非空文件夹
	public static void deleteFile(File dir){
		File[] files = dir.listFiles();
		for(File file : files){
			if(file.isFile()){
				file.delete();
			}else if(file.isDirectory()){
				deleteFile(file);
			}
		}
		dir.delete();
	}

	//测试file.toString的打印结果  F:\a   file.getName 打印结果b
	public static void test2(){
		File file = new File("F:\\a\\b");
		System.out.println(file.toString());
	}
	
	
	//剪切一个非空文件夹 E:\a  E:\a\b
	//这一题难度有两块 都是和文件夹有关  第一个是文件名 toStirng出来的文件名与new File() 要用的文件名不匹配  
	//以后涉及文件夹的String类型的操作都这样写"\\" "\\"
	//心得：写代码时，出现问题还是得多改，多运行
	
	//第二个是 原文件夹还在 得删去
	public static void moveFile(File dir,File dird) throws IOException{
		String arr = null;
		
		//文件夹的名字
		if(dird.toString().endsWith("\\")){
			arr = dird.toString()+"\\"+dir.getName();
		}else{
			String str = dird.toString()+"\\"+dir.getName();
			arr = str.replace("\\", "\\"+"\\");
		}
		
		System.out.println(arr); 
		File dir3 = new File(arr);
		dir3.mkdir();
		
		File[] files = dir.listFiles();
		for(File file : files){
			if(file.isFile()){
				file.renameTo(new File(arr+"//"+file.getName()));
			}else if(file.isDirectory()){
				moveFile(file,dir3);
			}
		}
		//因为原文件夹还在，所以得删掉	
		dir.delete();
	}
}
