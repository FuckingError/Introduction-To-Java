package cn.itcast.observer;

public class Emp implements Weather{
	String name;
	
	public Emp(String name){
		this.name = name;
	}
	
	public void notifyWeather(String weather){
		switch (weather) {
		case "晴天":System.out.println(name+"高高兴兴去上班！");
		break;
		case "下雨":System.out.println(name+"披着雨衣去上班！");
		break;
		case "下雪":System.out.println(name+"裹着被子去上班！");
		break;
		case "雾霾":System.out.println(name+"戴着口罩去上班！");
		break;
		case "冰雹":System.out.println(name+"顶着钢盔去上班！");
		break;
		case "刮风":System.out.println(name+"揣着石头去上班！");
		break;
		default:
			break;
		}
		
	}

}

