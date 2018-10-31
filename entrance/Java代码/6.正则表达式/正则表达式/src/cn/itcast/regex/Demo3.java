package cn.itcast.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//������� 
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content = "��ϵ����:1772344524@163.com.cn��ϵ����:1774524@qq.com��ϵ����:sad1774524@qq.com��ϵ����:177234@qq.cn��ϵ����:adfasa@qq.com��ϵ����:1772344524@qq.net";
		String reg = "[a-zA-Z1-9]\\w{5,17}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(content);//ƥ����
		
		while(m.find()){
			System.out.println(m.group());
		}
             
	}

}
