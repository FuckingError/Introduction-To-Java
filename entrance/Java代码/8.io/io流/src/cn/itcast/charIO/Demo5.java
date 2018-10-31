
package cn.itcast.charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.annotation.processing.Filer;

// 自己写readLine()方法
public class Demo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	/*	File file = new File("E:\\JAVA自学\\Java代码\\8.io\\io流\\src\\cn\\itcast\\charIO\\Demo3.java");
		FileReader fileReader = new FileReader(file);//流
		String string =null;
		while((string = myReadLine(fileReader))!=null){
			System.out.println(string);
		}
*/
		text();
		

	}
	public static String myReadLine(FileReader fileReader) throws IOException{
		StringBuilder sb = new StringBuilder();
		int content = 0;
		while((content = fileReader.read())!=-1){//当read到流的末尾返回-1
			if(content=='\n'){
				break;
			}
			else if(content =='\r'){
				continue;
			}
			else{
				sb.append((char)content);
			}
		}
		if(content==-1){
			return null;
		}
		return sb.toString();
	}
	//测试FileReader能不能读取每行的/r /n
	//测试结果：可以读到/r /n的
	public static void text() throws IOException{
		File file = new File("F:/a.txt");
		FileReader fileReader = new FileReader(file);
	    
		int content = 0;
		while((content = fileReader.read())!=-1){
			System.out.println(content);
		}
		
	}
}
