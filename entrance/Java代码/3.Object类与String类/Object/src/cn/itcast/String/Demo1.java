package cn.itcast.String;
/*
 * String��Ĺ��췽��:
 */
public class Demo1 {
	public static void main(String[] args)
	{
		byte[] buf = {97,98,99};
		String str = new String();
		
		//�ֽ�������ת�����ַ���
		//str = new String(buf);
		str = new String(buf,1,2);
		
		//�ַ�����ת�����ַ���
		char[] arr = {'��','��','��'};
		str = new String(arr,0,1);
		
		//�ֽ���ת�����ַ���
		int[] arr1 = {97,98,99};
		str = new String(arr1,0,2);
		
		System.out.println(str);
		
		
	}

}
