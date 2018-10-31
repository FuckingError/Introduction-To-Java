package cn.itcast.Map;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;


/*TreeMap ���ϣֵ�޹أ���Ҫ��дHashCode() 
 * ��Comparable����ֵΪ0ʱ����ֵ��ͬ���¼��洢��ֵ���滻��ֵ
 * 
 * 
 * ˼�룺1.try catch �ڲ���Ҫ�������������߶���
 * 
 * ������1.�����Ҫ�Ƚϵ����ַ�����  o.birth.compareTo(this.birth)
 *     2.�ַ���ת�������ڣ�SimpleDateFormat dateFormat = new SimpleDateFormat(yyyy-MM-dd);
 *                   Date date1 = dateFormat(�ַ���);
 *     3.�������Comparable�ӿ�ʵ�ֵ��� ����compareTo����  �磺Date String
 *                   
 * */

class Book implements Comparable<Book>{
	String name;
	String date;
	
	public Book(String name,String birth){
		this.name = name;
		this.date = birth;
	}

	/*
	 * ����һ
	 * @Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.birth.compareTo(o.birth);
	}
*/
	
	
	//������
	@Override
    public int compareTo(Book o) {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 Date date1 = null;
		 Date date2 = null;
		try {
			date1  = dateFormat.parse(this.date);
			date2 = dateFormat.parse(o.date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date1.compareTo(date2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[������"+this.name+" ��������:"+this.date+"]";
	}
	
	
	
}

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Book,String> tree = new TreeMap<Book,String>(); 
		tree.put(new Book("���ձȺ���","1998-07-10"), "���ձȺ���");
		tree.put(new Book("���μ�","1978-07-10"), "���μ�");
		tree.put(new Book("����������","1756-07-10"), "����������");
		tree.put(new Book("����Ͱ�","1998-07-1"), "����Ͱ�");
		
		System.out.println(tree);
	}

}
