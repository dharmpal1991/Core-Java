package com.dharmpal.enumQuestion;

public enum Vegitable {
	Pattao(90), Tomato(30), Ladyfinger(50), onion(40), Mint(100), GreenCheeli(
			30);
	int price;

	Vegitable(int price) {
		this.price = price;
	}

	Vegitable() {
		this.price = 100;
	}

	public int getPrice() {
		return price;
	}

}
