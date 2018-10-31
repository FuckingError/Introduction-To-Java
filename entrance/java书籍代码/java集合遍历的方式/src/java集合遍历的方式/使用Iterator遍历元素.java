package java集合遍历的方式;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
/*思想：1.Iterator迭代时是将集合元素的值传给迭代变量而不是集合元素本身,所以修改迭代变量的值对集合元素本身没有影响
 *    2.使用Iterator时，只能通过it.remove（）删除元素
 *技术:1.Iterator的方法:
 *                  it.hasNext()
 *                  it.next()
 *                  it.remove()
 *                  it.forEachRemaining() 
 * 
 * */


public class 使用Iterator遍历元素 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("周杰伦");
		books.add("刘清");
		books.add("薛钰婷");
		
		Iterator it = books.iterator();//注意Iterator添加的包
		while(it.hasNext()){
			String name = (String)it.next();
			System.out.println(name);
			if(name.equals("薛钰婷")){
				it.remove();	//删除上一个返回的值
			}
			name = "哈哈";
			}
		System.out.println(books);
		}
	}

