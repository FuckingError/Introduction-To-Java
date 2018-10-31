package cn.itcast.others;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//map 里面增强for循环的使用
//map没有超级接口，所以无法直接使用增强for循环
public class Demo2 {
	public static void main(String[] args){
	HashMap<String,String> map = new HashMap<String,String>();
	map.put("1","周杰伦");
	map.put("2","刘清");
	map.put("3","薛钰婷");
	map.put("4","柯南");
	
	Set<Map.Entry<String,String>> entrys = map.entrySet();
	for(Map.Entry<String,String> entry:entrys){
		System.out.println("键："+entry.getKey()+" 值："+entry.getValue());
		}
	}
}
