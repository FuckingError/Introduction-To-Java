package cn.itcast.observer;
//订阅天气的接口
public interface Weather {
	public void notifyWeather(String weather);//当Stu 或者 Emp 实现这个接口时 可以重写接口的方法 达到不同处理的效果
	

}
