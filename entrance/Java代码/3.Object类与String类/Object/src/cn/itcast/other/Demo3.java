package cn.itcast.other;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
 * Calendar��
 * Date��
 * SimpleDateFormat�� ���ڸ�ʽ����
 * */
public class Demo3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// Date date = new Date();

//		Calendar calendar = Calendar.getInstance();//
//		System.out.println("�꣺"+calendar.get(Calendar.YEAR));
//		System.out.println("�£�"+(calendar.get(Calendar.MONTH)+1));
//		System.out.println("�գ�"+calendar.get(Calendar.DATE));
//		
//		System.out.println("ʱ��"+calendar.get(Calendar.HOUR_OF_DAY));
//		System.out.println("�֣�"+calendar.get(Calendar.MINUTE));
//		System.out.println("�룺"+calendar.get(Calendar.SECOND));
		
		//���ڸ�ʽ����
		/*SimpleDateFormat
		 * format() ���԰�����ת�����ַ���
		 * parse() ���԰��ַ���ת��������
		 * */
		
		Date date = new Date();//���ϵͳʱ��
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy��MM��dd��HH:mm:ss");
	
		
        date = dateFormat.parse("1998��07��10��03:41:04");
        //String time = dateFormat.format(date);
		System.out.println(date);//date�������ֱ�����   ������������Լ��ĸ�ʽ����Ļ���ʹ��SimpleDateFormat���format����ת��Ϊ�ַ�������ʽ
		
	}

}
