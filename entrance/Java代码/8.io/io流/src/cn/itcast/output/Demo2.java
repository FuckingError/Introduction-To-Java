package cn.itcast.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.management.RuntimeErrorException;

public class Demo2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try{
			
			
			File file = new File("E:\\a.jpg");
			File file2 = new File("F:\\a.jpg");
			fileInputStream = new FileInputStream(file);
			//ע��:FileOutputStreamÿһ��new��ʱ��ָ����ͷ��ʼ   ��true���Խ���д
			fileOutputStream = new FileOutputStream(file2);
			
			byte[] buf = new byte[1024];
			int length = 0;
			while((length = fileInputStream.read(buf)) != -1){
				fileOutputStream.write(buf, 0, length);
			}
		
		}catch(IOException e){
			System.out.println("����ͼƬ����");
			throw new RuntimeException(e);
		}
		finally{
			//�ȿ���أ��ȹغ�
		    try {
		    	if(fileInputStream != null){
		    		fileOutputStream.close();
		    		System.out.println("�ر���������Դ�ɹ�������");
		    	}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("�ر���������Դʧ��!!!");
				e.printStackTrace();
			}
		    try{ 
		    	if(fileOutputStream != null){
				    fileInputStream.close();
				    System.out.println("�ر��������Դ�ɹ�������");
				}
		    }catch(IOException e){
		    	System.out.println("�ر��������Դʧ�ܣ�����"); 
		    }
		  
		}
		
		
	}


}
