package cn.itcast.charIO;
//�����ַ���ģ���û���½
//���ܣ� ���ַ����л��� ֱ��д"\r\n"
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
			System.out.println("��ѡ���ܣ� [a] ע�� [b] ��½ [c] �˳�");
		    Scanner scanner = new Scanner(System.in);
		    String option = scanner.next();
			if("a".equalsIgnoreCase(option)){
				reg(scanner);
			}else if("b".equalsIgnoreCase(option)){
				landing(scanner);
			}else if("c".equalsIgnoreCase(option)){
				System.exit(0);
			}else{
				System.out.println("�����������������:");
			}
		}

	}

	public static void landing(Scanner scanner) throws FileNotFoundException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("F:/a.txt")));
		String line = null;
		System.out.println("�������û�����");
		String name = scanner.next();
		System.out.println("���������룺");
		String passWord = scanner.next();
		String inf = name+" "+passWord;
		boolean flag = true;
		while((line = bufferedReader.readLine()) != null){
			if(inf.equals(line)){
				System.out.println(name+"��½�ɹ���");
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("������û���������");
		}
	}

	public static void reg(Scanner scanner) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("F:/a.txt"),true));//�������Ҫдtrue
		System.out.println("�������û�����");
		String name = scanner.next();
		System.out.println("���������룺");
		String passWord = scanner.next();
		String line = name + " " + passWord;
		bufferedWriter.write(line+"\r\n");
		//bufferedWriter.write("\r\n");
		bufferedWriter.close();
	}

}
