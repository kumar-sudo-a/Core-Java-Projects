package com.cards;

public class Card { //This is a POJO class 

	private Rank rank;
	private Suit suit;
	
	public Card(Rank rank, Suit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}
}