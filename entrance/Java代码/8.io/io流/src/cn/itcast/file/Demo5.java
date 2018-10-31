package cn.itcast.file;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.xml.crypto.Data;

/*获取的方法
 * getName()
 * getPath() 返回绝对路径
 * getAbsolutePath() 返回绝对路径 前面会加当前路径
 * length() 获取文件的字节大小
 * getParent() 返回此抽象路径名父目录的路径字符串 
 * lastModified() 获取最后一次被修改的时间
 * 
 * 
 * 
 * */
public class Demo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		File file = new File("F:\\a.txt");
		file.createNewFile();
		
		long lastModified = file.lastModified();
		Date date = new Date(lastModified);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println("最后修改时间："+dateFormat.format(date));
		*/
		
		//打印修改文件的最后时间的步骤
		
		
		File file = new File("F:\\薛钰婷.txt");
		file.createNewFile();
		//获取文件修改的最后时间
		 long lastModified = file.lastModified();
		 //创建Date对象
		 Date date = new Date(lastModified);
		 //创建时间格式  月 时大写 MM HH
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss");
		 //打印输出
		 System.out.println("最后的修改时间："+dateFormat.format(date));

	}

}
