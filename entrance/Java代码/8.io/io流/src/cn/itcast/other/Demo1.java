package cn.itcast.other;
/*
 *ͨ���̳���ǿBufferedReader�Ĺ���
 * */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*����д�����ʱ���������ִ���
 * ��һ���Ƕ�ε��÷�����������ȥ��һ������ȡ���ո÷����ķ���ֵ
 * �ڶ����ǲ�ע��line��ǰ��˳�򣬵�line= count+" "+line ����if���ǰ��ʱ,line��Զ������Ϊ��
 * */
class BufferedLineNum extends BufferedReader{

	public BufferedLineNum(Reader in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

	int count = 1;
	@Override
	public String readLine() throws IOException {
		// TODO Auto-generated method stub
		String line = super.readLine();
	
		if(line==null){
			return null;
		}	
		line = count+" "+line;
		count++;
		return line;
	}
	
	
	
}

public class Demo1 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedLineNum bufferedLineNum = new BufferedLineNum(new FileReader(new File("E:\\JAVA��ѧ\\Java����\\8.io\\io��\\src\\cn\\itcast\\input\\Demo2.java")));
		String line = null;
		while((line = bufferedLineNum.readLine())!=null){
			System.out.println(line);
		}
		bufferedLineNum.close();
       
	}

}
