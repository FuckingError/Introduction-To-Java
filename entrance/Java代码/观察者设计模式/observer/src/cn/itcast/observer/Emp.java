package cn.itcast.observer;

public class Emp implements Weather{
	String name;
	
	public Emp(String name){
		this.name = name;
	}
	
	public void notifyWeather(String weather){
		switch (weather) {
		case "����":System.out.println(name+"�߸�����ȥ�ϰ࣡");
		break;
		case "����":System.out.println(name+"��������ȥ�ϰ࣡");
		break;
		case "��ѩ":System.out.println(name+"���ű���ȥ�ϰ࣡");
		break;
		case "����":System.out.println(name+"���ſ���ȥ�ϰ࣡");
		break;
		case "����":System.out.println(name+"���Ÿֿ�ȥ�ϰ࣡");
		break;
		case "�η�":System.out.println(name+"����ʯͷȥ�ϰ࣡");
		break;
		default:
			break;
		}
		
	}

}

