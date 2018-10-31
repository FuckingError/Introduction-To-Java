package cn.itcast.others;

enum Gender1{
	man,woman;
}

class Person1{
	private String name;
	private Gender1 sex;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Gender1 getSex() {
		return sex;
	}
	
	public void setSex(Gender1 sex) {
		this.sex = sex;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ÐÕÃû£º"+this.name+" ÐÔ±ð£º"+this.sex;
	}
	
	
}

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
