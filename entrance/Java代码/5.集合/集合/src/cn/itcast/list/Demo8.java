package cn.itcast.list;

import java.util.LinkedList;
import java.util.Random;
/*
 * 时间：2017年4月13日21:23:15
 * 目的：制作扑克牌，并且打乱
 * 思想：1.方法的参数为引用类型时，会产生影响，所以当有多个方法的参数为一种引用类型变量时，后面的方法可以不用返回值
 *     2.当在遍历循环中减少集合个数时，要在循环外声明一个变量存放集合个数
 *     3.交换集合元素时，先取出需要交换的元素，再使用set（）方法
 * 技术：1.有x个数据，每y个数据进行一次操作:
 *       for(int i = 0;i < x;i++){
 *         if(i%x = x-1){
 *         操作;
 *         }
 *       }
 *     2.学会Random random = new Random();
 *          int x = random.nextInt(自己指定在多少之内取随机数);
 *     3.LinkedList 有   set(index,element)
 *                    get(index);
 * */
class Poker{
	String color;
	String num;
	
	public Poker(String color,String num){
		this.color = color;
		this.num = num;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{"+color+num+"}";
	}
}

public class Demo8 {
	public static void main(String[] args)
	{
		LinkedList pokers = creatPoker();
		shuffle(pokers);
		showPoker(pokers);
	}

	//创建扑克牌
	public static LinkedList creatPoker() {
		String[] color = {"♠","♥","♣","♦"};
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		LinkedList pokers = new LinkedList(); 
		
		for(int i = 0;i<13;i++){
			for(int j = 0;j < 4;j++){
				pokers.add(new Poker(color[j],num[i]));
			}
		}
		return pokers;
	}
	//显示扑克牌
	public static void showPoker(LinkedList pokers){
		//注意：当在遍历循环中减少集合个数时，要在循环外声明一个变量存放集合个数
		for(int i = 0;i<pokers.size();i++){
			System.out.print(pokers.get(i));
			
			//换行   每四个换一行
			if(i%4==3){
			System.out.println();
			}
		}
	}
	
	public static void shuffle(LinkedList pokers){
		LinkedList newPokers = new LinkedList();
		Random random = new Random();
		for(int i = 0;i < 100;i++){
			int index1 = random.nextInt(pokers.size());
		    int index2 = random.nextInt(pokers.size());
	
		    //取出需要交换的两张牌
		    Poker p1 = (Poker) pokers.get(index1);
		    Poker p2 = (Poker) pokers.get(index2);
		
		    //交换两张牌的位置
		    pokers.set(index1, p2);
		    pokers.set(index2, p1);
		}	
	}
}
