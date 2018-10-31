package cn.itcast.regex;
/*
 * 正则表达式:主要是操作字符串
 * */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//预定义字符类  1+3个2
		System.out.println("任意字符:"+"*".matches("."));
		
		System.out.println("数字字符:"+"1".matches("\\d"));
		System.out.println("非数字字符:"+"*".matches("\\D"));
		
		System.out.println("空白字符:"+"\r".matches("\\s"));// \r表示空格键  \n表示换行键
		System.out.println("非空白字符:"+"*".matches("\\S"));
		
		System.out.println("单词字符:"+"_1a".matches("\\w{3}"));
		System.out.println("非单词字符:"+"*".matches("\\W"));
		
		
		//数量词 2个3
		System.out.println("\n零次或一次:"+"".matches("\\d?"));
		System.out.println("零次或多次:"+"".matches("\\d*"));
		System.out.println("一次或多次:"+"2".matches("\\d+"));
		
		System.out.println("恰好n次:"+"22".matches("\\d+{2}"));
		System.out.println("至少n次:"+"2222".matches("\\d+{2,}"));
		System.out.println("至少n次但是不超过m次:"+"222".matches("\\d+{2,3}"));
		
		//范围 词 
		System.out.println("a或b或c:"+"cbc".matches("[abc]{2,}"));//注意只代表一个字符，除非后面增加数量词
		System.out.println("a到z或A-Z:"+"cadAD".matches("[a-zA-Z]+"));
		System.out.println("非a b c:"+"d".matches("[^abc]"));
	}

}
