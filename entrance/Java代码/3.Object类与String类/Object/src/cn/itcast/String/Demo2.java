package cn.itcast.String;

/*
 *String ��ȡ�ķ��� 
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc�й�a";
		System.out.println("�ַ������ȣ�" + str.length());
		System.out.println("��������ֵ���Ҷ�Ӧ���ַ���" + str.charAt(0));//����ֵ+1
		System.out.println("�����ִ���һ�γ��ֵ�����ֵ��" + str.indexOf('a'));
		System.out.println("�����ִ����һ�γ��ֵ�����ֵ��" + str.lastIndexOf('a'));
	}

}
