package cn.itcast.other;
//ת����
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Demo7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*readTest();
		writeTest();*/
		//writeTest2();
		readTest2();
	}
	//ʹ������ַ�����ת����ָ�������
	public static void writeTest2() throws IOException{
		FileOutputStream fileOutputStream = new FileOutputStream("F:/a.txt");
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"utf-8");
		outputStreamWriter.write("���й��ð� ");
		outputStreamWriter.close();
	}
	
	 //ʹ�������ַ�����ת����ָ�������
	public static void readTest2() throws IOException{
		FileInputStream fileInputStream = new FileInputStream("F:/a.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");
		char[] buf = new char[1024];
		int length = 0;
		while((length = inputStreamReader.read(buf))!=-1){
			System.out.println(new String(buf,0,length));
		}
		inputStreamReader.close();
	}
	
	
	public static void writeTest() throws IOException{
		FileOutputStream fileOutputStream = new FileOutputStream("F:/a.txt");
		OutputStreamWriter outputStreamWriter =  new OutputStreamWriter(fileOutputStream);
		outputStreamWriter.write("����������");
		outputStreamWriter.close();
	}
	
	public static void readTest() throws IOException{
		InputStream inputStream = System.in;
		//System.out.println((char)inputStream.read());
		//��������һ���ַ�
		//����һ������ת���� 
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println(bufferedReader.readLine());
		
			
		
	}

}
