//ʱ�䣺2017��3��14��13:00:46
//��װ����
class Member{
	public String name;
	public String sex;
	public int salary;
	
	public Member(String name, String sex, int salary)
	{
		this.name = name;
		//this.sex = sex;
		
		if(sex.equals("��")||sex.equals("Ů"))
		{
			this.sex = sex;
		}
		else
		{
			this.sex = "��";
		}
		
		this.salary = salary;
	}
}
	//����һ�������ķ�������sex����

/*
    public /*String*/  //void setSex(String s){
		/*
		//if(s == "��"||s =="Ů"){//����Ƚ������ַ����������Ƿ�һ�£���Ҫʹ��==�Ƚϣ�ʹ��equals����
		if  (s.equals("��")||s.equals("Ů")){
			sex = s;
			//return sex;
			}else{
	    	sex = "��";
			//return sex; �������������Եķ����з���˽�����ԣ���Ϊ˽�������������н��ղ���
	   }
	   }
	//j����sex����
	public String getSex(){
		return sex;//ֻ��ͨ��getSex()�������з��غͷ��ʷ���//��Ϊ˽�б���ֻ���ڸ����з���
	}
}
*/
class Demo{
	
	    public static void main(String[] args){
		Member m = new Member("�ܽ���","���в�Ů",10);
		/*
	    m.name = "����";
		m.setSex("���а�Ů");
	    m.salary = 800;
		*/
		System.out.println("������"+m.name+" �Ա�"+m.sex+" ���룺"+m.salary);//�������еķ���Ҫ�ڷ���ǰ������//���ʱҪ����ע�⡰+���Ϳո�
	}
}


