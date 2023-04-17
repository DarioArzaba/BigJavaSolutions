/* 

9.- Which of the following are legal identifiers?

A.  A java identifier needs to start with a letter, a currency character, or a connecting character, everything else as a starting character is prohibited. Also they cannot contain spaces or be identical with reserved keywords.

Based on the previews rules:

Greeting1: Starts with a letter (G), doesn't have spaces or reserved keywords. Therefore it is legal.
g: Starts with a letter (g), doesn't have spaces or reserved keywords. Therefore it is legal.
void: Starts with a letter (v), doesn't have spaces but (void) is a reserved keyword. Therefore it is illegal.
101dalmatians: It doesn't start with a letter, currency character or connecting character. Therefore it is illegal.
Hello, World: Starts with a letter (H), isn't a reserved keyword but has a space. Therefore it is illegal.
<greeting>: It doesn't start with a letter, currency character or connecting character. Therefore it is illegal.

More info:

Identifiers
https://docs.oracle.com/javase/specs/jls/se8/html/jls-3.html#jls-3.8
Reserved Keywords
https://docs.oracle.com/javase/specs/jls/se8/html/jls-3.html#jls-3.9
Connecting Characters
http://www.fileformat.info/info/unicode/category/Pc/list.htm
Currency Characters:
http://www.fileformat.info/info/unicode/category/Sc/list.htm

*/

public class ValidIdentifiers {
		
	public static void main(String[] args){
		
		//Search all characters
		for (int i = Character.MIN_CODE_POINT; i <= Character.MAX_CODE_POINT; i++) {
			
			//If a character is considered a valid identifier start character
			//And it is not in the alphabet (a-z)
			//Print it
		    if (Character.isJavaIdentifierStart(i) && !Character.isAlphabetic(i)){
		    	System.out.print((char) i + " ");
		    }
		        
		}
		
		System.exit(0);
		
	}

}

