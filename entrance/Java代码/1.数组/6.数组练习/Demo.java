//ʱ�䣺2017��3��19��12:23:28
//Ŀ�ģ�����һ�����飬ȥ�����е�0��Ȼ�����
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
					
		             
				
			
				
		


	
		
	
