package cn.itcast.file;
//File��ĳ�����������
import java.io.File;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file = new File("F:\\a.txt");
		//�����ļ�
	    System.out.println("�����ɹ���ô��"+file.createNewFile());
        
	    //���������ļ���
	    /*
	    File dir = new File("F:\\a");
	    System.out.println("�����ɹ���ô��"+dir.mkdir());//mkdir����һ���������ļ���
	    */
	    //�����༶�ļ���
	    /*
	    File dir1 = new File("F:\\aaa\\bb");
	    System.out.println("�����ɹ���ô��"+dir1.mkdirs());
	    */
	       
	    //renameTo �������ļ��к��ļ�       ���Ŀ���ļ���Դ�ļ�����ͬһ��·���£���ôrenameTo������
	    /*
	    File newFile = new File("F:/aaaa.txt");
	    System.out.println("�������ɹ���ô��"+file.renameTo(newFile));
	    /*
	             ������������༶�ļ���������ļ��У���ע��·��
	    File newFile1 = new File("F:\\aaa\\c.txt");
	    System.out.println("�������ɹ���ô��"+dir1.renameTo(newFile1));
	    
	    */
	    //���Ŀ���ļ���Դ�ļ��ڲ�ͬ·���£�����  ���ܲ����ļ���
	    File newFile1 = new File("E:\\c.txt");
	    System.out.println("���гɹ���ô��"+file.renameTo(newFile1));
	    
	}

}
