package cn.itcast.String;

import java.util.Arrays;

public class Demo5 {
	public static void main(String[] args)
	{
		String str = "�ܽ������";
		
		System.out.println("ָ���������滻�ɵ����ݣ�"+str.replace("��", "˧������"));
	    
		str= "��-����-���";
		String[] arr = str.split("-");//����ֵΪ�ַ�����������
		System.out.println("ָ���ַ������и�"+Arrays.toString(arr));
	    
		str = "�ߺ߹���";
		System.out .println("ָ����ʼ�õ�����ֵ��ȡ�ִ���"+str.substring(1, 3));//��ʼֵ+1 = ��ʼ���ַ�  
		
		str = "  abc�й�   ";
		System.out.println("ת��д:"+str.toUpperCase());
		System.out.println("תСд:"+str.toLowerCase());
		System.out.println("�����ո�"+str.trim());
		
		
		
	}

}
