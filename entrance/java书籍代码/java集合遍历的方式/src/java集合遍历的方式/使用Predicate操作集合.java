package java���ϱ����ķ�ʽ;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;
/*PredicateӦ�ó�������Լ���Ԫ��, ��ͬһ�ֲ������������㲻ͬ������Ԫ���з���ʹ��
 *��ʽ:������һ���Լ���Ԫ�ؽ��в����ķ���ʱ���ڲ���������Predicate p
 *    foreach������if(p.test(obj))
 *  
*/
public class ʹ��Predicate�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("�ܽ���");
		books.add("����");
		books.add("Ѧ����");
		/*
		books.removeIf(ele -> ((String)ele).equals("Ѧ����"));
		System.out.println(books);*/
		
		System.out.println(calAll(books,ele->ele.equals("�ܽ���")));
		System.out.println(calAll(books,ele->ele.equals("����")));
		System.out.println(calAll(books,ele->ele.equals("Ѧ����")));

	}
	public static int calAll(Collection books,Predicate p)
	{
		int total = 0;
		//foreach��������Ԫ��
		for(Object obj : books)
		{
			if(p.test(obj))//���obj����p
			{
				total++;
			}
	    }
		return total;
	}

}
