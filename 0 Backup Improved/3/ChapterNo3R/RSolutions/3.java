/* 

3.- Instance variables are a part of the hidden implementation of a class, but they aren’t actually hidden from programmers who have the source code of the class. Explain to what extent the private reserved word provides information hiding.

A. The private access modifier can't hide the information from the source code, instead it prevents direct access by throwing an error if another class, distinct from the one where it resides, tries to access it. Instance variables are usually private, and can only be accessed or modified through the appropriate methods of the object it belongs to.

*/


