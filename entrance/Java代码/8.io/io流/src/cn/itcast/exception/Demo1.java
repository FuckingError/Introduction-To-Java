package cn.itcast.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.management.RuntimeErrorException;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readTest();

	}
	
	public static void readTest(){
		FileInputStream fileInputStream = null;
		try{
			File file = new File("F:/a11.txt");
			fileInputStream = new FileInputStream(file);
			byte[] buf = new byte[1024];
			int length = 0;
			while((length = fileInputStream.read(buf))!=-1){
				 System.out.println(new String(buf,0,length));
			}
		}catch(IOException e){
			System.out.println("��ȡ�ļ���Դ����");
			throw new RuntimeException(e);//Ŀ�ģ�������ֹ����Ĵ����ִ�� ���ҽ�IOException��װһ�㽻��RuntimeException,ʹ�����ߴ����쳣�������
		}
		finally{
			try {
				if(fileInputStream != null){
					fileInputStream.close();
					System.out.println("�ر���Դ�ɹ�������");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("�ر���Դʧ�ܣ�����");
				throw new RuntimeException(e);
			}
		}
			
	}

}
