package cn.itcast.file;

import java.io.File;

/*
IO����



*/
public class Demo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File������ֹ��췽��
		
		//File file = new File("F:\\a.txt");
		
		/*
		File parentFile = new File("F:\\");
		File file = new File(parentFile,"a.txt");
		*/
		
		File file = new File("F:\\","a.txt");
		System.out.println("������"+file.exists());
		//Ŀ¼�ָ���
		System.out.println("Ŀ¼�ָ�����"+File.separator);
		 

	}

}
