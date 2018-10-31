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
			System.out.println("读取文件资源出错");
			throw new RuntimeException(e);//目的：可以阻止下面的代码的执行 并且将IOException包装一层交给RuntimeException,使调用者处理异常更加灵活
		}
		finally{
			try {
				if(fileInputStream != null){
					fileInputStream.close();
					System.out.println("关闭资源成功！！！");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("关闭资源失败！！！");
				throw new RuntimeException(e);
			}
		}
			
	}

}
