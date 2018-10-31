package cn.itcast.genrictiry;
/*
 * ���󣺱�дһ�����鹤����
 * 
 * ˼�룺1.���ͷ���ʹ��ʱ����ʵ������Ϊ��������ʱ��һ��Ҫע�ⶨ���ʵ��ʱ��ҪΪ���İ�װ��
 * 
 * �����ࣺ
 *     (1).class ����<�����Զ�������>{
 *        ��������Ҫ����������
 *     }
 *     
 *     (2).���������ʱ��Ҫע�⣺�Ⱥź���ķ���������ǰ��
 *         MyArrays<Character> tools = new MyArrays<Character>();
 *     (3).ע�⣺���һ�����������Ѿ��������Զ��巺�ͣ����ʹ�ø��ഴ�������ʱ��û���ƶ����͵ľ����������ͣ���ôĬ��ΪObject��
 *         ע�⣺��̬����  ��Ҫ�ڷ�������������    
 * */
class MyArrays<T>{
	public void reverse(T[] arr){
		for(int startIndex = 0, endIndex = arr.length-1;startIndex < endIndex;startIndex++,endIndex--){
			T temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
	}
	
	public String toString(T[] arr){
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<arr.length;i++){
			if(i == 0){
				sb.append("["+arr[0]+",");
			}
			else if(i == arr.length-1){
				sb.append(arr[arr.length-1]+"]");
			}
			else{
				sb.append(arr[i]+",");
			}
		}
		return sb.toString();
	}
	
	//��̬����  ��Ҫ�ڷ�������������
	public static <T>void print(T o){
		
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character[] arr = {'a','b','c'};
		MyArrays<Character> tools = new MyArrays<Character>();
		tools.reverse(arr);
		System.out.println(tools.toString(arr));
		
		/*ע�⣺���һ�����������Ѿ��������Զ��巺�ͣ����ʹ�ø��ഴ�������ʱ��û���ƶ����͵ľ����������ͣ���ôĬ��ΪObject��
		 * MyArrays tool2 = new MyArrays();
		tool2.reverse(arr);*/
	}

}
