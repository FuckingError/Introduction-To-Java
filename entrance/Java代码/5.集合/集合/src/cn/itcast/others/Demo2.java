package cn.itcast.others;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//map ������ǿforѭ����ʹ��
//mapû�г����ӿڣ������޷�ֱ��ʹ����ǿforѭ��
public class Demo2 {
	public static void main(String[] args){
	HashMap<String,String> map = new HashMap<String,String>();
	map.put("1","�ܽ���");
	map.put("2","����");
	map.put("3","Ѧ����");
	map.put("4","����");
	
	Set<Map.Entry<String,String>> entrys = map.entrySet();
	for(Map.Entry<String,String> entry:entrys){
		System.out.println("����"+entry.getKey()+" ֵ��"+entry.getValue());
		}
	}
}
