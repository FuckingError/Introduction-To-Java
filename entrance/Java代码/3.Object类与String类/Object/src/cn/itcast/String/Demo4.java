package cn.itcast.String;

import java.util.Arrays;

/*
 * ת������
 * �ֽ��������ַ����顢�ַ�������֮���ǿ��Ի���ת����
 */
public class Demo4 {
	public static void main(String[] args)
	{
		String str = "asadasf";
		char[] buf = str.toCharArray();
		System.out.println("�ַ����飺"+Arrays.toString(buf));
		
		byte[] buf2 = str.getBytes();
		System.out.print("�ֽ�����:"+Arrays.toString(buf2));
	
	}

}
