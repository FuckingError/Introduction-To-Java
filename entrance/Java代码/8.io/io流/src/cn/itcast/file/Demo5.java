package cn.itcast.file;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.xml.crypto.Data;

/*��ȡ�ķ���
 * getName()
 * getPath() ���ؾ���·��
 * getAbsolutePath() ���ؾ���·�� ǰ���ӵ�ǰ·��
 * length() ��ȡ�ļ����ֽڴ�С
 * getParent() ���ش˳���·������Ŀ¼��·���ַ��� 
 * lastModified() ��ȡ���һ�α��޸ĵ�ʱ��
 * 
 * 
 * 
 * */
public class Demo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		File file = new File("F:\\a.txt");
		file.createNewFile();
		
		long lastModified = file.lastModified();
		Date date = new Date(lastModified);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println("����޸�ʱ�䣺"+dateFormat.format(date));
		*/
		
		//��ӡ�޸��ļ������ʱ��Ĳ���
		
		
		File file = new File("F:\\Ѧ����.txt");
		file.createNewFile();
		//��ȡ�ļ��޸ĵ����ʱ��
		 long lastModified = file.lastModified();
		 //����Date����
		 Date date = new Date(lastModified);
		 //����ʱ���ʽ  �� ʱ��д MM HH
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss");
		 //��ӡ���
		 System.out.println("�����޸�ʱ�䣺"+dateFormat.format(date));

	}

}
