package cn.itcast.observer;
import java.util.ArrayList;
/*时间：2017年9月8日14:29:02
 * 观察者设计模式
 * 
 * 天气预报 让人们根据天气做出具体的事情
 * 第一阶段：完成天气预报的任务
 * 第二阶段：添加人物 先是只有一个小明    -> 再增加小丽(使用集合)
 * 第三阶段:不同的人应该有不同的处理方式 增加一个学生类 ———这个时候的问题：如何让不同的人能做出不同的处理方式
 *    解决方案1：在WeatherStation中再增加一个学生类   弊端：耦合性太高 每当多一种人就要改变一次WeatherStation
 *    解决方案2：如何才能在增加一类人时 不改变WeatherStation ->增加一个接口 也就是将不同的东西通过一个接口接入类中实现相同
 *            当Stu 或者 Emp 实现这个接口时 可以重写接口的方法 达到不同处理的效果 同时 接口可以在WeatherStation不用再重复改变 降低耦合性
 *            
 *总结：1.观察者设计模式步骤 
 *       1)如果要根据当前对象的行为，另一个对象要做出相应的不同处理，则增加一个接口，接口中添加另一个对象的处理方法
 *       2)在当前对象中引用该接口，当当前对象做出制定动作时，就可以调用对象的处理方法了
 *    2.采用匿名内部类 的多线程            
*/
import java.util.Random;

public class WeatherStation {
	String[] weathers = new String[]{"晴天","刮风","下雨","冰雹","下雪","雾霾"};
	String weather;
	ArrayList<Weather> e = new ArrayList<Weather>();//集合类型为Weather接口 
	
	//添加集合元素的方法
	public void addListener(Weather w){
		e.add(w);
	}

	//每隔1~1.5秒更新天气
	public void startWork(){
		Random random = new Random();
		
		//采用匿名内部类的多线程
		new Thread(){public void run() {
			while(true){
				updateWeather();
				//遍历Emp集合  一个一个作出处理
				for(Weather emp :e){
					emp.notifyWeather(weather);
				}
				int time = random.nextInt(501)+1000;
				try {
					Thread.sleep(time);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}}.start();
	}
	//更新天气
	public void updateWeather(){
		Random random = new Random();
		int index = random.nextInt(weathers.length);//随机数 0~n-1
		weather = weathers[index];
		System.out.println("当前的天气:"+weather);
	}

}
