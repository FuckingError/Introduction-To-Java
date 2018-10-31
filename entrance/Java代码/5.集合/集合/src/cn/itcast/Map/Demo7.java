package cn.itcast.Map;

import java.util.Arrays;
import java.util.List;

/*数组工具类：
 * 
 * */
public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {12,3,4,5};
		Integer[] arr1 = Arrays.copyOf(arr, 4);
		Integer[] arr2 = Arrays.copyOfRange(arr, 1, 2);
		System.out.println("复制数组元素："+Arrays.toString(arr1));
  		System.out.println("拷贝后的元素arr2："+Arrays.toString(arr2));
		
		// 比较数组元素是否一致：
		System.out.println("判断数组元素是否一致：" + Arrays.equals(arr, arr1));

		// 将数组变成集合：
		List<Integer> list = Arrays.asList(arr);
		System.out.println("数组转换成集合：" + list);
	}

}
