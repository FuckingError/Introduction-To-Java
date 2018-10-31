//时间：2017年3月19日12:23:28
//目的：接受一个数组，去掉其中的0，然后输出
import java.util.*;

class Demo
{
	public static void main(String[] args)
	{
        
		int[] arr = {0,0,3,2,4,0};
		clearZero(arr);
	}

	public static void clearZero(int[] arr)
	{	
		int number = 0;
		for(int i = 0;i<arr.length;i++)
		{
		    if(arr[i] == 0)
			{
				number++;
			}
        }
		int[] arr2 = new int[arr.length-number];
		int i = 0;
			for(int j = 0;j<arr.length;j++)
			{
				if(arr[j]!=0)
				{
					
					arr2[i] = arr[j];
					i++;
				}
			}
		String output = Arrays.toString(arr2);
		System.out.println(output);
	}				
}	
					
		             
				
			
				
		


	
		
	
