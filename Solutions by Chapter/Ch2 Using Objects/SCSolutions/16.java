/* 

16.- Is it legal to call river.println()? Why or why not?

A. Strings are objects from the class (String). The method (println) is not defined for String objects, so the String object (river) cannot make use of this method. However the class (PrintStream), that the object (System.out) pertains to, does define a (println) method. The class String and its methods are described in the documentation:

https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#length--

	Error: The method println() is undefined for the type String

*/