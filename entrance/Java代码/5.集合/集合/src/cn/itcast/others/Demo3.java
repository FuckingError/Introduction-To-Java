package cn.itcast.others;
/*java 1.5的新特性:
 * 1.增强for循环
 * 2.可变参数
 * 3.自动拆箱和装箱
 * */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2,3));
		}
	//可变参数只能一个，放在参数列表的最后
	public static int add(int... arr){
		int sum = 0;
		for(int number : arr){
			sum += number;
		}
		return sum;
	}

}
