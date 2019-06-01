package cn.aura.demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 3.   砸金花程序完成。面向对象的思维。Card  Cards  Person  Game  
级别比较：三条> 同花顺> 同花 > 顺子 > 一对 >散牌
花色比较：红桃>黑桃>方片>草花
同级别比较：
三条：比较值大小即可
同花顺：比较最大的值，如果最大值相同，比较最大值花色
同花： 最大值，如果最大值相同，比较第二个最大值，比较第三个值，比较花色
顺子：比较最大值，比较最大值花色
一对：比较一对的值 ，比较一对的花色
散牌：比较最大一张牌的值，如果一样，比较第二大的牌的值，如果一样，比较第三张牌的值，如果一样，比较最大牌的花色

提示，可以将抽取的三张牌，数据存储到一个数组中，包括以上的信息如{级别,最大牌的值，第二大牌的值，第三大牌的值，最大牌的花色}  数组的长度，是以上最复杂的一个比较的个数(如同花，6个元素)，
然后创建比较器，比较，多个数组的大小。

  Integer
 1                             14
{级别,最大牌的值，第二大牌的值，第三大牌的值，最大牌的花色4红桃  2方片} 

2                              9
{级别,最大牌的值，第二大牌的值，第三大牌的值，最大牌的花色} 

3
{级别,最大牌的值，第二大牌的值，第三大牌的值，最大牌的花色} 

 */
public class MyComparator implements Comparator<Integer[]> {

	@Override
	public int compare(Integer[] o1, Integer[] o2) {
		int v = 0;
		for (int i = 0; i < o1.length; i++) {
			v = o1[i] - o2[i];
			if (v != 0) {
				break;
			}
		}
		return v;
	}
}
