/* 

19.- Write a program that takes user input describing a playing card in the following shorthand notation:
	
	A Ace
	2 ... 10 Card values
	J Jack
	Q Queen
	K King
	D Diamonds
	H Hearts
	S Spades
	C Clubs
	
Your program should print the full description of the card. For example,
	
	Enter the card notation: QS
	Queen of Spades
	
If the notation is incorrect return unknown.

*/

import java.util.Scanner;

public class CardPlayingInputNames {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the card notation : " );
		String card = input.next();
		
		String result = "";
		boolean correct = true;
		
		if (card.length() >= 3) {
			correct = false;
		}
		
		if (card.substring(0,1).equals("1") && card.substring(1,2).equals("0")){
			result = "10";
		} else if (card.substring(0,1).equals("2") && card.length() == 1) {
			result = "2";
		} else if (card.substring(0,1).equals("3") && card.length() == 1) {
			result = "3";
		} else if (card.substring(0,1).equals("4") && card.length() == 1) {
			result = "4";
		} else if (card.substring(0,1).equals("5") && card.length() == 1) {
			result = "5";
		} else if (card.substring(0,1).equals("6") && card.length() == 1) {
			result = "6";
		} else if (card.substring(0,1).equals("7") && card.length() == 1) {
			result = "7";
		} else if (card.substring(0,1).equals("8") && card.length() == 1) {
			result = "8";
		} else if (card.substring(0,1).equals("9") && card.length() == 1) {
			result = "9";
		} else if ( card.substring(0,1).equals("Q") ) {
			result = "Queen";
		} else if ( card.substring(0,1).equals("J") ) {
			result = "Jack";
		} else if ( card.substring(0,1).equals("K") ) {
			result = "King";
		} else if ( card.substring(0,1).equals("A") ) {
			result = "Ace";
		} else {
			result = "Unknown";
		}
		
		
		if (card.length() == 2 && card.substring(1,2).equals("D")) {
			result += " of Diamonds";
		} else if (card.length() == 2 && card.substring(1,2).equals("H")) {
			result += " of Hearts";
		} else if (card.length() == 2 && card.substring(1,2).equals("S")) {
			result += " of Spades";
		} else if (card.length() == 2 && card.substring(1,2).equals("C")) {
			result += " of Clubs";
		} else {
			if (!result.equals("Ace")){
				result = "Unknown";
			}
		}
		
		if (!correct){
			result = "Unknown";
		}
		
		System.out.println(result);
		
		input.close();
		
		System.exit(0);
		
	}
	
}