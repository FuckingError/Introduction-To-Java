package cn.itcast.other;

import java.io.IOException;
/*
 * Runtime ���������Ӧ�ó������еĻ���
 * 
 * getRuntime() ���ص�ǰӦ�ó�������л���
 * exec(String command)����ָ����·��ִ�ж�Ӧ�Ŀ�ִ���ļ�
 * freeMemory() ����jvm���е����ݣ����ֽ�Ϊ��λ
 * maxMemory() jvm��ͼ���������ڴ�
 * totalMemory() jvm���ڴ�����
 */
public class Demo2 {
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Runtime runtime = Runtime.getRuntime();
//		Process process = runtime.exec("E:\\a.txt");
//		
//		Thread.sleep(3000);
//		
//		process.destroy();
		
		System.out.println("jvm�����ڴ�"+runtime.freeMemory());
		System.out.println("jvm��ͼ�洢������ڴ棺"+runtime.maxMemory());
		System.out.println("jvm�ڴ�������"+runtime.totalMemory());
	}

}
