package cn.itcast.observer;
import java.util.ArrayList;
/*ʱ�䣺2017��9��8��14:29:02
 * �۲������ģʽ
 * 
 * ����Ԥ�� �����Ǹ��������������������
 * ��һ�׶Σ��������Ԥ��������
 * �ڶ��׶Σ�������� ����ֻ��һ��С��    -> ������С��(ʹ�ü���)
 * �����׶�:��ͬ����Ӧ���в�ͬ�Ĵ���ʽ ����һ��ѧ���� ���������ʱ������⣺����ò�ͬ������������ͬ�Ĵ���ʽ
 *    �������1����WeatherStation��������һ��ѧ����   �׶ˣ������̫�� ÿ����һ���˾�Ҫ�ı�һ��WeatherStation
 *    �������2����β���������һ����ʱ ���ı�WeatherStation ->����һ���ӿ� Ҳ���ǽ���ͬ�Ķ���ͨ��һ���ӿڽ�������ʵ����ͬ
 *            ��Stu ���� Emp ʵ������ӿ�ʱ ������д�ӿڵķ��� �ﵽ��ͬ�����Ч�� ͬʱ �ӿڿ�����WeatherStation�������ظ��ı� ���������
 *            
 *�ܽ᣺1.�۲������ģʽ���� 
 *       1)���Ҫ���ݵ�ǰ�������Ϊ����һ������Ҫ������Ӧ�Ĳ�ͬ����������һ���ӿڣ��ӿ��������һ������Ĵ�����
 *       2)�ڵ�ǰ���������øýӿڣ�����ǰ���������ƶ�����ʱ���Ϳ��Ե��ö���Ĵ�������
 *    2.���������ڲ��� �Ķ��߳�            
*/
import java.util.Random;

public class WeatherStation {
	String[] weathers = new String[]{"����","�η�","����","����","��ѩ","����"};
	String weather;
	ArrayList<Weather> e = new ArrayList<Weather>();//��������ΪWeather�ӿ� 
	
	//��Ӽ���Ԫ�صķ���
	public void addListener(Weather w){
		e.add(w);
	}

	//ÿ��1~1.5���������
	public void startWork(){
		Random random = new Random();
		
		//���������ڲ���Ķ��߳�
		new Thread(){public void run() {
			while(true){
				updateWeather();
				//����Emp����  һ��һ����������
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
	//��������
	public void updateWeather(){
		Random random = new Random();
		int index = random.nextInt(weathers.length);//����� 0~n-1
		weather = weathers[index];
		System.out.println("��ǰ������:"+weather);
	}

}
