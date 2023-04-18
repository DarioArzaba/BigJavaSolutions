

1. In Java, objects are grouped into classes according to their behavior. Would a window object and a water heater object belong to the same class or to different classes? Why?
	* In different classes because the serve completely different purposes. The window's behavior is to let in light from the exterior, the water heater on the other hand exists only to heat water.
2. Some light bulbs use a glowing filament, others use a fluorescent gas. If you consider a light bulb a Java object with an “illuminate” method, would you need to know which kind of bulb it is?
	* Not really. In this case the most important thing is that the method behaves accordingly to its expected result, such as lighting up the room to a certain degree, if it can do it consistently then how it does it (implementation) becomes irrelevant.
3. What actually happens when you try to call the following? `"Hello, World".println(System.out)`: `Error. The method println(PrintStream) is undefined for the type String.`
	* The compiler treats the object inside double quotes `Hello, World` as an object from the class String. The dot means we are trying to call its method `println`, however the class `String` as per the Java docs does not have a `println` method available, and we end up with a compile-time error.
	* On the same note, the object `System.out` from the `PrintStream` class does indeed have a defined (println) method.
4. What is wrong with the following variable declaration? `int miles per gallon = 39.4`
	* You can't have spaces in a variable name, use underscores or CamelCase instead.
	* The data type `int` can't hold numeric values that have a decimal component, use `double` instead. 
	* There is a missing semicolon at the end of the statement.
	* Correct statement: `double milesPerGallon = 39.4;`
5. Declare and initialize two variables, `unitPrice` and `quantity`, to contain the unit price of a single item and the number of items purchased. Use reasonable initial values.

```java
public class UnitPriceAndQuantity {
	public static void main(String[] args){
		double unitPrice = 0.86;
		int quantity = 4;
		System.out.println("Apples Price : $" + unitPrice);
		System.out.println("Units : " + quantity);
		System.exit(0);
	}
}
```

6.- Use the variables declared in the previous question to display the total purchase price.

```java
public class TotalPrice {
	public static void main(String[] args){
		double unitPrice = 0.86;
		int quantity = 4;
		System.out.println("Apples Price : $" + unitPrice);
		System.out.println("Units : " + quantity);
		System.out.println("Total Price : $" + (unitPrice*quantity));
		System.exit(0);
	}
}
```

7. What are the types of the values `0` and `"0"`?
	* `int` and `String`
8. Which number type would you use for storing the area of a circle?
	* Normally when working with the area of geometric shapes you are going to encounter a decimal component in the number, so the best data type would be: `double`
