//时间：2017年3月14日13:00:46
//封装入门
class Member{
	public String name;
	public String sex;
	public int salary;
	
	public Member(String name, String sex, int salary)
	{
		this.name = name;
		//this.sex = sex;
		
		if(sex.equals("男")||sex.equals("女"))
		{
			this.sex = sex;
		}
		else
		{
			this.sex = "男";
		}
		
		this.salary = salary;
	}
}
	//定义一个公共的方法设置sex属性

/*
    public /*String*/  //void setSex(String s){
		/*
		//if(s == "男"||s =="女"){//如果比较两个字符串的内容是否一致，不要使用==比较，使用equals方法
		if  (s.equals("男")||s.equals("女")){
			sex = s;
			//return sex;
			}else{
	    	sex = "男";
			//return sex; 不能在设置属性的方法中返回私有属性，因为私有属性在主类中接收不到
	   }
	   }
	//j接受sex属性
	public String getSex(){
		return sex;//只能通过getSex()方法进行返回和访问访问//因为私有变量只能在该类中访问
	}
}
*/
class Demo{
	
	    public static void main(String[] args){
		Member m = new Member("周杰伦","不男不女",10);
		/*
	    m.name = "狗娃";
		m.setSex("扮男扮女");
	    m.salary = 800;
		*/
		System.out.println("姓名："+m.name+" 性别："+m.sex+" 收入："+m.salary);//调用类中的方法要在方法前加类名//输出时要格外注意“+”和空格
	}
}


