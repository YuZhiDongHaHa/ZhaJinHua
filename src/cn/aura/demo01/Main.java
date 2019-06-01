package cn.aura.demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * //编写程序，设计单张扑克牌类Card，具有花色，牌面与具体值。
//同时设计整副扑克牌类Cards，具有52张牌，展示52张牌即可。
//（如果学过实现排序接口的同学）设计一个发牌的函数，对任意三张牌断定牌的类型。
//（如果学过集合、map的同学可以尝试砸金花）
//类型包括：
//三条：三张牌value一样
//一对：两张value一样
//顺子：三张牌挨着    realvalue   3 5 4
//同花：三张牌type一样
//同花顺：挨着，类型一样
//其余都是散牌
//同包中不能有相同的类名字
 */

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("青蛙");// 创建第一个人
		Person p2 = new Person("无二");// 创建第二个人
		Person p3 = new Person("分割");// 创建第三个人
		Cards one = new Cards();// 创建卡片类

		List<Card> San1 = p1.getThree(one);// p1拿到三张牌
		Integer[] array1 = p1.Method(San1);// p1打架用的
		for (Card i : San1) {
			System.out.println(i);
		}
		System.out.println("========================");

		List<Card> San2 = p2.getThree(one);// p2拿到三张牌
		Integer[] array2 = p2.Method(San2);// p2打架用的
		for (Card i : San2) {
			System.out.println(i);
		}
		System.out.println("========================");

		List<Card> San3 = p3.getThree(one);// p3拿到三张牌
		Integer[] array3 = p3.Method(San3);// p3打架用的
		for (Card i : San3) {
			System.out.println(i);
		}
		System.out.println("========================");

		
		SortedMap<Integer[], Person> map = new TreeMap<Integer[], Person>(new MyComparator());

		map.put(array1, p1);
		map.put(array2, p2);
		map.put(array3, p3);
		Integer[] lastKey = map.lastKey();
		Person person = map.get(lastKey);
		System.out.println("赢家是:"+person.getName()+"牌型"+person.resultstr);
		
	}
}
