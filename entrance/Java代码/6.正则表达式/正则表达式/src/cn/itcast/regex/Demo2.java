package cn.itcast.regex;

import java.util.Arrays;

//正则表达式的四个应用
/*匹配：一定要注意在数量词前加预定义字符
 *切割:
 *替换：
 *查找:
 * 
 * */
public class Demo2 {
	public static void main(String[] args){
		matchesPhone("15252616685");
		matchesTel("0523-84838105");
		testSplit1();
		testSplit2();
		replaceTest1();
		replaceTest2();
		
	}
	
	//需求一:编写一个正则表达式匹配手机号:第一位：只能是1开头  第二位：3，4，5，7，8  长度：11位
	public static void matchesPhone(String phone){
		System.out.println(phone.matches("1[34578]\\d{9}")?"合法手机号":"非法手机号");
	}
	//需求二:匹配固定电话  区 号:首位是0  长度：3或4    主机号：首位不能是0 长度：7或8 
	
	public static void matchesTel(String tel){
		System.out.println(tel.matches("0\\d{2,3}-[1-9]\\d{6,7}")?"合法电话":"非法电话");
	}
	
	
	
	
	//切割
	public static void testSplit1(){
		String str = "周 杰    伦";
		String[] str2 = str.split("\\s+");
		System.out.println(Arrays.toString(str2));
	}
	
	//根据重叠词进行切割
	public static void testSplit2(){
		String str = "周六六六杰请请伦";
		String[] str2 = str.split("(.)\\1+"); //  \\1 表示复用第一组   
		System.out.println(Arrays.toString(str2));
	}
	
	
	//替换
	public static void replaceTest1(){
		String str = "如有需求请联系我：15252616685如有需求请联系我：15252616685如有需求请联系我：15252616685如有需求请联系我：15252616685如有需求请联系我：15252616685如有需求请联系我：15252616685";
		String reg = "1[34578]\\d{9}";
		str = str.replaceAll(reg, "****");
		System.out.println(str);
	}
	
	public static void replaceTest2(){
		String str = "我我我喜喜喜欢周周杰杰杰杰伦";
		String reg = "(.)\\1+";
		str = str.replaceAll(reg, "$1");//在正则外部引用组的内容，使用$加组号
	
		System.out.println(str);
	}
	
	
	
	
	
}
