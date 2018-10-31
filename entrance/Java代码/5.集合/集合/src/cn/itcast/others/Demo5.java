package cn.itcast.others;
//枚举类 的原理
class Gender{
	String value;
	
	public static final Gender man = new Gender("男");
	public static final Gender woman = new Gender("女");
	
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
		return "姓名："+this.name+" 性别："+this.sex.value;
	}
	
	
}

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setName("刘清");
		p.setSex(Gender.woman);
		System.out.println(p);

	}
	
	

}
