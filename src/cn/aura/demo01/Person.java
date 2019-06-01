package cn.aura.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person {
	private String name;
	Integer[] array = new Integer[5];
	GameValueCard gvc = new GameValueCard();
	String resultstr = "";

	public Integer[] Method(List<Card> San) {
		if (San.get(0).getValue().equals(San.get(1).getValue())
				&& San.get(1).getValue().equals(San.get(2).getValue())) {
			gvc.setLevel(5);
			resultstr += "豹子";
		} else if (San.get(0).type.equals(San.get(1).type) && San.get(1).equals(San.get(2).type)
				&& San.get(0).getRelvalue() + 1 == San.get(1).getRelvalue()
				&& San.get(1).getRelvalue() + 1 == San.get(2).getRelvalue()) {
			gvc.setLevel(4);
			resultstr += "同花顺";
		} else if (San.get(0).type.equals(San.get(1).type) && San.get(1).equals(San.get(2).type)) {
			System.out.println("同花");
			gvc.setLevel(3);
		} else if (San.get(0).getRelvalue() == San.get(1).getRelvalue()
				|| San.get(1).getRelvalue() == San.get(2).getRelvalue()) {
			gvc.setLevel(2);
			resultstr += "一对";
		} else {
			gvc.setLevel(1);
			resultstr += "散牌";
		}
		if (San.get(2).type.equals("♥")) {
			gvc.setColour(4);
		} else if (San.get(2).type.equals("♦")) {
			gvc.setColour(3);
		} else if (San.get(2).type.equals("♠")) {
			gvc.setColour(2);

		} else {
			gvc.setColour(1);
		}
		for (int i = 0; i < San.size(); i++) {
			resultstr += San.get(i).getType() + San.get(i).getValue();
		}

		// {级别,最大牌的值，第二大牌的值，第三大牌的值，最大牌的花色4红桃 2方片}
		gvc.setMax(San.get(2).getRelvalue());
		gvc.setMid(San.get(1).getRelvalue());
		gvc.setMin(San.get(0).getRelvalue());

		array[0] = gvc.getLevel();
		array[1] = gvc.getMax();
		array[2] = gvc.getMid();
		array[3] = gvc.getMin();
		array[4] = gvc.getColour();
		return array;

	}

	public List<Card> getThree(Cards c) {
		List<Card> getList = new ArrayList<Card>();
		Random r = new Random();
		for (int i = 0; i < 3; i++) {
			int num = r.nextInt(c.listAll.size());
			getList.add(c.listAll.get(num));
			c.listAll.remove(c.listAll.get(num));
		}
		return getList;
	}

//	public List<Card> MethodPX(List<Card> q) {
//		q.sort((o1, o2) -> o1.getRelvalue() - o2.getRelvalue());
//		return q;
//	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
