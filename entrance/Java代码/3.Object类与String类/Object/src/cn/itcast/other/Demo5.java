package cn.itcast.other;

import java.util.Random;

/*
 * 随机数类
 * */
public class Demo5 {
	public static void main(String[] args)
	{
//		Random random = new Random();
//		int randomNum = random.nextInt(6)+1;//产生随机数0——10之间
//		System.out.println(randomNum);
//		
		//生成验证码
		char[] arr = {'周','杰','伦','刘','清'};
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		
		for(int i = 0;i<4;i++){
		int index = random.nextInt(5);
		sb.append(arr[index]);
		}
		System.out.println(sb);
		
	}
	

}
