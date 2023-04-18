/* 

12.- Write a program that prompts the user for the drive letter (C), the path (\Windows\System), the file name (Readme), and the extension (txt). Then print the complete file name C:\Windows\System\Readme.txt.

*/

import java.util.Scanner;

public class PathStringCreator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		StringBuilder path = new StringBuilder();
		
		System.out.print("Enter Drive Letter    :  " );
		
		path.append(input.next());
		
		System.out.print("Enter the Path        :  " );
		
		path.append(input.next());
		
		System.out.print("Enter the File Name   :  " );
		
		path.append("\\");
		path.append(input.next());
		
		
		System.out.print("Enter Extension       :  " );
		
		path.append(".");
		path.append(input.next());
		
		
		System.out.println("PATH                  : " + path );
		
		System.exit(0);
		
	}
	
}