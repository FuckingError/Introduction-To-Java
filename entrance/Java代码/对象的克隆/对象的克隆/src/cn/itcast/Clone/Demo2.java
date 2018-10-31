package cn.itcast.Clone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*时间：2017年9月6日18:54:49
 * 深克隆：利用对象输出输入流 先将对象写入到文件中，再读取到程序中
 * 注意：需要被克隆的对象要实现Serializable
 * */
public class Demo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Address address = new Address("靖江");
		Person person1 = new Person("刘清", 20, address);
		writeObj(person1);
		Person person2 = readObj();
		person2.address.address = "常熟";
		System.out.println("p1:"+person1);
		System.out.println("p2:"+person2);
		

	}
	//对象写到文件中
	public static void writeObj(Person person) throws IOException{
		//建立文件输出流
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\test.txt");
		//建立对象输出流
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		//输出person对象
		objectOutputStream.writeObject(person);
		//关闭资源
		objectOutputStream.close();
	}
	
	//对象读取到程序中
	public static Person readObj() throws IOException, ClassNotFoundException{
		FileInputStream fileInputStream = new FileInputStream("F:\\test.txt");
		ObjectInputStream objectinputStream = new ObjectInputStream(fileInputStream);
		return (Person)objectinputStream.readObject();
	}

}
