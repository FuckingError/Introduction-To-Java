package cn.itcast.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*迭代方法  
 * keySet ()
 * values()
 * entrySet()
 * 
 * 
 * */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("汪峰", "章子怡");
		map.put("文章", "马伊琍");
		map.put("成龙","林凤娇");
		
		//map集合中遍历方式一 ：使用keySet方法进行遍历 把map中的所有键值保存到Set中
		Set<String> keys = map.keySet();  
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println("键值1："+key+" 值："+map.get(key));
		}
		
		//遍历方式二:使用values方法进行遍历  
		Collection<String> c = map.values(); 
		Iterator<String> it2= c.iterator();
		while(it2.hasNext()){
			System.out.println("值2："+it2.next());
		}
		
		//遍历方式三：使用entrySet()
		Set<Map.Entry<String,String>> entrys = map.entrySet();
		Iterator<Map.Entry<String,String>> it3 = entrys.iterator();
		while(it3.hasNext()){
			Map.Entry<String,String> entry = it3.next();
			System.out.println("键值3:"+entry.getKey()+" 值:"+entry.getValue());
		}
		
		

	}

}
