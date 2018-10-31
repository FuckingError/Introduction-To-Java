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
			//注意:FileOutputStream每一次new的时候，指针会从头开始   加true可以接着写
			fileOutputStream = new FileOutputStream(file2);
			
			byte[] buf = new byte[1024];
			int length = 0;
			while((length = fileInputStream.read(buf)) != -1){
				fileOutputStream.write(buf, 0, length);
			}
		
		}catch(IOException e){
			System.out.println("拷贝图片出错");
			throw new RuntimeException(e);
		}
		finally{
			//先开后关，先关后开
		    try {
		    	if(fileInputStream != null){
		    		fileOutputStream.close();
		    		System.out.println("关闭输入流资源成功！！！");
		    	}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("关闭输入流资源失败!!!");
				e.printStackTrace();
			}
		    try{ 
		    	if(fileOutputStream != null){
				    fileInputStream.close();
				    System.out.println("关闭输出流资源成功！！！");
				}
		    }catch(IOException e){
		    	System.out.println("关闭输出流资源失败！！！"); 
		    }
		  
		}
		
		
	}


}
