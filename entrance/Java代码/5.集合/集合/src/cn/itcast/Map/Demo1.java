package cn.itcast.Map;

import java.util.HashMap;
import java.util.Map;

/*˫�м��ϼ��䷽��
 * Map:
 *     1.HashMap  �������ظ���ֵ�����ظ�
 *     2.TreeMap
 *     3.HashTable
 * */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("����", "������");
		map.put("����", "�Ź�");
		map.put("�ܽ���", "����");
		map.put("����", "Ѧ����");
		
		System.out.println("ͨ����ֵ�õ�ֵ��"+map.get("����"));
		//System.out.println("����ֵ��"+map.put("����", "����"));
		
		/*�����������
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("1", "10");
		map2.put("2", "20");
		 map.putAll(map2);
		 */
		
		/*���ݼ�ֵɾ��ֵ
		System.out.println("ɾ��������Ϊ��"map.remove("����"));
		*/
		
		/*ɾ������Ԫ��
		 * map.clear();
		 * */
		System.out.println("map�гɶ�Ԫ�صĸ�����"+map.size());
		
		System.out.println("map�������Ƿ�����ü�ֵ��"+map.containsKey("����"));
		System.out.println("map�������Ƿ������ֵ��"+map.containsValue("Ѧ����"));
		System.out.println("map�Ƿ�Ϊ�գ�"+map.isEmpty());
	}

}
