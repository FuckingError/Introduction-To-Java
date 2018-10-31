package cn.itcast.other;
//�и�ϲ�
//
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

class MyFilter1 implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(".mp3");
	}
	
}

public class Demo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File file = new File("C:\\Users\\�ܽ���\\Music\\zs.mp3");
	    //diverse(file);
	    
	    make();
	    
	}

	public static void make() throws FileNotFoundException, IOException {
		
	    File dir = new File("F:\\");
	    //ɸѡ��mp3�ļ�
	    File[] files = dir.listFiles(new MyFilter1());
	  
	    //����Vector�ĵ�����
	    Vector<FileInputStream> vector = new Vector<FileInputStream>();
	    	//���ļ��洢��vector������
	    for(File file1 : files){
	    	vector.add(new FileInputStream(file1));
	    }
	    //ͨ��vector��ȡ������
	    Enumeration<FileInputStream> e = vector.elements();
	    //����������
	    SequenceInputStream inputStream = new SequenceInputStream(e);
	    //�������ͨ��
	    FileOutputStream fileOutputStream = new FileOutputStream(new File("F:\\se.mp3"));
	    byte[] buf = new byte[1024*1024];
	    int length = 0;
	    while((length = inputStream.read(buf)) != -1){
	    	fileOutputStream.write(buf, 0, length);
	    }
	    fileOutputStream.close();
	    inputStream.close();
	}

	public static void diverse(File file) throws FileNotFoundException, IOException {
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] buf = new byte[1024*1024];
		int length = 0;
		for(int i = 0;(length = fileInputStream.read(buf)) != -1;i++){
			FileOutputStream fileOutputStream  = new FileOutputStream(new File("F:\\","part"+i+".mp3"));
			fileOutputStream.write(buf, 0, length);
			fileOutputStream.close();
		}
		fileInputStream.close();
	}
}
