/* 

13.- In this project, you will explore an object-oriented alternative to the “Hello, World” program in Chapter 1. Begin with a simple Greeter class that has a single method,

sayHello.

That method should return a string, not print it. Create two objects of this class and invoke their sayHello methods. Of course, both objects return the same answer. Enhance the Greeter class so that each object produces a customized greeting. For example, the object constructed as

new Greeter("Dave")

should say "Hello, Dave". (Use the concat method to combine strings to form a longer string, or peek ahead at Section 4.5 to see how you can use the + operator for the same purpose.) Add a method

sayGoodbye

to the Greeter class. Finally, add a method refuseHelp to the Greeter class. It should return a string such as "I am sorry, Dave. I am afraid I can’t do that." If you use BlueJ, place two Greeter objects on the workbench (one that greets the world and one that greets Dave) and invoke methods on them. Otherwise, write a tester program that constructs these objects, invokes methods, and prints the results.

*/

class Greeter {
	
	private String name;
	
	/**
	 * Constructs a Greeter object.
	 */
	Greeter(String aName) {
		name = aName.concat(".");
	}
	
	/**
	 * Builds a string to say hello.
	 * @return the string
	 */
	String sayHello() {
		return "Hello, " + name;
	}
	
	/**
	 * Builds a string that refuses help.
	 * @return the string
	 */
	String refuseHelp() {
		return "I am sorry, " + name + " I am afraid I can't do that";
	}
	
	/**
	 * Builds a string to say goodbye.
	 * @return the string
	 */
	String sayGoodbye() {
		return "Goodbye, " + name;
	}
	
}

public class GreeterDemo {
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter("Dario");
		
		System.out.print("Greeter: ");
		System.out.println(greeter.sayHello());
		
		System.out.print("Refuse: ");
		System.out.println(greeter.refuseHelp());
		
		System.out.print("Goodbye: ");
		System.out.println(greeter.sayGoodbye());
		
		System.exit(0);
		
	}
}

