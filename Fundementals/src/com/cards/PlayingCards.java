package com.cards;

// Create a Array of 52 Cards : 13 X 4 
// 13 : Rank , 4 : Suit

public class PlayingCards {

	public static void main(String[] args) {
		
		/*
		 * System.out.println(Rank.ACE);  
		 * o/p: ACE
		 *
		 *  //ordinal will return the position starting from 0
		 * System.out.println(Rank.KING.ordinal());
		 * o/p: 12
		 * 
		 * System.out.println(Rank.KING.getValue());
		 * o/p: 13
		 */

		
		Card[] cards = new Card[52]; // Array of Cards with size 52
		int index = 0; // initial value
		for(Suit s: Suit.values()) { //for each loop, it will pick 1 value at a time, 4 times
			for(Rank r: Rank.values()) { //inner loop, will run 13 times
				Card c = new Card(r, s);
				cards[index] = c; 
				index++; // post incrementing 
			}
		}
		
		System.out.println("Size of card: " + cards.length);
		
		for(Card c : cards) { //for each loop
			System.out.println(c.getRank() + " of " + c.getSuit() + " - Value of card = " + c.getRank().getValue());
		}
	}
}