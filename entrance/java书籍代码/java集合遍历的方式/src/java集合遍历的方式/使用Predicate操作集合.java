package java集合遍历的方式;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;
/*Predicate应用场景：面对集合元素, 当同一种操作可以在满足不同条件的元素中反复使用
 *格式:当定义一个对集合元素进行操作的方法时，在参数最后添加Predicate p
 *    foreach遍历，if(p.test(obj))
 *  
*/
public class 使用Predicate操作集合 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("周杰伦");
		books.add("刘清");
		books.add("薛钰婷");
		/*
		books.removeIf(ele -> ((String)ele).equals("薛钰婷"));
		System.out.println(books);*/
		
		System.out.println(calAll(books,ele->ele.equals("周杰伦")));
		System.out.println(calAll(books,ele->ele.equals("刘清")));
		System.out.println(calAll(books,ele->ele.equals("薛钰婷")));

	}
	public static int calAll(Collection books,Predicate p)
	{
		int total = 0;
		//foreach遍历集合元素
		for(Object obj : books)
		{
			if(p.test(obj))//如果obj满足p
			{
				total++;
			}
	    }
		return total;
	}

}
