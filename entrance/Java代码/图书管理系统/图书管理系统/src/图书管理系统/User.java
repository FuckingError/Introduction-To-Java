package ͼ�����ϵͳ;

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
		return "�˺ţ�"+number+" ���룺"+passWord;
	}
}
