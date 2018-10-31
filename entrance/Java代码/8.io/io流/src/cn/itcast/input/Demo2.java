package cn.itcast.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*1.不关闭资源有什么影响？
 *  必须关闭资源
 *2.缓冲数组是直接覆盖的 所以输出缓冲数组必须要加0，length
 * 
 * */
public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("F:\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] buf = new byte[3];
		int length = 0;
		while((length = fileInputStream.read(buf))!=-1){
			System.out.print(new String(buf,0,length));//必须在后面添加o,length 因为他是直接覆盖的
		}
		System.out.println("读取文件资源完毕！！！");
		fileInputStream.close();
		
		
				
		

	}

}
