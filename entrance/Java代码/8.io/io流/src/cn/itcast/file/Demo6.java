package cn.itcast.file;

import java.io.File;

/*�ļ������
 * File[] listRoots()  �г���Ŀ¼
 * list()      �г��ļ���
 * listFiles() ���ص�ǰ�ļ��е��������ļ������ļ���,���������ļ�  �洢��File���͵�������
 **/
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*File[] roots = File.listRoots(); 
		for(File file : roots){
			System.out.println(file);
		}
		
		
		//�ѵ�ǰ�ļ�����main���������ļ��������ļ������洢��һ���ַ������͵�����
		/*
		  File file = new File("F:\\BaiduNetdiskDownload");
		String[] fileNames = file.list();
		
		for(String fileName : fileNames){
			System.out.println(fileName);
		}
		*/
		File file = new File("F:\\BaiduNetdiskDownload");
		File[] files = file.listFiles();
		for(File fileItem : files){
			System.out.println("�ļ�����"+fileItem);
		}
				
		
		
		
		
		

	}

}
