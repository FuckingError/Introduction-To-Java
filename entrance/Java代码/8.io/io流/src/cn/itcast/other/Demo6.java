package cn.itcast.other;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * 打印流   printStream  
 * 应用： 1.直接将任意类型数据打印在文件上,打印前会将数据转换成字符串的形式
 *     2.记录日志
 * */ 
public class Demo6 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//应用一：
		/*PrintStream printStream = new PrintStream("F:/printStream");
		printStream.print(97);*/
		
		//应用二
		PrintStream printStream  = new PrintStream(new FileOutputStream("F:/2017年6月3日.log",true));
		try{
			int a = 2/0;
		}catch(Exception e){
			e.printStackTrace(printStream);
		}

	}

}
