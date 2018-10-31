package cn.itcast.observer;

public class Stu implements Weather {
	String name;
	public Stu(String name){
		this.name = name;
	}
	
	public void notifyWeather(String weather){
		switch (weather) {
		case "晴天":System.out.println(name+"高高兴兴去上学！");
		break;
		case "下雨":System.out.println(name+"披着雨衣去上学！");
		break;
		case "下雪":System.out.println(name+"裹着被子去上学！");
		break;
		case "雾霾":System.out.println(name+"戴着口罩去上学！");
		break;
		case "冰雹":System.out.println(name+"顶着钢盔去上学！");
		break;
		case "刮风":System.out.println(name+"揣着石头去上学！");
		break;
		default:
			break;
		}
		
	}


}
