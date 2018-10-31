package cn.itcast.other;
//���������  �������ʵ��Serializable
//serialVersionUID ���ڼ�¼class�ļ��İ汾��Ϣ��  ���� ��Ա ���� ������ ������ɵ�
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//ObjectOutPutStream
class User implements Serializable {
	//serialVersionUID ����Ϊ��ֵ
	private static final long serialVersionUID = 1L;
	
	String userName;
	String passWord;
	public User(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�û�����"+userName+" ���룺"+passWord;
	}
}

public class Demo4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("F://obj.txt");
		// TODO Auto-generated method stub
		write(file);
		read(file);
	}

	public static void read(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fileInputStream  = new FileInputStream(file);
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		User user = null;
		user = (User) inputStream.readObject();
		System.out.println(user);
		inputStream.close();
	}

	public static void write(File file) throws FileNotFoundException, IOException {
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		User user = new User("jay","123");
		objectOutputStream.writeObject(user);
		fileOutputStream.close();
	}

}
