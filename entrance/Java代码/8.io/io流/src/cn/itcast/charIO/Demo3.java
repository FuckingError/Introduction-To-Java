package cn.itcast.charIO;
//���û����ַ�������ͼƬ  �������ˣ���Ϊ�������ݶ�ʧ 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("D:/b.jpg");
		File file2 = new File("F:/a.jpg");
		FileReader fileReader = new FileReader(file1);
		FileWriter fileWriter = new FileWriter(file2);
		char[] buf = new char[1024];
		int length = 0;
		while((length = fileReader.read(buf)) != -1){
			fileWriter.write(buf);
		}
		fileWriter.close();
		fileReader.close();
		
		
				

	}

}
