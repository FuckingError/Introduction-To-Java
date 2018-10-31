package cn.itcast.set;
/**ģ��ע�� �˺�ΪString ����ΪString
 * ʹ��hashSet ����
 * 
 * ˼�룺1.�ַ������Ի�ȡ��ϣֵ
 *     2.hashSet���ϵ�add��������ֵΪboolean����
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
		return "{�˺ţ�"+name+" ���룺"+passWord+"}";
	}
}


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("����������ע����˺ţ�");
			String name = scanner.next();
			System.out.println("���������룺");
			String passWord = scanner.next();
			if (set.add(new User(name, passWord)) == false) {
				System.out.println("����ע����˺��Ѿ�ע�ᣬ������ע��");
			} else {
				System.out.println("ע��ɹ�!!!");
				System.out.println(set);
			}

		}

	}

}
