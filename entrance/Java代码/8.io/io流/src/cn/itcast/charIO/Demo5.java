
package cn.itcast.charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.annotation.processing.Filer;

// �Լ�дreadLine()����
public class Demo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	/*	File file = new File("E:\\JAVA��ѧ\\Java����\\8.io\\io��\\src\\cn\\itcast\\charIO\\Demo3.java");
		FileReader fileReader = new FileReader(file);//��
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
		while((content = fileReader.read())!=-1){//��read������ĩβ����-1
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
	//����FileReader�ܲ��ܶ�ȡÿ�е�/r /n
	//���Խ�������Զ���/r /n��
	public static void text() throws IOException{
		File file = new File("F:/a.txt");
		FileReader fileReader = new FileReader(file);
	    
		int content = 0;
		while((content = fileReader.read())!=-1){
			System.out.println(content);
		}
		
	}
}
