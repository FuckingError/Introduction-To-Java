class Students{
	int num;
	String name;

	public void study(){
		System.out.println("�ú�ѧϰ");
    }
}

class Demo{
	public static void main(String[] args)
	{
	   	//����һ��ѧ������
		//Students s = new Students();
        // new Students().name = "�ܽ���";//��������  һ�㲻����������������ֵ����Ϊ��Զ�޷���ȡ��
        //System.out.println(new Students().name);
	    // System.out.println(new Students() == new Students());//��������������Զ��������ͬһ������
	    
		//���󣺵���students��study����������������
        
		new Students().study();//��������Ҫ������ ��������Ҫ������

	}
}