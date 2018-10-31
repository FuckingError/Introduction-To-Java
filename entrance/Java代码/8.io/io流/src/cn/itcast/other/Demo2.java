package cn.itcast.other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 装饰者设计模式
 * */
class BufferedReaderNum extends BufferedReader{
	BufferedReader bufferedReader;
	int count = 1;
	
	public BufferedReaderNum(BufferedReader bufferedReader){
		super(bufferedReader);//无作用，只是为了让他不报错 当继承的是BufferedReader 它没有无参构造方法
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
		
		//序号
	/*	BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("E:\\JAVA自学\\Java代码\\8.io\\io流\\src\\cn\\itcast\\input\\Demo2.java")));
		BufferedReaderNum bufferedReaderNum = new BufferedReaderNum(bufferedReader);
	    String line = null;
	    while((line = bufferedReaderNum.readLine())!=null){
	    	System.out.println(line);
	    }
	    bufferedReader.close();*/
		
		/*
		 *分号 
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("E:\\JAVA自学\\Java代码\\8.io\\io流\\src\\cn\\itcast\\input\\Demo2.java")));
		BufferedReaderSie bufferedReaderSie = new BufferedReaderSie(bufferedReader);
		String line = null;
		while((line = bufferedReaderSie.readLine())!=null){
			System.out.println(line);
		}
		bufferedReader.close();*/
		
		//序号加分号加引号
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("E:\\JAVA自学\\Java代码\\8.io\\io流\\src\\cn\\itcast\\input\\Demo2.java")));
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
