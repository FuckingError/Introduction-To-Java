package cn.itcast.Map;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;


/*TreeMap 与哈希值无关，不要重写HashCode() 
 * 当Comparable返回值为0时，键值相同，新键存储的值会替换旧值
 * 
 * 
 * 思想：1.try catch 内部不要定义变量，在外边定义
 * 
 * 技术：1.如果需要比较的是字符串：  o.birth.compareTo(this.birth)
 *     2.字符串转换成日期：SimpleDateFormat dateFormat = new SimpleDateFormat(yyyy-MM-dd);
 *                   Date date1 = dateFormat(字符串);
 *     3.灵活运用Comparable接口实现的类 调用compareTo方法  如：Date String
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
	 * 方法一
	 * @Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.birth.compareTo(o.birth);
	}
*/
	
	
	//方法二
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
		return "[书名："+this.name+" 出版日期:"+this.date+"]";
	}
	
	
	
}

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Book,String> tree = new TreeMap<Book,String>(); 
		tree.put(new Book("加勒比海盗","1998-07-10"), "加勒比海盗");
		tree.put(new Book("西游记","1978-07-10"), "西游记");
		tree.put(new Book("海底两万里","1756-07-10"), "海底两万里");
		tree.put(new Book("阿里巴巴","1998-07-1"), "阿里巴巴");
		
		System.out.println(tree);
	}

}
