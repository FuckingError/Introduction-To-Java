package cn.itcast.observer;

public class Stu implements Weather {
	String name;
	public Stu(String name){
		this.name = name;
	}
	
	public void notifyWeather(String weather){
		switch (weather) {
		case "����":System.out.println(name+"�߸�����ȥ��ѧ��");
		break;
		case "����":System.out.println(name+"��������ȥ��ѧ��");
		break;
		case "��ѩ":System.out.println(name+"���ű���ȥ��ѧ��");
		break;
		case "����":System.out.println(name+"���ſ���ȥ��ѧ��");
		break;
		case "����":System.out.println(name+"���Ÿֿ�ȥ��ѧ��");
		break;
		case "�η�":System.out.println(name+"����ʯͷȥ��ѧ��");
		break;
		default:
			break;
		}
		
	}


}
