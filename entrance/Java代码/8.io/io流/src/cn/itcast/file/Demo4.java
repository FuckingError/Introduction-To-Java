package cn.itcast.file;
//删除的方法
//判断的方法
/*isFile
 * isDirectory 是否是一个目录
 * isHidden
 * isAbsolute
 * */
import java.io.File;
import java.io.IOException;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("F:\\a.txt");
		//file.createNewFile();
		System.out.println(file.exists());
		System.out.println("判断是否为隐藏文件："+file.isHidden());
	}

}
