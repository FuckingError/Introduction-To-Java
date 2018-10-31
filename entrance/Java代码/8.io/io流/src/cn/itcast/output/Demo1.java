package cn.itcast.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterWriter;
import java.io.IOException;

/*
 * 输出字节流
 * 注意：1.如果使用FileOutStream的时候，目标文件不存在，那么会自动创建目标文件对象
 * 
 *    !!! 2.如果目标文件已经存在，会清空原有数据，再写入新的数据
 *     
 *     3.FileOutputStream每一次new的时候，指针会从头开始   加true可以接着写
 * */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		writeTest1();
		
		

	}
	public static void writeTest1() throws IOException{
		
			File file = new File("F:\\a.txt");
			FileOutputStream fileOutputStream = new FileOutputStream(file,true);//后面加一个true，在文件末尾添加数据
			
			fileOutputStream.write(" I love you".getBytes());//只接受字节数据
			fileOutputStream.close();
		
				
	}
 
}
