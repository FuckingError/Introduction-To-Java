package cn.itcast.observer;

public class WeatherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherStation station = new WeatherStation();
		Emp e = new Emp("С��");
		Emp e2 = new Emp("С��");
		station.addListener(e);
		station.addListener(e2);
		Stu s = new Stu("С��");
		Stu s2 = new Stu("С��");
		station.addListener(s);
		station.addListener(s2);
		
		station.startWork();

	}

}
