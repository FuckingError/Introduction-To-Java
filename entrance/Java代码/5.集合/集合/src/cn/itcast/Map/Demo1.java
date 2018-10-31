package cn.itcast.Map;

import java.util.HashMap;
import java.util.Map;

/*双列集合及其方法
 * Map:
 *     1.HashMap  键不可重复，值可以重复
 *     2.TreeMap
 *     3.HashTable
 * */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("刘建", "顾玲云");
		map.put("王贵川", "张桂华");
		map.put("周杰伦", "昆凌");
		map.put("刘清", "薛钰婷");
		
		System.out.println("通过键值得到值："+map.get("刘清"));
		//System.out.println("返回值："+map.put("刘清", "钰婷"));
		
		/*添加整个集合
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("1", "10");
		map2.put("2", "20");
		 map.putAll(map2);
		 */
		
		/*根据键值删除值
		System.out.println("删除的数据为："map.remove("刘清"));
		*/
		
		/*删除所有元素
		 * map.clear();
		 * */
		System.out.println("map中成对元素的个数："+map.size());
		
		System.out.println("map集合中是否包含该键值："+map.containsKey("刘清"));
		System.out.println("map集合中是否包含该值："+map.containsValue("薛钰婷"));
		System.out.println("map是否为空："+map.isEmpty());
	}

}
