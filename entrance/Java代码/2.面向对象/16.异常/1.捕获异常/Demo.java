class Demo
{
	public static void main(String[] args)
	{
		int[] arr = null;
		div(4,2,arr);
	}

	public static void div(int a, int b,int[] arr)
	{
		int c = 0;
		
		try{
			 c = a/b;
			 System.out.println("数组的长度："+arr.length);
		}
		catch(ArithmeticException e){
			System.out.println("toString:"+e.toString());
		}catch(NullPointerException e){
			System.out.println("出现了空语句异常...");
		}
		catch(Exception e){
			System.out.println("我是急症室，包治百病！！！");
		}
		
		System.out.println("c = "+c);
	}
}