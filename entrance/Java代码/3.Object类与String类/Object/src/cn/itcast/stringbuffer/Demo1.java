package cn.itcast.stringbuffer;
/*
 StringBuffer()  字符缓冲区  存储字符的容器 
                 实质为字符数组，长度默认为16，如果长度不够用，则变为原数组的一倍
 
 String 长度不可改变
 
 增加
  append(boolean b)  可以添加任意类型的数据到容器中
  insert(int offset,boolean b)   在指定位置插入字符串
 
 删除
  delete(int start,int end) 根据指定索引值删除对应的内容
  deleteCharAt(int index) 删除一个字符
 
 查看
  indexOf(String str,int fromIndex) 查找索引值
  capacity() 查看字符数组的长度
  length() 查看储存字符的个数
  charAt(int index) 查看指定索引值的字符
  toString() 把字符缓冲类的内容转换成字符串
 修改
  replace(int start,int end,string str);
  reverse()  反转
  
  setCharAt(int index,char ch) 把指定索引值的字符替换成指定的字符
  
  substring(int start,int end) 截取
  

 */
public class Demo1 {
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("abc78981455878459558658");		
		
		/*添加的方法
		sb.append(3.14f);
		*/
		
		/*插入的方法
		 * 
		 */
		sb.insert(2, "周杰伦");
		
		/*删除的方法
		sb.delete(2, 5);//包头不包尾
		*/
		
		/*删除一个字符
		sb.deleteCharAt(2);
        */
        
		/*替换
		sb.replace(2, 5, "刘清");
		*/
		
		/*反转
		sb.reverse();
		*/
		
	   //sb.setCharAt(2, '刘');//替换单个字符
		
		/*
		 * 截取  字符串输出
		 * System.out.println(sb.substring(2,5));
		 */
		
		/*
		 * 查看索引值
		int index = sb.indexOf("ab",0);
		System.out.println(index);
		*/
		
		/*查看字符数组长度
		
		*/
		System.out.println("查看字符数组 的长度:"+sb.capacity());
		//查看存储的字符个数
		//System.out.println("查看存储的字符个数："+sb.length());
		
		/*查看指定索引值的字符
		System.out.println(sb.charAt(2));
		*/
		
		/*转换成字符串
		System.out.println(sb.toString());
		*/
		
	}

}
