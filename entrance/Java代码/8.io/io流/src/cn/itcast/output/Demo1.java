package cn.itcast.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterWriter;
import java.io.IOException;

/*
 * ����ֽ���
 * ע�⣺1.���ʹ��FileOutStream��ʱ��Ŀ���ļ������ڣ���ô���Զ�����Ŀ���ļ�����
 * 
 *    !!! 2.���Ŀ���ļ��Ѿ����ڣ������ԭ�����ݣ���д���µ�����
 *     
 *     3.FileOutputStreamÿһ��new��ʱ��ָ����ͷ��ʼ   ��true���Խ���д
 * */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		writeTest1();
		
		

	}
	public static void writeTest1() throws IOException{
		
			File file = new File("F:\\a.txt");
			FileOutputStream fileOutputStream = new FileOutputStream(file,true);//�����һ��true�����ļ�ĩβ�������
			
			fileOutputStream.write(" I love you".getBytes());//ֻ�����ֽ�����
			fileOutputStream.close();
		
				
	}
 
}
