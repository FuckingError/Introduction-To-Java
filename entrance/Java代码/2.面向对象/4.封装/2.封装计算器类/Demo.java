//时间：2017年3月19日11:39:50
//目的：实现计算器
class Calculator
{
	private int num1;
	private int num2;
    private char option;

	//提供公共方法设置属性值
	public void initCalculator(int n1, int n2, char o)
	{
		num1 = n1;
		num2 = n2;
		if(o=='+'||o=='-'||o=='*'||o=='/')
		{
			option = o;
		}
		else
		{
			option = '+';
		}

	}
    

	//计算功能
	public void calculate()
	{
		switch(option)
		{
			case '+':
				System.out.println("做加法运算，结果是："+(num1+num2));
			    break;
			case '-':
                 System.out.println("做减法运算，结果是："+(num1-num2));
			     break;
			case '*':
                 System.out.println("做乘法运算，结果是："+(num1*num2));
			     break;
			case '/':
				System.out.println("做除法运算，结果是："+(num1/num2));
                break;
		 }
      }
}

class Demo
{
	public static void main(String[] args)
	{
		//创建对象
		Calculator c = new Calculator();
		//设置属性值
		c.initCalculator(1,2,'+');
		//调用计算功能
	    c.calculate();
	
	}

} 
