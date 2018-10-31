package cn.itcast.other;
/*
 *通过继承增强BufferedReader的功能
 * */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*我在写这个类时，犯了两种错误
 * 第一个是多次调用方法，而不是去用一个变量取接收该方法的返回值
 * 第二个是不注意line的前后顺序，当line= count+" "+line 放在if语句前面时,line永远不可能为空
 * */
class BufferedLineNum extends BufferedReader{

	public BufferedLineNum(Reader in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

	int count = 1;
	@Override
	public String readLine() throws IOException {
		// TODO Auto-generated method stub
		String line = super.readLine();
	
		if(line==null){
			return null;
		}	
		line = count+" "+line;
		count++;
		return line;
	}
	
	
	
}

public class Demo1 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedLineNum bufferedLineNum = new BufferedLineNum(new FileReader(new File("E:\\JAVA自学\\Java代码\\8.io\\io流\\src\\cn\\itcast\\input\\Demo2.java")));
		String line = null;
		while((line = bufferedLineNum.readLine())!=null){
			System.out.println(line);
		}
		bufferedLineNum.close();
       
	}

}
