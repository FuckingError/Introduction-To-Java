package cn.itcast.other;

import java.util.Random;

/*
 * �������
 * */
public class Demo5 {
	public static void main(String[] args)
	{
//		Random random = new Random();
//		int randomNum = random.nextInt(6)+1;//���������0����10֮��
//		System.out.println(randomNum);
//		
		//������֤��
		char[] arr = {'��','��','��','��','��'};
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		
		for(int i = 0;i<4;i++){
		int index = random.nextInt(5);
		sb.append(arr[index]);
		}
		System.out.println(sb);
		
	}
	

}
