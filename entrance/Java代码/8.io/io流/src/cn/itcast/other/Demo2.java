package cn.itcast.other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * װ�������ģʽ
 * */
class BufferedReaderNum extends BufferedReader{
	BufferedReader bufferedReader;
	int count = 1;
	
	public BufferedReaderNum(BufferedReader bufferedReader){
		super(bufferedReader);//�����ã�ֻ��Ϊ������������ ���̳е���BufferedReader ��û���޲ι��췽��
		this.bufferedReader = bufferedReader;
	}
	
	public String readLine() throws IOException{
		String line = bufferedReader.readLine();
		if(line==null){
			return null;
		}
		line = count+" "+line;
		count++;
		return line;
	}
}

class BufferedReaderSie extends BufferedReader{
	BufferedReader bufferedReader;

	public BufferedReaderSie(BufferedReader bufferedReader) {
		super(bufferedReader);
		this.bufferedReader = bufferedReader;
	}
	
	public String readLine() throws IOException{
		String line = bufferedReader.readLine();
		if(line == null){
			return null;
		}
		line = line +";";
		return line;
	}
}

class BufferedReaderY extends BufferedReader{
	BufferedReader bufferedReader;

	public BufferedReaderY(BufferedReader bufferedReader) {
		super(bufferedReader);
		this.bufferedReader = bufferedReader;
	}
	
	public String readLine() throws IOException{
		String line = bufferedReader.readLine();
		if(line == null){
			return null;
		}
		line = "\""+line + "\"";
		return line;
		
	}
}
/*
class BufferedReaderNumSie{
	BufferedReader bufferedReader;

	public BufferedReaderNumSie(BufferedReader bufferedReader) {
		super();
		this.bufferedReader = bufferedReader;
	}
	
	public String readLine() throws IOException{
		String line = bufferedReader.readLine();
		if(line == null){
			return null;
		}
		line = line+";";
		return line;
	}
}*/


public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//���
	/*	BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("E:\\JAVA��ѧ\\Java����\\8.io\\io��\\src\\cn\\itcast\\input\\Demo2.java")));
		BufferedReaderNum bufferedReaderNum = new BufferedReaderNum(bufferedReader);
	    String line = null;
	    while((line = bufferedReaderNum.readLine())!=null){
	    	System.out.println(line);
	    }
	    bufferedReader.close();*/
		
		/*
		 *�ֺ� 
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("E:\\JAVA��ѧ\\Java����\\8.io\\io��\\src\\cn\\itcast\\input\\Demo2.java")));
		BufferedReaderSie bufferedReaderSie = new BufferedReaderSie(bufferedReader);
		String line = null;
		while((line = bufferedReaderSie.readLine())!=null){
			System.out.println(line);
		}
		bufferedReader.close();*/
		
		//��żӷֺż�����
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("E:\\JAVA��ѧ\\Java����\\8.io\\io��\\src\\cn\\itcast\\input\\Demo2.java")));
		BufferedReaderNum bufferedReaderNum = new BufferedReaderNum(bufferedReader);
		BufferedReaderSie bufferedReaderSie = new BufferedReaderSie(bufferedReaderNum);
		BufferedReaderY bufferedReaderY = new BufferedReaderY(bufferedReaderSie);
		String line = null;
	    while((line = bufferedReaderY.readLine()) != null){
	    	System.out.println(line);
	    }
	    bufferedReaderY.close();
		

	}

}
