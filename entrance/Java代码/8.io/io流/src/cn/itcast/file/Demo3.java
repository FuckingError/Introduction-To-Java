package cn.itcast.file;
//File类的常见创建方法
import java.io.File;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file = new File("F:\\a.txt");
		//创建文件
	    System.out.println("创建成功了么："+file.createNewFile());
        
	    //创建单级文件夹
	    /*
	    File dir = new File("F:\\a");
	    System.out.println("创建成功了么："+dir.mkdir());//mkdir创建一个单级的文件夹
	    */
	    //创建多级文件夹
	    /*
	    File dir1 = new File("F:\\aaa\\bb");
	    System.out.println("创建成功了么："+dir1.mkdirs());
	    */
	       
	    //renameTo 重命名文件夹和文件       如果目标文件与源文件是在同一个路径下，那么renameTo重命名
	    /*
	    File newFile = new File("F:/aaaa.txt");
	    System.out.println("重命名成功了么？"+file.renameTo(newFile));
	    /*
	             如果想重命名多级文件夹里面的文件夹，得注意路径
	    File newFile1 = new File("F:\\aaa\\c.txt");
	    System.out.println("重命名成功了么？"+dir1.renameTo(newFile1));
	    
	    */
	    //如果目标文件与源文件在不同路径下，剪切  不能操作文件夹
	    File newFile1 = new File("E:\\c.txt");
	    System.out.println("剪切成功了么？"+file.renameTo(newFile1));
	    
	}

}
