package cn.aura.demo01;


public class Card {
	private String value;
	private int relvalue;
	String type;
	
	@Override
	public String toString() {
		return "Card ["+type + value+"]";
	}

	public Card() {
		super();
	}

	public Card(String value, int relvalue, String type) {
		super();
		this.value = value;
		this.relvalue = relvalue;
		this.type = type;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public int getRelvalue() {
		return relvalue;
	}

	public void setRelvalue(int relvalue) {
		this.relvalue = relvalue;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
