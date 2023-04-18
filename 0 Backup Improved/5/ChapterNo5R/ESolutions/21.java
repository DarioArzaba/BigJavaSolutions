/* 

21.- Write a program that reads in three strings and sorts them lexicographically.
	
	Enter three strings:
	
	Charlie Able Baker
	
	Able
	Baker
	Charlie

*/

import java.util.Scanner;

public class LexicoGraphicallyOrderThreeStrings {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the First String : " );
		String n1 = input.next();
		
		System.out.print("Enter the Second String : " );
		String n2 = input.next();
		
		System.out.print("Enter the Second String : " );
		String n3 = input.next();
		
		String[] words = new String[3];
		words[0] = n1;
		words[1] = n2;
		words[2] = n3;
		
		for(int i = 0; i < 2; ++i) {
			for (int j = i + 1; j < 3; ++j) {
				if (words[i].compareTo(words[j]) > 0) {
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(words[i]);
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}

