package cn.itcast.String;
/*
 * �жϵķ���
 */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Demo.java";
		
		System.out.println("�Ƿ���ָ�����ַ���������"+str.endsWith("a"));
		System.out.println("�ж��ַ����Ƿ�Ϊ�����ݣ�"+str.isEmpty());
        System.out.println("�Ƿ����ָ�����ݣ�"+str.contains("."));//ע�����Ϊ�ַ����������Ҫ���ַ���Ҳ��˫���š���
        System.out.println("�ж������ַ����������Ƿ�һ�£�"+"Demo.java".equals(str));
        System.out.println("�ж������ַ��������Ƿ�һ�£����Դ�Сд��"+"demo.java".equalsIgnoreCase(str));
	}
}
