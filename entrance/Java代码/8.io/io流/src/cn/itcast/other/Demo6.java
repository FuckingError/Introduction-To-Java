package cn.itcast.other;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * ��ӡ��   printStream  
 * Ӧ�ã� 1.ֱ�ӽ������������ݴ�ӡ���ļ���,��ӡǰ�Ὣ����ת�����ַ�������ʽ
 *     2.��¼��־
 * */ 
public class Demo6 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//Ӧ��һ��
		/*PrintStream printStream = new PrintStream("F:/printStream");
		printStream.print(97);*/
		
		//Ӧ�ö�
		PrintStream printStream  = new PrintStream(new FileOutputStream("F:/2017��6��3��.log",true));
		try{
			int a = 2/0;
		}catch(Exception e){
			e.printStackTrace(printStream);
		}

	}

}
