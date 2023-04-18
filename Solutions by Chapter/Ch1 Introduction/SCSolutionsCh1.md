/* 

1.- What is required to play music on a computer?

* The music information, stored on the cloud, a hard drive or other media such as a CD, USB, SD, etc.
* A peripheral that can read the information stored in the media, such as a CD reader or USB port.
* Software that is compatible with the format or way the music information was stored, such as MP3, WAV or FLAC.
* Another peripheral that can translate the information that the software interprets into sounds, such as speakers.

*/
/* 

10.- What do you do to protect yourself from data loss when you work on programming projects?

A. Backup your files, either locally or through a remote service.

*/
/* 

11.- How do you modify the HelloPrinter program to greet you instead?

A. By changing the string argument of the System.out.println() method. 

*/

public class HelloPrinter {
	public static void main(String[] args) {
		System.out.println("Hello, Dario!");
		System.exit(0);
	}
}
/* 

12.- How would you modify the HelloPrinter program to print the word “Hello” vertically?

A. By changing the string argument of the System.out.println() method and calling the method once per letter.

*/

public class HelloPrinter {
	public static void main(String[] args) {
		System.out.println("H");
		System.out.println("e");
		System.out.println("l");
		System.out.println("l");
		System.out.println("o");
		System.exit(0);
	}
}
/* 

13.- Would the program continue to work if you replaced line 7 with this statement?

System.out.println(Hello);

A. No. This method expects a string as it's argument, and all strings must be inside double quotes.

Since Hello is not inside double quotes Java thinks it then Hello MUST be a variable with a String inside.
But that isn't the case, we haven't created a Hello variable, so the program looks for it in vain.
Finally, it generates an error telling us that it failed to find the Hello variable:

- Hello cannot be resolved into a variable.

*/

public class HelloPrinter {
	public static void main(String[] args) {
		System.out.println(Hello);
		System.exit(0);
	}
}
/* 

14.- What does the following set of statements print?

System.out.print("My lucky number is ");
System.out.println(3 + 4 + 5);

A. It prints: 

My lucky number is 12

Note that the method System.out.print() didn't introduce a carriage return but System.out.println() did.
Also note that the numeric result (12) is transformed automatically into a String.

*/

public class HelloPrinter {
	public static void main(String[] args) {
		System.out.print("My lucky number is ");
		System.out.println(3 + 4 + 5);
		System.exit(0);
	}
}
/* 

15.- What do the following statements print?

System.out.println("Hello");
System.out.println("");
System.out.println("World");

A. It prints:

Hello

World

Note that the empty string still prints out a carriage return because we are using the method println().

*/

public class HelloPrinter {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("");
		System.out.println("World");
		System.exit(0);
	}
}

/* 

16.- Suppose you omit the "" characters around Hello, World! from the HelloPrinter.java program. Is this a compile-time error or a run-time error?

A. It's a compile-time error. The program won't be even able to run until we fix it.

Error: Hello cannot be resolved to a variable

*/

public class HelloPrinter {
	public static void main(String[] args) {
		System.out.println(Hello, World!);
		System.exit(0);
	}
}
/* 

17.- Suppose you change println to printline in the HelloPrinter.java program. Is this a compile-time error or a run-time error?

A. It's a compile-time error. The program won't be even able to run until we fix it.

Error: The method printline(String) is undefined for the type PrintStream

*/

public class HelloPrinter {
	public static void main(String[] args) {
		System.out.printline("Hello, World!");
		System.exit(0);
	}
}
/* 

18.- Suppose you change main to hello in the HelloPrinter.java program. Is this a compile-time error or a run-time error?

A. It's a run-time error. The program will be successfully compiled and executed. However the JVM will search for a main method and will not be able to find one, terminating the program prematurely.

Error: The main method was not found in the HelloPrinter class, define the main method as follows: public static void main (String [] args) otherwise, you must extend a JavaFX application class (javafx.application.Application)

*/

