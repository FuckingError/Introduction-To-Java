
class Demo
{
	public static void main(String[] args) throws Exception,NullPointerException
	{
		try{
		int[] arr = null;
		
		div(2,0,arr);
		
		}catch(NullPointerException e){
			System.out.println("�����˵ڶ����쳣������");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("�������쳣������");
			e.printStackTrace();
		}
		
	}

	public static void div(int a,int b,int[] arr) throws Exception,NullPointerException{
		if(b == 0){
			throw new Exception();
		}
		if(arr == null){
			throw new NullPointerException();
		  }   
	
		int c = a/b;
	    System.out.println("c = "+c);
	   }
}