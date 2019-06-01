package cn.aura.demo01;

/*
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
public class GameValueCard {
	private Integer level;
	private Integer max;
	private Integer mid;
	private Integer min;
	private Integer colour;

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getColour() {
		return colour;
	}

	public void setColour(Integer colour) {
		this.colour = colour;
	}

	public GameValueCard(Integer level, Integer max, Integer mid, Integer min, Integer colour) {
		super();
		this.level = level;
		this.max = max;
		this.mid = mid;
		this.min = min;
		this.colour = colour;
	}

	public GameValueCard() {
		super();
	}
}
