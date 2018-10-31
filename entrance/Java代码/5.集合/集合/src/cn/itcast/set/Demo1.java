package cn.itcast.set;
/*
 * set集合是无序的
 * HashSet的实现原理：
 * 1往Haset添加元素时，HashSet会先调用元素的hashCode方法得到元素的哈希值
 * 然后通过元素的哈希值经过移位等运算，可以算出该元素在哈希表中的存储位置
 * 2.当算出元素存储的位置目前没有任何元素存储，那么该元素就可以直接存储到该位置上
 *   当该位置已经存在一个元素，则调用元素的equals方法与该位置上的元素再比较一次，如果为true，则不允许添加
 *                                                        如果为false，则可以添加(哈希表为桶式结构)
 *                                                        
 *                                                   
 * */

import java.util.HashSet;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	HashSet set = new HashSet();
		set.add("周杰伦");
		set.add("郭德纲");
		set.add("叶问");
		//无序的
		System.out.println(set);
*/
		/*
		 * 目的：只允许添加不同的人，编号相同即同一个人
		 * 改写hashCode方法
		 * 改写equals方法
		HashSet set = new HashSet();
		set.add(new Person(110,"周杰伦"));
		set.add(new Person(111,"郭德纲"));
		set.add(new Person(110,"jay"));
		
		System.out.println(set);
		*/
	}

}
