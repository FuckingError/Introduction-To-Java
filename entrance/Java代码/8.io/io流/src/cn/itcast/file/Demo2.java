package cn.itcast.file;

import java.io.File;

/*
 * ·������:
 * 
 * */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(".");
		System.out.println("��ǰ·���ǣ�"+file.getAbsolutePath());
		
		//.. ��һ��     ���·�����ܸı��̷�
		File file2 = new File("..\\a.txt");
		System.out.println("������"+file2.exists());

	}

}
