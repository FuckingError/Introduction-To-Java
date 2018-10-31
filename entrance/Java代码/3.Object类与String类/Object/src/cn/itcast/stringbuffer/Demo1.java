package cn.itcast.stringbuffer;
/*
 StringBuffer()  �ַ�������  �洢�ַ������� 
                 ʵ��Ϊ�ַ����飬����Ĭ��Ϊ16��������Ȳ����ã����Ϊԭ�����һ��
 
 String ���Ȳ��ɸı�
 
 ����
  append(boolean b)  ��������������͵����ݵ�������
  insert(int offset,boolean b)   ��ָ��λ�ò����ַ���
 
 ɾ��
  delete(int start,int end) ����ָ������ֵɾ����Ӧ������
  deleteCharAt(int index) ɾ��һ���ַ�
 
 �鿴
  indexOf(String str,int fromIndex) ��������ֵ
  capacity() �鿴�ַ�����ĳ���
  length() �鿴�����ַ��ĸ���
  charAt(int index) �鿴ָ������ֵ���ַ�
  toString() ���ַ������������ת�����ַ���
 �޸�
  replace(int start,int end,string str);
  reverse()  ��ת
  
  setCharAt(int index,char ch) ��ָ������ֵ���ַ��滻��ָ�����ַ�
  
  substring(int start,int end) ��ȡ
  

 */
public class Demo1 {
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("abc78981455878459558658");		
		
		/*��ӵķ���
		sb.append(3.14f);
		*/
		
		/*����ķ���
		 * 
		 */
		sb.insert(2, "�ܽ���");
		
		/*ɾ���ķ���
		sb.delete(2, 5);//��ͷ����β
		*/
		
		/*ɾ��һ���ַ�
		sb.deleteCharAt(2);
        */
        
		/*�滻
		sb.replace(2, 5, "����");
		*/
		
		/*��ת
		sb.reverse();
		*/
		
	   //sb.setCharAt(2, '��');//�滻�����ַ�
		
		/*
		 * ��ȡ  �ַ������
		 * System.out.println(sb.substring(2,5));
		 */
		
		/*
		 * �鿴����ֵ
		int index = sb.indexOf("ab",0);
		System.out.println(index);
		*/
		
		/*�鿴�ַ����鳤��
		
		*/
		System.out.println("�鿴�ַ����� �ĳ���:"+sb.capacity());
		//�鿴�洢���ַ�����
		//System.out.println("�鿴�洢���ַ�������"+sb.length());
		
		/*�鿴ָ������ֵ���ַ�
		System.out.println(sb.charAt(2));
		*/
		
		/*ת�����ַ���
		System.out.println(sb.toString());
		*/
		
	}

}
