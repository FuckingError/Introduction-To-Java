package cn.itcast.file;
//ɾ���ķ���
//�жϵķ���
/*isFile
 * isDirectory �Ƿ���һ��Ŀ¼
 * isHidden
 * isAbsolute
 * */
import java.io.File;
import java.io.IOException;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("F:\\a.txt");
		//file.createNewFile();
		System.out.println(file.exists());
		System.out.println("�ж��Ƿ�Ϊ�����ļ���"+file.isHidden());
	}

}
