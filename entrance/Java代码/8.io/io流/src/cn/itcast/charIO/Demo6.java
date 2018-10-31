package cn.itcast.charIO;
//缓冲字符流模拟用户登陆
//技能： 在字符串中换行 直接写"\r\n"
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("请选择功能： [a] 注册 [b] 登陆 [c] 退出");
		    Scanner scanner = new Scanner(System.in);
		    String option = scanner.next();
			if("a".equalsIgnoreCase(option)){
				reg(scanner);
			}else if("b".equalsIgnoreCase(option)){
				landing(scanner);
			}else if("c".equalsIgnoreCase(option)){
				System.exit(0);
			}else{
				System.out.println("输入错误，请重新输入:");
			}
		}

	}

	public static void landing(Scanner scanner) throws FileNotFoundException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("F:/a.txt")));
		String line = null;
		System.out.println("请输入用户名：");
		String name = scanner.next();
		System.out.println("请输入密码：");
		String passWord = scanner.next();
		String inf = name+" "+passWord;
		boolean flag = true;
		while((line = bufferedReader.readLine()) != null){
			if(inf.equals(line)){
				System.out.println(name+"登陆成功！");
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("输入的用户名不存在");
		}
	}

	public static void reg(Scanner scanner) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("F:/a.txt"),true));//这里出错，要写true
		System.out.println("请输入用户名：");
		String name = scanner.next();
		System.out.println("请输入密码：");
		String passWord = scanner.next();
		String line = name + " " + passWord;
		bufferedWriter.write(line+"\r\n");
		//bufferedWriter.write("\r\n");
		bufferedWriter.close();
	}

}
