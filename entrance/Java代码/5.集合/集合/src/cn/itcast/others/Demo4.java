package cn.itcast.others;
//�����������ͺ���ص���
//�Զ������װ��
/*int  Integer
 *
 *char Character
 */
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stringת����int
		String a = "10";
		int b = Integer.parseInt(a);
		System.out.println("Stringת����int��"+(b+1));
		
		//intת����String
		String c = Integer.toString(b);
		System.out.println("��intת����String:"+(c+1));
		
		//��intת������Ҫ�Ľ���
		System.out.println("ת���ɶ����ƣ�"+Integer.toBinaryString(b));
		System.out.println("ת���ɰ˽��ƣ�"+Integer.toOctalString(b));
		System.out.println("ת����ʮ�����ƣ�"+Integer.toHexString(b));
		
		//��Stringת�ɶ�Ӧ����
		int d = Integer.parseInt(a, 2);
		System.out.println("��Stringת���ɶ�����:"+d);
		
		
		

	}

}
