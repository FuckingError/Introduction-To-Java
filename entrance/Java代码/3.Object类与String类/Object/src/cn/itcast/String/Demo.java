package cn.itcast.String;
//== �� equals������   String�ַ��������ִ�����ʽ������
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hello";//ջ�ڴ��д�������ַ����������еĵ�ַ
		String s3 = new String("hello");//�ڶ��ڴ��лḴ���ַ����������е��ַ�����������һ������ջ�ڴ��д�����Ƕ��ڴ��еĵ�ַ
		String s4 = new String("hello");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);//�Ƚϵ��ǵ�ַ
		System.out.println(s3.equals(s2));//�Ƚϵ�������
 
	}
}
