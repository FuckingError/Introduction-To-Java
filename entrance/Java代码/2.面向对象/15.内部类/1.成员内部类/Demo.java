class Outer
{
	int x = 1;
	//��Ա�ڲ���
      class Inner
	{
		 int x = 10;
		 public void print()
		{
			System.out.println(x);//�����ⲿ��ı��� this�൱��һ������
		}
	}

    //ͨ�����ⲿ�ඨ��һ�������������ڲ���Ķ��󣬽��з���
	 //��Ҫ����˽�еĳ�Ա�ڲ���
	/*
	public void instance()
	{
		Inner a = new Inner();
		a.print();
	}
	*/
	
}

class Demo
{
	public static void main(String[] args)
	{
		/*
		Outer o = new Outer();
		o.instance();
        */

      

		/*ֱ��ͨ����������������һ�����������ڲ���
        Outer.Inner inner = new Outer().new Inner();
		inner.print();
	    */			


		/*���ʾ�̬����  ��Inner������еı�����Ϊ��̬��ʱ�����������п��Բ��ô���Outer��Inner�Ķ�����з���
        System.out.println(Outer.Inner.x);
		*/
		
		//��������������һ���������ʾ�̬�ڲ���s
		/*
		Outer.Inner a = new Outer.Inner();
		a.print();
		*/
	}
}