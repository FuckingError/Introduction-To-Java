import java.util.*;
class User
{
	String name;
	String password;
}


class Demo
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入您想使用的功能,注册（A），查看用户（B），退出系统（Q）:");
		String option = scanner.next();
	      
			if(option.equals("A"))
				{
				int count = 0; 
				User[] users = new User[10];
		
					User a = new User();
			        

				    System.out.println("请输入用户名：");
			        a.name = scanner.next();
			
		     	    System.out.println("请输入密码：");
			        a.password = scanner.next();

					users[count++] = a;
					
					System.out.println(Arr);
		       }
	}
}