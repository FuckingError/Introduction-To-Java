package cn.itcast.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//�����ֽ���
public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("F:/a.jpg");
		File file2 = new File("D:/b.jpg");
		FileInputStream fileInputStream = new FileInputStream(file1);
		FileOutputStream fileOutputStream = new FileOutputStream(file2);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		int content = 0;
		while((content = bufferedInputStream.read()) != -1){
			bufferedOutputStream.write(content);
		}
		//��whileѭ���ڲ���Ҫˢ�£���Ϊ�����������Լ�ˢ�£����һ��ѭ��������ˢ�£��ή��Ч��
		bufferedOutputStream.close();
		bufferedInputStream.close();
		
		
	}

}
