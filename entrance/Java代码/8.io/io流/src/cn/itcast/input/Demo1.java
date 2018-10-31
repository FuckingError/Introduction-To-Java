package cn.itcast.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*File ֻ�ܶ�ȡ�ļ�����   Ҫ��ȡ�ļ�����Ҫʹ����   �Գ���Ϊ���գ��������������
 * 
 * ѡȡ�����ַ�ʽ
  
  �ֽ�������
 */
public class Demo1 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		File file = new File("F:\\a.txt");
		readTest4(file);
		
		
		
	
	}
	//����һ��ȱ��ֻ�ܶ���һ��
	public static void readTest(File file)throws IOException{
		FileInputStream fileInputStream = new FileInputStream(file);
		int content = fileInputStream.read();//read() ����ÿ��ֻ�ܶ���һ���ֽ�
		System.out.println("���������ݣ�"+(char)content);
		//���һ��  �ر���Դ
		fileInputStream.close();
	}
	
	//������:��read �� while �����һ��  ȱ�ݣ�Ч�ʵ�
	public static void readTest2(File file) throws IOException{
		FileInputStream fileInputStream = new FileInputStream(file);
		//��read()����֮�󣬻᷵��һ��-1
		int content = 0;
		while((content = fileInputStream.read())!= -1){
			System.out.print((char)content);
		}
		fileInputStream.close();
	}
	//��������ʹ�û��������ȡ ȱ�ݣ��޷���ȡ�������ļ�����
	public static void readTest3(File file) throws IOException{
		FileInputStream fileInputStream = new FileInputStream(file);
		//���������ֽ�����
		byte[] buf = new byte[6];
		int length = fileInputStream.read(buf);//���ֽ����ݶ�ȡ��buf��  read�����ķ���ֵ���Ѿ���ȡ���ֽ����ݸ���
		//ʹ���ֽ����鹹���ַ���
		String content = new String(buf);
		System.out.println("����:"+content);
		fileInputStream.close();
	}
	
	//������:������������whileѭ�����
	public static void readTest4(File file) throws IOException{
		FileInputStream fileInputStream = new FileInputStream(file);
		//������������
		int length = 0;
		byte[] buf = new byte[3];
	    while((length = fileInputStream.read(buf))!=-1){
	    	System.out.print(new String(buf,0,length));
	    }
	    fileInputStream.close();
		
		
	}
		

}