9. Which of the following are legal identifiers?
	* A java [identifier](https://docs.oracle.com/javase/specs/jls/se20/html/jls-3.html#jls-3.8) needs to start with a letter, a currency character, or an underscore. They cannot contain spaces or be identical with reserved [keywords](https://docs.oracle.com/javase/specs/jls/se20/html/jls-3.html#jls-3.9). Based on the previous rules:
	* Greeting1: Starts with a letter (G), doesn't have spaces or reserved keywords. Therefore it is legal.
	* g: Starts with a letter (g), doesn't have spaces or reserved keywords. Therefore it is legal.
	* void: Starts with a letter (v), doesn't have spaces but (void) is a reserved keyword. Therefore it is illegal.
	* 101dalmatians: It doesn't start with a letter, currency character or connecting character. Therefore it is illegal.
	* Hello, World: Starts with a letter (H), isn't a reserved keyword but has a space. Therefore it is illegal.

```java
public class ValidInitialIdentifiers {
	public static void main(String[] args){
		for (int i = Character.MIN_CODE_POINT; i <= Character.MAX_CODE_POINT; i++) {
		    if (Character.isJavaIdentifierStart(i) && !Character.isAlphabetic(i)){
		    	System.out.print((char) i + " ");
		    }
		}
		System.exit(0);
	}
}
```

10.- Declare a variable to hold your name. Use camel case in the variable name.

```java
public class MyNamePrinter {
	public static void main(String[] args){
		String myName = "Dario";
		System.out.println("My name is " + myName);
		System.exit(0);
	}
}
```

11. Is `12 = 12` a valid expression in the Java language? `Error. The left-hand side of an assignment must be a variable`
	* No. The left hand side of the assignment operator must be a variable, and (12) is not a valid variable identifier (see question 9) name.
12. How do you change the value of the greeting variable to `"Hello, Nina!"`?

```java
public class NewHelloPrinter {
	public static void main(String[] args){
		String greeting = "Hello";
		greeting = "Hello, Nina!";
		System.out.println("Robot says : " + greeting);
		System.exit(0);
	}
}
```
13. How would you explain assignment using the parking space analogy?
	* Variables are like parking spaces of different sizes. When we create a new parking space we define its size via its data type. Parking spaces usually are identifiable by a number, after defining its size we can specify our own identifier. Finally, we can store a car of the appropriate size inside the parking space.
	* Once created the parking space will stay there. If we need to store a different car the current car must move and the new car must be of the appropriate size.

```java
public class ParkingSpaceAnalogy {
	public static void main(String[] args){
		int A33;
		A33 = 2;
		A33 = 3;
		System.out.println("On the parking space A33 there is a car with the number " + A33 );
		System.exit(0);
	}
}
```

14. How can you compute the length of the string "Mississippi"?
	* Strings are objects from the class `String`. One of its class methods is `length` which can be used on an String object to return an integer equal to the number of characters. The class String and its methods are described in the [String API](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/String.html) documentation.

```java
public class StringCharacterCounter {
	public static void main(String[] args){
		String river = "Mississippi";
		System.out.println("The number of characters in the string " + river + " is " + river.length() );
		System.exit(0);
	}
}
```

15. How can you print out the uppercase version of `"Hello, World!"`?
	* Strings are objects from the class `String`. One of its class methods is `toUpperCase` which can be used on an String object to return the same String but with lower case alphabetic characters turned into upper case. The class String and its methods are described in the [String API](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/String.html) documentation.

```java
public class GreetingToUpperCase {
	public static void main(String[] args){
		String greeting = "Hello, World!";
		System.out.println("The upper case version of " + greeting + " is " + greeting.toUpperCase() );
		System.exit(0);
	}
}
```

16. Is it legal to call `river.println()`? Why or why not? `Error: The method println() is undefined for the type String`
	* Strings are objects from the class `String`. The method `println` is not defined for String objects, so the instance `river` cannot make use of this method. However the class `PrintStream` that the object `System.out` pertains to, does define a `println` method. The class String and its methods are described in the [String API](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/String.html) documentation.
17. What are the arguments in the method call `river.replace("p", "s")`?
	* Arguments are comma separated lists of values that methods need to function as intended. The list goes inside the parenthesis that accompany all methods. Some methods do not need any arguments, in that case the parenthesis remains empty. 
	* In this case the method `replace`, being applied to the object `river` as defined by the `String` class  uses two arguments, the strings `"p"` and `"s"`.
18. What is the result of the call `river.replace("p", "s")`?
	* `"Missississi"`

```java
public class ReplaceLetters {
	public static void main(String[] args){
		String river = "Mississippi";
		System.out.println("Replacing the (p)'s with (s)'s in " + river + " becomes " + river.replace("p","s") );
		System.exit(0);
	}
}
```

19. What is the result of the call `greeting.replace("World", "Dave").length()`?
	* 12

```java
public class ReplacingWords {
	public static void main(String[] args){
		String greeting = "Hello, World!";
		String oldPart = "World";
		String newPart = "Dave";
		System.out.println("The number of characters in the String " + greeting + " is " + greeting.length() );
		System.out.println("By replacing " + oldPart + " with " + newPart + " the number of characters becomes " + greeting.replace("World", "Dave").length() );
		System.exit(0);
	}
}
```

20. How is the `toUpperCase` method declared in the `String` class?
	* Defined As: public String toUpperCase()
	* Description: Converts all of the characters of the String to upper case.
	* Returns: The same String, with its contents converted to uppercase.

21. How do you construct a square with center `(100, 100)` and side length of `20`?

```java
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

class RectangleComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;		
		Rectangle centeredSquare = new Rectangle(90, 90, 20, 20);
		graphicsObj2D.draw(centeredSquare);
	}
}

public class SquareCenterDisplay {		
	public static void main(String[] args){
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 217, 240);
	    RectangleComponent rectComp = new RectangleComponent();
	    window.add(rectComp);
	    window.setVisible(true);
	}
}
```

22. Initialize the variables `box` and `box2` with two rectangles that touch each other.

```java
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

class RectangleComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		Rectangle box = new Rectangle(30, 30, 60, 40);
		graphicsObj2D.draw(box);
		Rectangle box2 = new Rectangle(90, 50, 50, 35);
		graphicsObj2D.draw(box2);
	}
}

public class RectanglesTouchEachOther {
	public static void main(String[] args){
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 320, 340);
	    RectangleComponent rectComp = new RectangleComponent();
	    window.add(rectComp);
	    window.setVisible(true);
	}
}
```

23. The `getWidth` method returns the width of a `Rectangle` object. What does the following statement print? `System.out.println(new Rectangle().getWidth());`
	* 0.0

```java
import java.awt.Rectangle;
public class GetWidthMethod {
	public static void main(String[] args){
		System.out.println("The Width of a newly created Rectangle is " + (new Rectangle().getWidth()));
		System.exit(0);
	}
}
```

24. The `PrintStream` class has a constructor whose argument is the name of a file. How do you construct a `PrintStream` object with the construction argument `"output.txt"`? `new PrintStream("output.txt");`
	* To call the constructor of a class and create a new object we use the keyword `new` followed by the class name `PrintStream` as a method, meaning that we add parenthesis. Different constructors will require different arguments and that's how we differentiate them.
25. Write a statement to save the object that you constructed in the previous question, inside a variable.
	* To save a newly created object from the `PrintStream` class, we need to use a variable with the `PrintStream` class as its data type followed by its identifier: `Data Type varName = createObjKeyword classConstructor(ConstructorArguments);`

```java
PrintStream out = new PrintStream("output.txt");
```

26. What does this sequence of statements print?

```java
Rectangle box = new Rectangle(5, 10, 20, 30);
System.out.println("Before: " + box.getX());
box.translate(25, 40);
System.out.println("After: " + box.getX());
```

* They print:

```java
Before: 5.0
After: 30.0
```

* Note how by using the `translate` method from the `Rectangle` class we managed to changed the `X` value of the `box` object.

```java
import java.awt.Rectangle;
public class RectanglePrintBeforeAfter {
	public static void main(String[] args){
		Rectangle box = new Rectangle(5, 10, 20, 30);
		System.out.println("Before: " + box.getX());
		box.translate(25, 40);
		System.out.println("After: " + box.getX());
		System.exit(0);
	}
}
```

27. What does this sequence of statements print?

```java
Rectangle box = new Rectangle(5, 10, 20, 30);
System.out.println("Before: " + box.getWidth());
box.translate(25, 40);
System.out.println("After: " + box.getWidth());
```

* They print:

```java
Before: 20.0
After: 20.0
```

* Note how by using the `translate` method from the `Rectangle` class we managed to changed the `X` and `Y` values but not the `Width` of the `box` object.

```java
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
```

28. What does this sequence of statements print?

```java
String greeting = "Hello";
System.out.println(greeting.toUpperCase());
System.out.println(greeting);
```

* They print:

```java
HELLO
hello
```

* Note that the method `toUpperCase` is being applied to the `greeting` String object. However, since the changes are not being stored in another variable then after the upper case version is used by `println` it is automatically discarded.

```java
public class HelloToLowerCase {	
	public static void main(String[] args){
		String greeting = "Hello";
		System.out.println(greeting.toUpperCase());
		System.out.println(greeting);
		System.exit(0);
	}
}
```

29. Is the `toUpperCase` method of the `String` class an accessor or a mutator?
	* Both accessor and mutator methods can access, use and modify the information of the objects they are being applied to, however only mutators can actually save the changes into the object.
	* In this case the method `toUpperCase` is an accessor since it doesn't save its changes into the original `String` object.

30. Which call to translate is needed to move the rectangle `Rectangle box = new Rectangle(5, 10, 20, 30);` so that its top-left corner is at the origin `(0, 0)`? `box.translate(-5, -10);`

```java
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
```

31. Look at the API documentation of the `String` class. Which method would you use to obtain the string `"hello, world!"` from the string `"Hello, World!"`?
	* Searching the documentation we find that `toLowerCase`, does what its name suggests and transforms the alphabetic characters inside the `String` object to lower case.
32. In the API documentation of the `String` class, look at the description of the `trim` method. What is the result of applying trim to the string `" Hello, Space ! "`?
	* Searching the documentation we find that the method `trim` removes the leading and trailing spaces from a `String` object, resulting in: `"Hello, Space !"`
33. Look into the API documentation of the `Rectangle` class. What is the difference between the methods `void translate(int x, int y)` and `void setLocation(int x, int y)`?
	* setLocation: Move this `Rectangle` to the specified Location. Included to parallel the functionality of the `setLocation` method in the Component Class.
	* translate: Translates this `Rectangle` the indicated distance to the right along the `X` coordinate and downward along the `Y` coordinate axis. 
	* From both descriptions we can figure out that the `setLocation` method moves the rectangle to de specified coordinates ignoring its current location, while the `translate` method moves the rectangles a number of pixels taking into account its current location.
34. The `Random` class is declared in the `java.util` package. What do you need to do in order to use that class in your program?
	* Import the package. To do so you use the keyword `import` at the start of your file, followed by the name of the package: `import java.util.Random;`
35. In which package is the `BigInteger` class located? Look it up in the API documentation.
	* Searching the API index we find that `BigInteger` is inside `java.math`.
36. Suppose we had called `box.translate(25, 15)` instead of `box.translate(15, 25).` What are the expected outputs? 

```java
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
```

* They print:

```java
x: 30
y: 25
```

37. Why doesn’t the `MoveTester` program need to print the `width` and `height` of the rectangle?
	* Because the `translate` method we are using doesn't modify the `Width` and `Height` of the Rectangle, therefore its dimensions stay the same using them only to declare the overall shape.

```java
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
```

38. What is the effect of the assignment `String greeting2 = greeting`?
	* The contents of `greeting` are copied over and now make up the contents `greeting2`. Meaning that both objects now reference the same text sequence.

```java
public class StringAssignment {
	public static void main(String[] args){
		String greeting = "Hello, World!";
		String greeting2 = greeting;
		System.out.println("Original: " + greeting);
		System.out.println("New: " + greeting2);
		System.exit(0);
	}
}
```

39. After calling `greeting2.toUpperCase()`, what are the contents of `greeting` and `greeting2`?
	* Nothing. Both variables reference the same message, and since the method `toUpperCase` is an accessor it doesn't modify the original so both variables remain the same.

```java
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
```

40. How do you display a square frame with a title bar that reads `“Hello, World!”`?

```java
import javax.swing.JFrame;
public class FrameWithTitle {	
	public static void main(String[] args){
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int squareSize = 500;
		window.setSize(squareSize, squareSize);
		window.setTitle("Hello, World!");
	    window.setVisible(true);
	}
}
```

41. How can a program display two frames at once?
	* By constructing and displaying two independent `JFrame` objects.

```java
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
```

42. How do you modify the program to draw two squares?

```java
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
```

43. How do you modify the program to draw one rectangle and one square?

```java
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
```

44. What happens if you call `g.draw(box)` instead of `g2.draw(box)`? `Error: The method draw(Rectangle) is undefined for the type Graphics`
	* A compile time error since the class `Graphics` does not have a `draw` method defined like the class `Graphics2D` does.
45. Give instructions to draw a circle with center `(100, 100)` and radius `25`.

```java
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
```

46. Give instructions to draw a letter “V” by drawing two line segments.

```java
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
```

47. Give instructions to draw a string consisting of the letter `“V”`.

```java
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
```

48. What are the RGB color values of `Color.BLUE`?
	* (0, 0, 255) as defined in the [awt package docs](https://docs.oracle.com/en/java/javase/20/docs/api/java.desktop/java/awt/Color.html#blue).
49. How do you draw a yellow square on a red background?

```java
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;
class SquareComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		graphicsObj2D.setColor(Color.RED);
		graphicsObj2D.fill(new Rectangle(0, 0, 200, 200));
		graphicsObj2D.setColor(Color.YELLOW);
		graphicsObj2D.fill(new Rectangle(50, 50, 100, 100));
	}
}
public class DisplayYellowSquareRedBackground {
	public static void main(String[] args){
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 215, 237);
		SquareComponent component = new SquareComponent();
	    window.add(component);
	    window.setVisible(true);
	}
}
```