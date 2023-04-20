
# R Solutions Chapter 2

1. Explain the difference between an object and a class.
	* An object is an entity with status and behavior, that status and behavior will be defined by the class it belongs to, that's why we say that classes are like blueprint's from which we can create different objects.
2. Give three examples of objects that belong to the `String` class. Give an example of an object that belongs to the `PrintStream` class. Name two methods that belong to the `String` class but not the `PrintStream` class. Name a method of the `PrintStream` class that does not belong to the `String` class.

```java
String letters = "abc";
String greeting = "Hello";
String name = "dario";
PrintStream printText = System.out;
letters.toUpper();
greet.length();
printText.println(name);
```

3. What is the public interface of a class? How does it differ from the implementation of a class?
	* The public interface is the part of a class that it's visible to the programmer, this part sets the tools needed to create and modify new objects that belong to the class. The hidden implementation of the class are the detailed instructions needed for the tools to execute their tasks. The programmer only needs to know the public interface in order to use these tools.
6. What is wrong with the following sequence of statements?

```java
int mystery = 1;
mystery = mystery + 1;
int mystery = 1 - 2 * mystery;
```

* You are creating two variables with the same identifier, now Java doesn't have a way to discern between the two and generates a compile time error.

```
Error: Duplicate local variable mystery
```

7. Explain the difference between the `=` symbol in Java and in mathematics.
	* In mathematics it means that both sides are equivalent or equal, so they represent the same value. In java (and most programming languages), it means that you are assigning the value on the right side to the variable (container) on the left side.
8. Give an example of a method that has an argument of type `int`. Give an example of a method that has a return value of type `int`. Repeat for the type `String`.

```java
Integer.hashCode(1);  
Integer.bitCount(1); 
Integer.parseInt("1"); 
Integer.toString(1);
```

12. Explain the difference between an object and an object variable.
	* An object is an actual entity created with a class, upon creation its various contents are hidden and scattered in memory. 
	* An object variable stores a reference (object reference) to the (combined) location in memory (addresses) where all the contents of the object are stored, and it's our main way to access those contents. 
	* Modifying an object variable does not modify the object, it only modifies the object reference. We say that an object has multiple object variables when they all reference it's location in memory.
18. Find the errors in the following statements:

```java
Rectangle r = (5, 10, 15, 20);
double width = Rectangle(5, 10, 15, 20).getWidth();
Rectangle r; r.translate(15, 25);
r = new Rectangle(); r.translate("far, far away!");
```

* The errors are:
	* A reference to a `Rectangle` object called `r` is being assigned what seems to be an Object. However to create an object you need the keyword `new` fallowed by the name of the class as a constructor. The correct version would be: `Rectangle r = new Rectangle(5,10,15,20);`
	* You cannot use a method `getWidth` with a class constructor but you can use it with an object by accessing the object via its object variable. The correct version would be: `Rectangle r = new Rectangle(5,10,15,20); double width = r.getWidth();`
	* The object variable hasn't been initialized with a constructor. The correct version would be: `Rectangle r = new Rectangle(5,10,15,20); r.translate(15,25);`
	* The object variable needs to have its variable type at the start, before the identifier `r`. Also the method `translate` of the `Rectangle` class does not accept `Strings` as arguments, only numeric integrals `int`. The correct version would be: `Rectangle r = new Rectangle(); r.translate(15,25);`
19. Name two accessor methods and two mutator methods of the `Rectangle` class.
	* Accessor: `getX();`, `getY();`
	* Mutator: `translate();`, `size();`
20. Consult the API documentation to find methods for:
	* Concatenating two strings, that is, making a string consisting of the first string, followed by the second string.
	* Removing leading and trailing white space of a string.
	* Converting a rectangle to a string.
	* Computing the smallest rectangle that contains two given rectangles.
	* Returning a random floating-point number.

```
Concatenating: Class = java.lang.String
Method Name = concat, Return Type = String, Types of Arg = (String)

Removing White Space: Class = java.lang.String
Method Name = trim, Return Type = String, Types of Arg = (N/A)

Rectangle to String: Class = java.awt.Rectangle
Method Name = toString, Return Type = String, Types of Arg = (N/A)

Smallest Rectangle: Class = java.awt.Rectangle
Method Name = union, Return Type = Rectangle, Types of Arg = (Rectangle)

Return Random float: Class = java.util.Random
Method Name = nextDouble, Return Type = Double, Types of Arg = (N/A)
```

21. Explain the difference between an *object* and an *object reference*.
	* Already explained in question 22. An *object reference* is the representation of an *object* (through it's memory location) that we store in an object variable.
22. What is the difference between a console application and a graphical application?
	* In a console application you can only get the input and output information through text, while on a graphical app you can get the information in other ways such as pixels, shapes, images, video, panels, textboxes, buttons, handles, sliders etc.
23. Who calls the `paintComponent` method of a component? When does the call to the `paintComponent` method occur?
	* The window `JComponent` calls the `paintComponent` method, whenever `JFrame` requests it. It can be requested by various reasons, including when the window is resized. The reasons are described by the `Event Dispatch Thread` of the `Swing` library.
24. Why does the argument of the `paintComponent` method have type `Graphics` and not `Graphics2D`?
	* Legacy Code. `Graphics` was originally the primitive data type defined by the `paintComponent` method, back then it was enough. As the graphic requirements grew instead of replacing the `Graphics` object, we simply extended its functionality with more advanced methods from  `Graphics2D`.
25. What is the purpose of a graphics context?
	* A graphics context represents a drawing destination, it's purpose is to allow for the display of non-text-based information.
26. Why are separate viewer and component classes used for graphical programs?
	* The viewer class `JFrame` cannot be worked on directly, it doesn't have a working `paintComponent` method that gets called automatically for modular programming reasons (it is easier to add multiple components). So generally components have to be created separately, and then added to the viewer window using the `add()` method.
27. How do you specify a text color?
	* By using the `setColor(Color)` method defined by the `Graphics2D` class.








