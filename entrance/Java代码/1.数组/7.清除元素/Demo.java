import java.util.*;

class Demo
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,2,3,4};
		int count = 0;

		for(int i = 0;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
						break;     
				}
			}
		}
		

		int[] arr1 = new int[arr.length-count];//3

        int k = 0;
		

		for(int i = 0;i<arr.length;i++)
		{
			boolean flag = false;//旗帜的位置是在循环外还是循环内要想明白
			
			for(int j = 0;j<k;j++)
			{
				if(arr[i] == arr[j])
				{
					flag = true;
					break;
				}
			}

			if(flag == false)
			{
			  arr1[k] = arr[i];
			  System.out.println(k);
			  ++k;        
			}
		}

		System.out.println(Arrays.toString(arr1));
	}
}