package cn.itcast.charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readTest();
		

	}
	public static void readTest() throws IOException{
		File file = new File("F:/a.txt");
		FileReader fileReader = new FileReader(file);
		/*ÊÇ²»ÊÇÉµÀ²
		char[] buf = null;
		*/
		char[] buf = new char[1024];
		int length = 0;
		while((length = fileReader.read(buf)) != -1){
			System.out.println(buf);
		}
		fileReader.close();
		
		
	}

}
