package 图书管理系统;
//技术：1.用户输入语句： Scanner s = new Scanner(System.in); 
import java.util.Scanner;

public class LibararyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******************************");
		System.out.println("*                            *");
		System.out.println("*          周杰伦图书馆                               *");
		System.out.println("*                            *");
		System.out.println("******************************");
		System.out.println("*注册（A）登陆 （B）管理员（C） 退出 （Q） *");
		boolean flag = true;
		while(flag){
			System.out.println("请选择功能:");
			Scanner s = new Scanner(System.in);
			String option = s.nextLine();
			if("a".equalsIgnoreCase(option)){
				UserRegister.reg();
			}else if("b".equalsIgnoreCase(option)){
				
			}else if("c".equalsIgnoreCase(option)){
				
			}else if("q".equalsIgnoreCase(option)){
				System.exit(0);//退出程序
			}else{
				System.out.println("输入错误！！！请重新输入:");
			}
		}
		

	}

}
