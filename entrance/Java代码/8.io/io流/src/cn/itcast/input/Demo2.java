package cn.itcast.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*1.���ر���Դ��ʲôӰ�죿
 *  ����ر���Դ
 *2.����������ֱ�Ӹ��ǵ� ������������������Ҫ��0��length
 * 
 * */
public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("F:\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] buf = new byte[3];
		int length = 0;
		while((length = fileInputStream.read(buf))!=-1){
			System.out.print(new String(buf,0,length));//�����ں������o,length ��Ϊ����ֱ�Ӹ��ǵ�
		}
		System.out.println("��ȡ�ļ���Դ��ϣ�����");
		fileInputStream.close();
		
		
				
		

	}

}
