package 枚举类;
//枚举类应用于限制用户输入
enum Gender{
	//枚举值其实就是Gender类的对象
	man("男"){
		public void run(){
			System.out.println("男人在跑...");
		}
	},woman("女"){
		public void run(){
			System.out.println("女人在跑...");
		}
	};
	
	String value;
	
	//构造方法必须要是私有的
	private Gender(String value){
		this.value = value;
	}
	
	//可以有抽象方法
	public abstract void run();
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch也可以使用枚举类
		
		Gender sex = Gender.woman;
		switch(sex){
		case man:
			sex.run();
			break;
		case woman:
			sex.run();
			break;
		}
	}
}
