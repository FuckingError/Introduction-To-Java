package cn.itcast.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*��������  
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
		map.put("����", "������");
		map.put("����", "�����P");
		map.put("����","�ַｿ");
		
		//map�����б�����ʽһ ��ʹ��keySet�������б��� ��map�е����м�ֵ���浽Set��
		Set<String> keys = map.keySet();  
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println("��ֵ1��"+key+" ֵ��"+map.get(key));
		}
		
		//������ʽ��:ʹ��values�������б���  
		Collection<String> c = map.values(); 
		Iterator<String> it2= c.iterator();
		while(it2.hasNext()){
			System.out.println("ֵ2��"+it2.next());
		}
		
		//������ʽ����ʹ��entrySet()
		Set<Map.Entry<String,String>> entrys = map.entrySet();
		Iterator<Map.Entry<String,String>> it3 = entrys.iterator();
		while(it3.hasNext()){
			Map.Entry<String,String> entry = it3.next();
			System.out.println("��ֵ3:"+entry.getKey()+" ֵ:"+entry.getValue());
		}
		
		

	}

}
