/* 

14.- How can you compute the length of the string "Mississippi"?

A. Strings are objects from the class (String). One of this class methods is (length) which can be used on an String object to return an integer equal to the number of characters it has. The class String and its methods are described in the documentation:

https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#length--

*/

public class StringCharacterCounter {
		
	public static void main(String[] args){
		
		String river = "Mississippi";
		System.out.println("The number of characters in the string " + river + " is " + river.length() );
		System.exit(0);
		
	}

}

