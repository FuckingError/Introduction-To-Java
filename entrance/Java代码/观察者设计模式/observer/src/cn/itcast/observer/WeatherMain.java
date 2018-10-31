package cn.itcast.observer;

public class WeatherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherStation station = new WeatherStation();
		Emp e = new Emp("小明");
		Emp e2 = new Emp("小丽");
		station.addListener(e);
		station.addListener(e2);
		Stu s = new Stu("小张");
		Stu s2 = new Stu("小李");
		station.addListener(s);
		station.addListener(s2);
		
		station.startWork();

	}

}
