/* 

10.- French country names are feminine when they end with the letter e, masculine otherwise, except for the following which are masculine even though they end with e:
	
	• le Belize
	• le Cambodge
	• le Mexique
	• le Mozambique
	• le Zaïre
	• le Zimbabwe
	
Write a program that reads the French name of a country and adds the article: le for masculine or la for feminine, such as le Canada or la Belgique. However, if the country name starts with a vowel, use l’; for example, l’Afghanistan. For the following plural country names, use les:
	
	• les Etats-Unis
	• les Pays-Bas

*/

import java.util.Scanner;

public class CountryNamesInFrench {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Country name : " );
		String n = input.next();
		
		String name = n.toLowerCase();
		String f = name.substring(0,1);
		String l = name.substring(name.length()-1, name.length());
		boolean isVowel = f.equals("a")||f.equals("e")||f.equals("i")||f.equals("o")||f.equals("u");
		boolean isExeption = n.equals("Belize")||n.equals("Cambodge")||n.equals("Mexique")||n.equals("Mozambique")||n.equals("Zaïre")||n.equals("Zimbabwe");
		boolean isFeminine = l.equals("e");
		
		if (name.equals("etats-unis") || name.equals("pays-bas")){
			n = "les " + n;
		} else if (isVowel){
			n = "l'" + n;
		} else if (isExeption){
			n = "le " + n;
		} else if (isFeminine) {
			n = "la " + n;
		} else {
			n = "le " + n;
		}
		
		System.out.println("Country : " + n );
		
		input.close();
		
		System.exit(0);
		
	}
	
}
