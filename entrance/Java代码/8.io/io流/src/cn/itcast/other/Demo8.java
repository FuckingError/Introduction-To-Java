package cn.itcast.other;

import java.io.File;
import java.io.IOException;
//ʱ�䣺2017��6��3��20:17:58
/*�ݹ�
 * �ܽ᣺д�ݹ����򵥵�������ʼ��
 *     д����ʱ�������һ������������
 *     �����е��βη�Ϊ���֣�һ������Ҫ���õ����ݣ���һ���ǵݹ��б仯������������ڷ������ٴε��ø÷���ʱҪ���β�����ӱ仯�ķ�ʽ
 *     
 *     
 * */
public class Demo8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.out.println("����ǣ�"+test(5));
		//listFile(new File("E:\\JAVA��ѧ\\Java����\\8.io\\io��"),"|--");
		//deleteFile(new File("F:/a"));
		moveFile(new File("F:/a"),new File("E:/"));
		//test2();
	}
	
	//ʵ��5�Ľ׳�
	public static int test(int number){
		if(number == 1){
			return 1;
		}else{
			return number*test(--number);
		}
	}
	
	//�г�һ���ļ��е������ļ�Ŀ¼
	public static void listFile(File dir,String space){
		File[] files = dir.listFiles();
		for(File file : files){
			if(file.isFile()){
				System.out.println(space+file.getName());
			}else if(file.isDirectory()){
				System.out.println(space+file.getName());
				listFile(file,"|  "+space);
			}
		}
	}
	//ɾ��һ���ǿ��ļ���
	public static void deleteFile(File dir){
		File[] files = dir.listFiles();
		for(File file : files){
			if(file.isFile()){
				file.delete();
			}else if(file.isDirectory()){
				deleteFile(file);
			}
		}
		dir.delete();
	}

	//����file.toString�Ĵ�ӡ���  F:\a   file.getName ��ӡ���b
	public static void test2(){
		File file = new File("F:\\a\\b");
		System.out.println(file.toString());
	}
	
	
	//����һ���ǿ��ļ��� E:\a  E:\a\b
	//��һ���Ѷ������� ���Ǻ��ļ����й�  ��һ�����ļ��� toStirng�������ļ�����new File() Ҫ�õ��ļ�����ƥ��  
	//�Ժ��漰�ļ��е�String���͵Ĳ���������д"\\" "\\"
	//�ĵã�д����ʱ���������⻹�ǵö�ģ�������
	
	//�ڶ����� ԭ�ļ��л��� ��ɾȥ
	public static void moveFile(File dir,File dird) throws IOException{
		String arr = null;
		
		//�ļ��е�����
		if(dird.toString().endsWith("\\")){
			arr = dird.toString()+"\\"+dir.getName();
		}else{
			String str = dird.toString()+"\\"+dir.getName();
			arr = str.replace("\\", "\\"+"\\");
		}
		
		System.out.println(arr); 
		File dir3 = new File(arr);
		dir3.mkdir();
		
		File[] files = dir.listFiles();
		for(File file : files){
			if(file.isFile()){
				file.renameTo(new File(arr+"//"+file.getName()));
			}else if(file.isDirectory()){
				moveFile(file,dir3);
			}
		}
		//��Ϊԭ�ļ��л��ڣ����Ե�ɾ��	
		dir.delete();
	}
}
