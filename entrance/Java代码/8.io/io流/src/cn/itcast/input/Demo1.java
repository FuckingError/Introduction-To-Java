package cn.itcast.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*File 只能读取文件属性   要读取文件内容要使用流   以程序为参照，数据流入或流出
 * 
 * 选取第四种方式
  
  字节输入流
 */
public class Demo1 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		File file = new File("F:\\a.txt");
		readTest4(file);
		
		
		
	
	}
	//方法一：缺陷只能读到一个
	public static void readTest(File file)throws IOException{
		FileInputStream fileInputStream = new FileInputStream(file);
		int content = fileInputStream.read();//read() 方法每次只能读到一个字节
		System.out.println("读到的内容："+(char)content);
		//最后一步  关闭资源
		fileInputStream.close();
	}
	
	//方法二:将read 与 while 结合在一起  缺陷：效率低
	public static void readTest2(File file) throws IOException{
		FileInputStream fileInputStream = new FileInputStream(file);
		//当read()读完之后，会返回一个-1
		int content = 0;
		while((content = fileInputStream.read())!= -1){
			System.out.print((char)content);
		}
		fileInputStream.close();
	}
	//方法三：使用缓冲数组读取 缺陷：无法读取完整的文件数据
	public static void readTest3(File file) throws IOException{
		FileInputStream fileInputStream = new FileInputStream(file);
		//建立缓冲字节数组
		byte[] buf = new byte[6];
		int length = fileInputStream.read(buf);//将字节数据读取进buf中  read方法的返回值是已经读取的字节数据个数
		//使用字节数组构建字符串
		String content = new String(buf);
		System.out.println("内容:"+content);
		fileInputStream.close();
	}
	
	//方法四:将缓冲数组与while循环结合
	public static void readTest4(File file) throws IOException{
		FileInputStream fileInputStream = new FileInputStream(file);
		//建立缓冲数组
		int length = 0;
		byte[] buf = new byte[3];
	    while((length = fileInputStream.read(buf))!=-1){
	    	System.out.print(new String(buf,0,length));
	    }
	    fileInputStream.close();
		
		
	}
		

}
