package 图书管理系统;

public class User {
	private String number;
	private String passWord;
	
	public String getNumber(){
		return number;
	}
	
	public void setNumber(String number){
		this.number = number; 
	}
	
	public String getPassWord(){
		return passWord;
	}
	
	public void setPassWord(String passWord){
		this.passWord = passWord; 
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "账号："+number+" 密码："+passWord;
	}
}
