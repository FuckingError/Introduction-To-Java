package cn.itcast.Map;

import java.util.Arrays;
import java.util.List;

/*���鹤���ࣺ
 * 
 * */
public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {12,3,4,5};
		Integer[] arr1 = Arrays.copyOf(arr, 4);
		Integer[] arr2 = Arrays.copyOfRange(arr, 1, 2);
		System.out.println("��������Ԫ�أ�"+Arrays.toString(arr1));
  		System.out.println("�������Ԫ��arr2��"+Arrays.toString(arr2));
		
		// �Ƚ�����Ԫ���Ƿ�һ�£�
		System.out.println("�ж�����Ԫ���Ƿ�һ�£�" + Arrays.equals(arr, arr1));

		// �������ɼ��ϣ�
		List<Integer> list = Arrays.asList(arr);
		System.out.println("����ת���ɼ��ϣ�" + list);
	}

}