public class HelloPrinter {
	public static void hello(String[] args) {
		System.out.println("Hello, World!");
		System.exit(0);
	}
}
/* 

19.- When you used your computer, you may have experienced a program that “crashed” (quit spontaneously) or “hung” (failed to respond to your input). Is that behavior a compile-time error or a run-time error?

A. They are run-time errors. The program was succesfully compiled and will run up to a certain point.

*/
/* 

2.- Why is a CD player less flexible than a computer?

A. Because the hardware and software of this device where designed specifically to play music and not much else. Whereas a computer can do this task an many others just by interchanging its software and some of its peripherals.

*/
/* 

20.- Why can’t you test a program for run-time errors when it has compiler errors?

A. Because in order to run the program it had to be successfully compiled into an executable that the computer can run. If it has compiler errors we won't be able to get its executable.
 
*/
/* 

21.- Suppose the interest rate was 20 percent. How long would it take for the investment to double?

A. 4 years

*/

public class HelloPrinter {
	public static void main(String[] args) {
		
		int years = 0;
		double interest = 0;
		double balance = 10000;
		double interestPercent = 20;
		double targetBalance = (balance * 2);
		
		while (balance < targetBalance){
			years++;
			interest = ( balance * (interestPercent/100) );
			balance += interest;
		}
		
		System.out.println("Wait " + years + " years for your balance to double.");
		
		System.exit(0);
	}
}
/* 

22.- Suppose your cell phone carrier charges you $29.95 for up to 300 minutes of calls, and $0.45 for each additional minute, plus 12.5 percent taxes and fees. Give an algorithm to compute the monthly charge from a given number of minutes.

A.

If you surpassed your initial 300 minutes
	Get the the extra minutes used by subtracting 300 from the used minutes.
	Get the charge of the extra minutes multiplying them by 0.45
	Get the charge of the taxes multiplying the charge of the extra minutes plus 29.95 by 0.125
	Get the monthly charge by adding the charge of the extra minutes, the charge of the taxes and 29.95.
Else, if you didn't surpassed your initial 300 minutes
	Get the charge of the taxes by multiplying 29.95 by 0.125
	Get the monthly charge by adding the charge of the taxes and 29.95.

*/

public class HelloPrinter {
	public static void main(String[] args) {
		
		//Change this value to see your monthly charge.
		double usedMinutes = 0;
		
		double initialMinutes = 300;
		double initialMinutesCharge = 29.95;
		double extraPerMinute = 0.45;
		double taxesPercent = 12.5;
		
		double extraPerMinuteCharge = 0;
		double taxesCharge = 0;
		double monthlyCharge = 0;
		
		if (usedMinutes > initialMinutes){
			usedMinutes -= initialMinutes;
			extraPerMinuteCharge = (usedMinutes * extraPerMinute);
			taxesCharge = ( (initialMinutesCharge + extraPerMinuteCharge) * (taxesPercent/100) );
			monthlyCharge = initialMinutesCharge + extraPerMinuteCharge + taxesCharge;
		} else {
			taxesCharge = ( initialMinutesCharge * (taxesPercent/100) );
			monthlyCharge = initialMinutesCharge + taxesCharge;
		}
		
		System.out.println("Monthly Charge: $" + monthlyCharge);
		
		System.exit(0);
	}
}
/* 

23.- Consider the following pseudocode for finding the most attractive photo from a sequence of photos. Is this an algorithm that will find the most attractive photo?

	Pick the first photo and call it "the best so far".
	For each photo in the sequence
		If it is more attractive than the "best so far"
			Discard "the best so far".
			Call this photo "the best so far".
	The photo called "the best so far" is the most attractive photo in the sequence.

A. No, until we define exactly what we mean, when we try to compare two of the photos and select the more attractive one.

*/
/* 

24. Suppose each photo in the sequence had a price tag. Give an algorithm for finding the most expensive photo.

A.

Pick the first photo and call it "the most expensive so far".
For each photo in the sequence
	If it is more expensive than the "the most expensive so far"
		Discard "the most expensive so far".
		Call this photo "the most expensive so far".
The photo called "the most expensive so far" is the most expensive photo in the sequence.

*/
/* 

25.- Suppose you have a random sequence of black and white marbles and want to rearrange it so that the black and white marbles are grouped together. Consider this algorithm:

	Repeat until sorted
		Locate the first black marble that is preceded by a white marble, and switch them.
	
What does the algorithm do with the sequence W-B-W-B-B ? Spell out the steps until the algorithm stops.

A.

W-B-W-B-B

B-W-W-B-B
B-W-B-W-B
B-B-W-W-B
B-B-W-B-W

B-B-B-W-W

*/
/* 

26.- Suppose you have a random sequence of colored marbles. Consider this pseudocode:

	Repeat until sorted
		Locate the first marble that is preceded by a marble of a different color, and switch them.

Why is this not an algorithm?

A. It doesn't have the Finiteness property. All algorithms must stop after a finite number of instructions. Here we don't have a clear way of telling the program when it should stop switching the marbles.

*/
/* 

27.- What does this sequence of statements print?

	Rectangle box = new Rectangle(5, 10, 20, 30);
	System.out.println("Before: " + box.getWidth());
	box.translate(25, 40);
	System.out.println("After: " + box.getWidth());

A.

	Before: 20.0
	After: 20.0

Note how the (translate) method from the (Rectangle) class can change the (X) and (Y) values but not the Width of the (box) object.

*/

