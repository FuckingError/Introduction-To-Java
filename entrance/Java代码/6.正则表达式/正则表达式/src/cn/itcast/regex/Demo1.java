package cn.itcast.regex;
/*
 * ������ʽ:��Ҫ�ǲ����ַ���
 * */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ԥ�����ַ���  1+3��2
		System.out.println("�����ַ�:"+"*".matches("."));
		
		System.out.println("�����ַ�:"+"1".matches("\\d"));
		System.out.println("�������ַ�:"+"*".matches("\\D"));
		
		System.out.println("�հ��ַ�:"+"\r".matches("\\s"));// \r��ʾ�ո��  \n��ʾ���м�
		System.out.println("�ǿհ��ַ�:"+"*".matches("\\S"));
		
		System.out.println("�����ַ�:"+"_1a".matches("\\w{3}"));
		System.out.println("�ǵ����ַ�:"+"*".matches("\\W"));
		
		
		//������ 2��3
		System.out.println("\n��λ�һ��:"+"".matches("\\d?"));
		System.out.println("��λ���:"+"".matches("\\d*"));
		System.out.println("һ�λ���:"+"2".matches("\\d+"));
		
		System.out.println("ǡ��n��:"+"22".matches("\\d+{2}"));
		System.out.println("����n��:"+"2222".matches("\\d+{2,}"));
		System.out.println("����n�ε��ǲ�����m��:"+"222".matches("\\d+{2,3}"));
		
		//��Χ �� 
		System.out.println("a��b��c:"+"cbc".matches("[abc]{2,}"));//ע��ֻ����һ���ַ������Ǻ�������������
		System.out.println("a��z��A-Z:"+"cadAD".matches("[a-zA-Z]+"));
		System.out.println("��a b c:"+"d".matches("[^abc]"));
	}

}
