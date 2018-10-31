package cn.itcast.genrictiry;
/*泛型接口
 * 1.接口上自定义的泛型的具体数据类型是在实现一个接口的 时候指定的
 * 2.如果没有指定，默认为Object类型
 * 3.想要延迟指定类型，如下
 * */
interface Dao<T>{
	public void add(T t);
}
//需求：在等待创建接口实现类对象的时候,指定泛型的具体数据类型
public class Demo3<T> implements Dao<T>{
	@Override
	public void add(T t) {
		// TODO Auto-generated method stub
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3<String> d = new Demo3<String>();
		d.add("ty");
		}

	}

