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

/*Properties(配置文件类)：生产配置文件与读取文件的信息
 * 技术：强制转换 将String转换成int   使用 Integer.parseInt(String) 
 *                   
 * 
 * 注意：当配置信息含中文字符时，必须用字符流写和读
 * 
 * 总结：
 * 保存配置选择properties.setProperty(字符串 ,字符串) 如果需要写Int型可以在Int后面加“”空字符串       和     properties.store(file)
 * 读取配置选择properties.load(file)
 *     
 * */
public class Demo5 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		//creatP();
		
		//readP();
		
		test();
		}
	
	
	//读取配置信息
	public static void readP() throws IOException, FileNotFoundException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("F:\\persons"));
		Set<Entry<Object,Object>> entrys = properties.entrySet();
		for(Entry entry : entrys){
			System.out.println("键："+entry.getKey() + " 值："+entry.getValue());
		}
	}
//保存配置信息
	public static void creatP() throws IOException, FileNotFoundException {
		Properties properties  = new Properties();
		properties.setProperty("gouwa", "123");
		properties.setProperty("gousheng", "234");
		properties.setProperty("tiedan", "345");
		/*
		Set<Entry<Object,Object>> entrys = properties.entrySet();
		for(Entry<Object,Object> entry : entrys ){
			System.out.println("键："+entry.getKey()+" 值："+entry.getValue());
		}*/
		
		//使用Properties 生产配置文件
		properties.store(new FileOutputStream("F:\\persons"), "inf");//第二个字符串为配置信息
	}
	
	//练习：当使用软件三次时，通知试用已经结束，请购买正版软件
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
        	 System.out.println("你已使用本软件三次，请购买正版软件");
        	 System.exit(0);
         }
         
         count++;
         System.out.println("你已使用本软件"+count+"次");
         
         properties.setProperty("count", count+"");
         properties.store(new FileOutputStream(file), "rumtime");
        }
     }


