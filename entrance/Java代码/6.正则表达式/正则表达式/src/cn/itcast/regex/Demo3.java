package cn.itcast.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//正则对象 
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content = "联系邮箱:1772344524@163.com.cn联系邮箱:1774524@qq.com联系邮箱:sad1774524@qq.com联系邮箱:177234@qq.cn联系邮箱:adfasa@qq.com联系邮箱:1772344524@qq.net";
		String reg = "[a-zA-Z1-9]\\w{5,17}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(content);//匹配器
		
		while(m.find()){
			System.out.println(m.group());
		}
             
	}

}
