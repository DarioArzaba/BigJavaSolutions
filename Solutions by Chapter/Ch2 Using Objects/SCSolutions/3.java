/* 

3.- What actually happens when you try to call the following? "Hello, World".println(System.out)

A. The compiler treats the object inside double quotes (Hello, World) as an object from the class String. The dot means we are trying to call its method (println), however the class String as per the Java documentation does not have a (println) method available, and we end up with a compile-time error. On that note, the object (System.out) from the (PrintStream) class does indeed have a defined (println) method.

	Error. The method println(PrintStream) is undefined for the type String.

*/

