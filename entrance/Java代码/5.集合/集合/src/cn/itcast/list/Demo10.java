package cn.itcast.list;

import java.util.LinkedList;
/*ջ����Ҫʵ�ֶ�ջ���ݽṹ�Ĵ洢��ʽ
 *   �Ƚ����
 *   push() ��
 *   pop()  ð
 *   
 *���У��Ƚ��ȳ�
 *offer() 
 *poll() ͶƱ
 * 
 * */



//ģ���ջ�Ĵ洢��ʽ
class StruckList{
	LinkedList list;
	
	public StruckList(){
		list = new LinkedList();
	}
	
	public void add(Object o ){
		list.push(o);
	}
	
	//��ջ����Ԫ��ɾ��������
	public Object pop(){
		return list.pop();
	}
	
	public int size()
	{
		return list.size();
	}
}

//ģ�����
class TeamList{
	LinkedList list;
	
	public TeamList(){
		list = new LinkedList();
	}
	
	public void add(Object o){
		list.offer(o);
	}
	
	public Object remove(){
		return list.poll();
	}
	
	public int size(){
		return list.size();
	}
}

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*��ջ�Ĵ洢��ʽ
		StruckList list = new StruckList();
		list.add("����");
		list.add("��γ�");
		list.add("������");
		
		while(list.size()!=0){
		System.out.println(list.pop());*/
		
		TeamList list = new TeamList();
		list.add("����");
		list.add("��γ�");
		list.add("������");
	
	    while(list.size()!=0){
	    	System.out.println(list.remove());
		}
	    
	    
	}
}