import java.awt.Rectangle;

public class RectangleOtherBeforeAfter {
		
	public static void main(String[] args){

		Rectangle box = new Rectangle(5, 10, 20, 30);
		System.out.println("Before: " + box.getWidth());
		box.translate(25, 40);
		System.out.println("After: " + box.getWidth());

		System.exit(0);
		
	}

}

/* 

28.- What does this sequence of statements print?

	String greeting = "Hello";
	System.out.println(greeting.toUpperCase());
	System.out.println(greeting);
	
A.

	HELLO
	hello

Note that the method (toUpperCase) is being applied to the (greeting) String object. However, since the changes are not being stored in another variable then after the upper case version is used by (println) it is automatically discarded, returning the String into its lower case version.

*/

public class HelloToLowerCase {
		
	public static void main(String[] args){

		String greeting = "Hello";
		System.out.println(greeting.toUpperCase());
		System.out.println(greeting);

		System.exit(0);
		
	}

}
/* 

29.- Is the toUpperCase method of the String class an accessor or a mutator?

A. Both types of methods can access, use and modify the information of the objects they are being applied to, however only the mutators actually save the changes in the object. In this case the method (toUpperCase) from the (String) class is an accessor since it doesn't save its changes into the original String.

*/
/* 

3.- What does a computer user need to know about programming in order to play a video game?

A. In principle, nothing. The videogame is a tipe of software that was previously programmed and the final user only interacts with the end result of such programming. But, like many other software, if the user wanted to adapt or modify the videogame then some programming knowledge would be required.

*/
/* 

30.- Which call to translate is needed to move the rectangle so that its top-left corner is at the origin (0, 0)?

	Rectangle box = new Rectangle(5, 10, 20, 30);

A.
	box.translate(-5, -10);

*/

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

class RectangleComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
		box.translate(-5, -10);
		graphicsObj2D.draw(box);
		
	}
}
public class TranslateRectangleToOrigin {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 320, 340);
	    RectangleComponent rectComp = new RectangleComponent();
	    window.add(rectComp);
	    window.setVisible(true);
	    
	}

}


/* 

31.- Look at the API documentation of the String class. Which method would you use to obtain the string "hello, world!" from the string "Hello, World!"?

A. Searching the documentation we find that (toLowerCase), the opposing method of (toUpperCase), does what its name suggests and transforms the alphabetic characters inside the String object to lower case. String class documentation can be found in:

https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#toLowerCase--

*/
/* 

32.- In the API documentation of the String class, look at the description of the trim method. What is the result of applying trim to the string " Hello, Space ! "? (Note the spaces in the string.)

A. Searching the documentation we find that the method (trim) removes the leading and trailing spaces from the String object. Resulting in the String:

	"Hello, Space !"

String class documentation can be found in:

https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#trim--

*/
/* 

33.- Look into the API documentation of the Rectangle class. What is the difference between the methods void translate(int x, int y) and void setLocation(int x, int y)?

A. 

	setLocation Description: Move this Rectangle to the specified Location. Included to parallel the functionality of the (setLocation) method in the Component Class.
	translate Description: Translates this Rectangle the indicated distance, to the right along the X coordinate and downward along the Y coordinate axis. 

From both descriptions we can figure out that the setLocation method moves the rectangle to de specified coordinates ignoring its current location, while the translate method moves the rectangles a number of pixels taking into account its current location.

String class documentation can be found in:

https://docs.oracle.com/javase/8/docs/api/java/awt/Rectangle.html#translate-int-int-

*/

