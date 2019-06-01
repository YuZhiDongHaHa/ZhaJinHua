package cn.aura.demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Cards {
	String[] type = { "♥", "♦", "♠", "♣" };
	List<Card> listAll = new ArrayList<Card>();
	

	public Cards() {
		for (int j = 0; j < type.length; j++) {
			int index = 2;
			for (int i = 0; i < 9; i++) {
				listAll.add(new Card(String.valueOf(i + 2), index++, type[j]));
			}
			listAll.add(new Card("J", index++, type[j]));
			listAll.add(new Card("Q", index++, type[j]));
			listAll.add(new Card("K", index++, type[j]));
			listAll.add(new Card("A", index++, type[j]));
		}
//		for (Card card : listAll) {
//			System.out.println(card.toString());
//		}
	}
}
