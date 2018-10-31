package cn.itcast.String;

public class Demo6 {
	public static void main(String[] args)
	{
		String str = " �ܽ���  ";
		myTrim(str);
		
		str = "JAVA��ѧ\\Java����\\2.�������\\21.Object����String��\\Object\\src\\cn\\itcast\\String";
	    System.out.println(getString(str));	
		
	    str = "�ܽ��׺�˧";
	    System.out.println(reverse(str));
	    
	    str = "javawwqfjavasdfajava";
	    System.out.println(getCount(str,"java"));
	}
	
	// ͳ��java�Ĵ���
	public static int getCount(String str, String target) {
		int count = 0;// ͳ�Ƹ���
		int fromIndex = 0;// ��ʼ���ҵ�����ֵ

		while ((fromIndex = str.indexOf(target, fromIndex)) != -1) {
			count++;
			fromIndex = fromIndex + target.length();
		}
		
		return count;
	}
	
	
	
	
	//��ת
	public static String reverse(String str){
		char[] c = str.toCharArray();
		for(int startIndex = 0,endIndex = c.length-1;startIndex<endIndex;startIndex++,endIndex--){
			char temp = c[startIndex];
			c[startIndex] = c[endIndex];
			c[endIndex] = temp;
		}
		
	    return new String(c);
	
	}
	
	//�����ȡString
	public static String getString(String str){
		int index = str.lastIndexOf("S");
		String s = str.substring(index);
	    return s;
	}
	
	//����һ���Լ�ʵ��trim�ķ���
	public static void myTrim(String str){
		char[] arr = str.toCharArray();
		
		int startIndex = 0;
		int endIndex = str.length()-1;
		
		while(true){
			if(arr[startIndex]==' '){
				startIndex++;
			}
			else{
				break;
			}
		}
		
		while(true){
			if(arr[endIndex]==' '){
				endIndex--;
			}
			else{
				break;
			}
		}
		
		String str2 = str.substring(startIndex, endIndex+1);
		System.out.println(str2);
	}
			
}
