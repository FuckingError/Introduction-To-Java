package cn.itcast.other;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
 * Calendar类
 * Date类
 * SimpleDateFormat类 日期格式化类
 * */
public class Demo3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// Date date = new Date();

//		Calendar calendar = Calendar.getInstance();//
//		System.out.println("年："+calendar.get(Calendar.YEAR));
//		System.out.println("月："+(calendar.get(Calendar.MONTH)+1));
//		System.out.println("日："+calendar.get(Calendar.DATE));
//		
//		System.out.println("时："+calendar.get(Calendar.HOUR_OF_DAY));
//		System.out.println("分："+calendar.get(Calendar.MINUTE));
//		System.out.println("秒："+calendar.get(Calendar.SECOND));
		
		//日期格式化类
		/*SimpleDateFormat
		 * format() 可以把日期转换成字符串
		 * parse() 可以把字符串转换成日期
		 * */
		
		Date date = new Date();//获得系统时间
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd天HH:mm:ss");
	
		
        date = dateFormat.parse("1998年07月10天03:41:04");
        //String time = dateFormat.format(date);
		System.out.println(date);//date对象可以直接输出   但是如果想以自己的格式输出的话，使用SimpleDateFormat类的format方法转化为字符串的形式
		
	}

}
