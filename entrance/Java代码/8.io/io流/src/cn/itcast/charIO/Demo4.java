package cn.itcast.charIO;
//利用缓冲字符流的 readLine()方法输出整个文件
//注意  当读到文件末尾时，readLine()返回的是null
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		BufferedReaderLineText();
	    
	}

	public static void BufferedReaderText() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		File file = new File("E:\\JAVA自学\\Java代码\\8.io\\io流\\src\\cn\\itcast\\charIO\\Demo3.java");
		FileReader fileReader = new FileReader(file);
	    BufferedReader bufferedReader = new BufferedReader(fileReader);
	    int content = 0;
	    while((content = bufferedReader.read())!=-1){
	    	System.out.print((char)content);
	    }
	    bufferedReader.close();
	}
	
	public static void BufferedReaderLineText() throws IOException{
		File file = new File("E:\\JAVA自学\\Java代码\\8.io\\io流\\src\\cn\\itcast\\charIO\\Demo3.java");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String string = null;
		while((string = bufferedReader.readLine())!=null){
			System.out.println(bufferedReader.readLine());
		}
		bufferedReader.close();
	}
}
