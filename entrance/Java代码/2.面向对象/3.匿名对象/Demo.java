class Students{
	int num;
	String name;

	public void study(){
		System.out.println("好好学习");
    }
}

class Demo{
	public static void main(String[] args)
	{
	   	//创建一个学生对象
		//Students s = new Students();
        // new Students().name = "周杰伦";//匿名对象  一般不给匿名对象赋予属性值，因为永远无法获取到
        //System.out.println(new Students().name);
	    // System.out.println(new Students() == new Students());//两个匿名对象永远不可能是同一个对象
	    
		//需求：调用students的study方法（用匿名对象）
        
		new Students().study();//类名后面要加括弧 方法后面要加括弧

	}
}