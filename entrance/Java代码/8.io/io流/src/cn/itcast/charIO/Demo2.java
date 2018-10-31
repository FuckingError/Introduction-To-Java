package cn.itcast.charIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("F:/a.txt");
		FileWriter fileWriter = new FileWriter(file,true);
		fileWriter.write("ÎÒ°®Äã£¡£¡£¡");
		fileWriter.close();

	}

}
