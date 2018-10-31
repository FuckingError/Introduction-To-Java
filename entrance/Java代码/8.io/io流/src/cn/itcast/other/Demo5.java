package cn.itcast.other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/*Properties(�����ļ���)�����������ļ����ȡ�ļ�����Ϣ
 * ������ǿ��ת�� ��Stringת����int   ʹ�� Integer.parseInt(String) 
 *                   
 * 
 * ע�⣺��������Ϣ�������ַ�ʱ���������ַ���д�Ͷ�
 * 
 * �ܽ᣺
 * ��������ѡ��properties.setProperty(�ַ��� ,�ַ���) �����ҪдInt�Ϳ�����Int����ӡ������ַ���       ��     properties.store(file)
 * ��ȡ����ѡ��properties.load(file)
 *     
 * */
public class Demo5 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		//creatP();
		
		//readP();
		
		test();
		}
	
	
	//��ȡ������Ϣ
	public static void readP() throws IOException, FileNotFoundException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("F:\\persons"));
		Set<Entry<Object,Object>> entrys = properties.entrySet();
		for(Entry entry : entrys){
			System.out.println("����"+entry.getKey() + " ֵ��"+entry.getValue());
		}
	}
//����������Ϣ
	public static void creatP() throws IOException, FileNotFoundException {
		Properties properties  = new Properties();
		properties.setProperty("gouwa", "123");
		properties.setProperty("gousheng", "234");
		properties.setProperty("tiedan", "345");
		/*
		Set<Entry<Object,Object>> entrys = properties.entrySet();
		for(Entry<Object,Object> entry : entrys ){
			System.out.println("����"+entry.getKey()+" ֵ��"+entry.getValue());
		}*/
		
		//ʹ��Properties ���������ļ�
		properties.store(new FileOutputStream("F:\\persons"), "inf");//�ڶ����ַ���Ϊ������Ϣ
	}
	
	//��ϰ����ʹ���������ʱ��֪ͨ�����Ѿ��������빺���������
     public static void test() throws IOException{
    	 File file = new File("F:\\QQ.properties");
    	 if(!file.exists()){
    		 file.createNewFile();
    	 }
    	 
    	 Properties properties = new Properties();
         properties.load(new FileInputStream(file));
         
         int count = 0;
         String value = properties.getProperty("count");
         if(value!=null){
        	 count = Integer.parseInt(value);
        }
         
         if(count >= 3){
        	 System.out.println("����ʹ�ñ�������Σ��빺���������");
        	 System.exit(0);
         }
         
         count++;
         System.out.println("����ʹ�ñ����"+count+"��");
         
         properties.setProperty("count", count+"");
         properties.store(new FileOutputStream(file), "rumtime");
        }
     }


