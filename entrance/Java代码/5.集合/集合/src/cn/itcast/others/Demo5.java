package cn.itcast.others;
//ö���� ��ԭ��
class Gender{
	String value;
	
	public static final Gender man = new Gender("��");
	public static final Gender woman = new Gender("Ů");
	
	private Gender(String value){
		this.value = value;
	}
}

class Person{
	private String name;
	private Gender sex;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Gender getSex() {
		return sex;
	}
	
	public void setSex(Gender sex) {
		this.sex = sex;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "������"+this.name+" �Ա�"+this.sex.value;
	}
	
	
}

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setName("����");
		p.setSex(Gender.woman);
		System.out.println(p);

	}
	
	

}