/* 

34.- The Random class is declared in the java.util package. What do you need to do in order to use that class in your program?

A. import the package. To do so you use the keyword (import) at the start of your file, followed by the name of the package.

	import java.util.Random;

*/

/* 

35.- In which package is the BigInteger class located? Look it up in the API documentation.

A. Searching the index we find that BigInteger is inside (java.math).

https://docs.oracle.com/javase/8/docs/api/index-files/index-2.html

*/
/* 

36.- Suppose we had called box.translate(25, 15) instead of box.translate(15, 25). What are the expected outputs?

A. 

	x: 30, y: 25

*/

import java.awt.Rectangle;

public class NewMoveTester {
		
	public static void main(String[] args){
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
		
		box.translate(25, 15);
		System.out.print("x: ");
		System.out.println(box.getX());
		System.out.print("y: ");
		System.out.println(box.getY());
		System.exit(0);
		
	}

}
/* 

37.- Why doesn’t the MoveTester program need to print the width and height of the rectangle?

A. Because the (translate) method we are using doesn't modify the Width and Height of the Rectangle, therefore its dimentions stay the same as when we declared the shape.

*/

import java.awt.Rectangle;

public class GetDimensionsMoveTester {
		
	public static void main(String[] args){
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
		
		box.translate(25, 15);
		System.out.print("x: " + box.getX() + "\n");
		System.out.print("y: " + box.getY() + "\n");
		System.out.print("Width: " + box.getWidth() + "\n");
		System.out.print("Height: " + box.getHeight());
		
		System.exit(0);
		
	}

}

/* 

38.- What is the effect of the assignment String greeting2 = greeting?

A. The contents of greeting are copied over and now make up the contents greeting2. Meaning that both objects now reference the same text message.

*/

public class StringAssignment {
		
	public static void main(String[] args){
		
		String greeting = "Hello, World!";
		String greeting2 = greeting;
		
		System.out.println("Original: " + greeting);
		System.out.println("New: " + greeting2);
		
		System.exit(0);
		
	}

}

/* 

39.- After calling greeting2.toUpperCase(), what are the contents of greeting and greeting2?

A. Nothing. Both variables reference the same message, and since the method (toUpperCase) is an accessor and doesn't modify the original then both variables stay the same.

*/

public class GreetingsAssigmentNew {
		
	public static void main(String[] args){
		
		String greeting = "Hello, World!";
		String greeting2 = greeting;
		greeting2.toUpperCase();
		
		System.out.println("Original: " + greeting);
		System.out.println("New: " + greeting2);
		
		System.exit(0);
		
	}

}
/* 

4.- Where is a program stored when it is not currently running?

A. In a secondary storage device, tipically a hard drive (HD) or solid state drive (SSD).

*/
/* 

40.- How do you display a square frame with a title bar that reads “Hello, World!”?

A. By adding:

	int squareSize = 200;
	window.setSize(squareSize, squareSize);
	window.setTitle("Hello, World!");

*/

import javax.swing.JFrame;

public class FrameWithTitle {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int squareSize = 200;
		window.setSize(squareSize, squareSize);
		window.setTitle("Hello, World!");
	    window.setVisible(true);
	    
	}

}

/* 

41.- How can a program display two frames at once?

A. By constructing and displaying two JFrame objects.

*/

import javax.swing.JFrame;

public class TwoFramesAtOnce {
		
	public static void main(String[] args){
		
		JFrame firstWindow = new JFrame();
		firstWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		firstWindow.setBounds(300, 200, 217, 240);
		firstWindow.setVisible(true);
	    
		JFrame secondWindow = new JFrame();
		secondWindow.setBounds(600, 200, 217, 240);
		secondWindow.setVisible(true);
		
	}

}

/* 

42.- How do you modify the program to draw two squares?

*/

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

class RectangleComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		Rectangle box = new Rectangle(50, 50, 60, 60);
		graphicsObj2D.draw(box);
		box.translate(15, 25);
		graphicsObj2D.draw(box);
		
	}
}
public class DrawTwoSquares {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 220, 240);
		window.setTitle("Two Squares");
	    RectangleComponent rectComp = new RectangleComponent();
	    window.add(rectComp);
	    window.setVisible(true);
	    
	}

}



/* 

43.- How do you modify the program to draw one rectangle and one square?

*/

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

class RectangleComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		Rectangle box = new Rectangle(50, 50, 30, 60);
		graphicsObj2D.draw(box);
		box = new Rectangle(70, 70, 60, 60);
		graphicsObj2D.draw(box);
		
	}
}
public class DrawRectangleAndSquare {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 220, 240);
	    RectangleComponent rectComp = new RectangleComponent();
	    window.add(rectComp);
	    window.setVisible(true);
	    
	}

}
/* 

44.- What happens if you call g.draw(box) instead of g2.draw(box)?

A. A compile time error since the class (Graphics) does not have a (draw) method defined like the class (Graphics2D) does. 

	Error: The method draw(Rectangle) is undefined for the type Graphics

*/
/* 

45.- Give instructions to draw a circle with center (100, 100) and radius 25.

*/

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

class EllipseComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		graphicsObj2D.draw(new Ellipse2D.Double(75, 75, 50, 50));
		
	}
}
public class DrawEllipse {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 217, 240);
	    EllipseComponent ellipseComp = new EllipseComponent();
	    window.add(ellipseComp);
	    window.setVisible(true);
	    
	}

}

/* 

46.- Give instructions to draw a letter “V” by drawing two line segments.

*/

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

class LineComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		graphicsObj2D.setStroke(new BasicStroke(4));
		Line2D.Double segment1 = new Line2D.Double(75, 70, 100, 120);
		graphicsObj2D.draw(segment1);
		Line2D.Double segment2 = new Line2D.Double(100, 120, 125, 70);
		graphicsObj2D.draw(segment2);
		
	}
}
public class LineLetterDraw {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 220, 240);
		LineComponent lineComp = new LineComponent();
	    window.add(lineComp);
	    window.setVisible(true);
	    
	}

}
/* 

47.- Give instructions to draw a string consisting of the letter “V”.

*/

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

class TextComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		Font currentFont = graphicsObj2D.getFont();
		Font newFont = currentFont.deriveFont((float) (currentFont.getSize() * 5.0));
		graphicsObj2D.setFont(newFont);
		
		graphicsObj2D.drawString("V", 80, 100);
		
	}
}
public class TextDrawing {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 217, 240);
	    TextComponent textComp = new TextComponent();
	    window.add(textComp);
	    window.setVisible(true);
	    
	}

}
/* 

48.- What are the RGB color values of Color.BLUE?

A. (0, 0, 255)

Documentation:
https://docs.oracle.com/javase/8/docs/api/java/awt/Color.html#BLUE

*/
/* 

49.- How do you draw a yellow square on a red background?

*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

class LineComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		graphicsObj2D.setColor(Color.RED);
		graphicsObj2D.fill(new Rectangle(0, 0, 200, 200));
		graphicsObj2D.setColor(Color.YELLOW);
		graphicsObj2D.fill(new Rectangle(50, 50, 100, 100));
		
	}
}
public class YellowAndRedSquare {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 215, 237);
		LineComponent lineComp = new LineComponent();
	    window.add(lineComp);
	    window.setVisible(true);
	    
	}

}

/* 

5.- Which part of the computer carries out arithmetic operations, such as addition and multiplication?

A. The CPU (Central Processing Unit), specifically the ALU (Arithmetic Logic Unit) component of the CPU.

*/
/* 

6.- A modern smartphone is a computer, comparable to a desktop computer. Which components of a smartphone correspond to those shown in Figure 3?

Figure 3: Printer, Mouse, Keyboard, Microphone, Ports, CPU, Memory, Disk Controller, Secondary storage, Monitor, Speakers, Network Controller (Internet).

A. The only components that aren't normally part of smartphones are the Mouse and the Printer, although both and many more peripherals can be adapted to the device, tipically through bluetooth.

*/
/* 

7.- What are the two most important benefits of the Java language?

A. Portability and Security.

*/
/* 

8.- How long does it take to learn the entire Java library?

A. Programmers shouldn't try to learn the entire Java library since the benefits of doing so are small compared to the more useful ability of searching through the library as needed. Think about the library in terms of trying to learn the dictionary.

*/
/* 

9.- Where is the HelloPrinter.java file stored on your computer?

A. When using eclipse IDE they are stored by default in:

C:\Users\Owner\workspace\ProyectName\HelloPrinter.java

You can change this location by going to File - Switch Workspace - Other.

*/
