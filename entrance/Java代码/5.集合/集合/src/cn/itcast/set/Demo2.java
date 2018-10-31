package cn.itcast.set;
/**模拟注册 账号为String 密码为String
 * 使用hashSet 集合
 * 
 * 思想：1.字符串可以获取哈希值
 *     2.hashSet集合的add方法返回值为boolean类型
 */

import java.util.HashSet;
import java.util.Scanner;

class User{
	String name;
	String passWord;
	
	public User (String name,String passWord){
		this.name = name;
		this.passWord = passWord;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		User user = (User)obj;
		return this.name.equals(user.name);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{账号："+name+" 密码："+passWord+"}";
	}
}


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请输入您想注册的账号：");
			String name = scanner.next();
			System.out.println("请输入密码：");
			String passWord = scanner.next();
			if (set.add(new User(name, passWord)) == false) {
				System.out.println("您所注册的账号已经注册，请重新注册");
			} else {
				System.out.println("注册成功!!!");
				System.out.println(set);
			}

		}

	}

}
