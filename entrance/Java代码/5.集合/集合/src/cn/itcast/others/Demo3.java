package cn.itcast.others;
/*java 1.5��������:
 * 1.��ǿforѭ��
 * 2.�ɱ����
 * 3.�Զ������װ��
 * */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2,3));
		}
	//�ɱ����ֻ��һ�������ڲ����б�����
	public static int add(int... arr){
		int sum = 0;
		for(int number : arr){
			sum += number;
		}
		return sum;
	}

}
