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
			 System.out.println("����ĳ��ȣ�"+arr.length);
		}
		catch(ArithmeticException e){
			System.out.println("toString:"+e.toString());
		}catch(NullPointerException e){
			System.out.println("�����˿�����쳣...");
		}
		catch(Exception e){
			System.out.println("���Ǽ�֢�ң����ΰٲ�������");
		}
		
		System.out.println("c = "+c);
	}
}