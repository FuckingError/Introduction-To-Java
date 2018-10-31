package cn.itcast.Clone;

import java.io.Serializable;

public class Person implements Cloneable,Serializable {
	String name;
	int age;
	Address address;
	
	public Person(String name,int age,Address address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "������"+this.name+" ����"+this.age+" ��ַ��"+this.address.address;
	}
	
	//�����Ȩ�޿��Աȸ����
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
	
    class Address implements Serializable{
	String address;
	
	public Address(String address){
		this.address = address;
	}
	
   }


