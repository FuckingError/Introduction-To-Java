//时间：2017年3月19日11:32:33
//目的：二维数组机器输出

import java.util.*;
class Demo
{
	public static void main(String[] args) 
	{
		//动态
		/*
		int[][] arr = new int[3][4];
		arr[1][3] = 100;
		System.out.println("二维数组的长度："+arr[1][3]);
	    */
		//静态
		int[][] arr = {{10,11,9},{67,12},{33,35,39,40}};
	    for(int i = 0;i<arr.length;i++)
		{
			String a = Arrays.toString(arr[i]);
			System.out.println(a);

			/*
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		   */
		}
		
	}
	}