package java集合遍历的方式;
//使用iterator的forEachRemaining方法主要还是遍历输出集合元素,在语句中不会添加别的变量
              //内部间接调用了it.next()
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class 使用Lambada表达式遍历Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("周杰伦");
		books.add("刘清");
		books.add("薛钰婷");
		
		Iterator it = books.iterator();
		it.forEachRemaining(obj -> System.out.print(obj));
		}
	}
