package cn.itcast.genrictiry;
/*
 * 需求：编写一个数组工具类
 * 
 * 思想：1.泛型方法使用时，当实参类型为基本类型时，一定要注意定义该实参时，要为它的包装类
 * 
 * 泛型类：
 *     (1).class 类名<声明自定义类型>{
 *        方法不需要再声明泛型
 *     }
 *     
 *     (2).创建对象的时候要注意：等号后面的泛型在括号前面
 *         MyArrays<Character> tools = new MyArrays<Character>();
 *     (3).注意：如果一个类在类上已经声明了自定义泛型，如果使用该类创建对象的时候没有制定泛型的具体数据类型，那么默认为Object型
 *         注意：静态方法  需要在方法中声明泛型    
 * */
class MyArrays<T>{
	public void reverse(T[] arr){
		for(int startIndex = 0, endIndex = arr.length-1;startIndex < endIndex;startIndex++,endIndex--){
			T temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
	}
	
	public String toString(T[] arr){
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<arr.length;i++){
			if(i == 0){
				sb.append("["+arr[0]+",");
			}
			else if(i == arr.length-1){
				sb.append(arr[arr.length-1]+"]");
			}
			else{
				sb.append(arr[i]+",");
			}
		}
		return sb.toString();
	}
	
	//静态方法  需要在方法中声明泛型
	public static <T>void print(T o){
		
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character[] arr = {'a','b','c'};
		MyArrays<Character> tools = new MyArrays<Character>();
		tools.reverse(arr);
		System.out.println(tools.toString(arr));
		
		/*注意：如果一个类在类上已经声明了自定义泛型，如果使用该类创建对象的时候没有制定泛型的具体数据类型，那么默认为Object型
		 * MyArrays tool2 = new MyArrays();
		tool2.reverse(arr);*/
	}

}
