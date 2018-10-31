package cn.itcast.others;
//基本数据类型和相关的类
//自动拆箱和装箱
/*int  Integer
 *
 *char Character
 */
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String转换成int
		String a = "10";
		int b = Integer.parseInt(a);
		System.out.println("String转换成int："+(b+1));
		
		//int转化成String
		String c = Integer.toString(b);
		System.out.println("把int转换成String:"+(c+1));
		
		//将int转换成想要的进制
		System.out.println("转换成二进制："+Integer.toBinaryString(b));
		System.out.println("转换成八进制："+Integer.toOctalString(b));
		System.out.println("转换成十六进制："+Integer.toHexString(b));
		
		//将String转成对应进制
		int d = Integer.parseInt(a, 2);
		System.out.println("将String转换成二进制:"+d);
		
		
		

	}

}
