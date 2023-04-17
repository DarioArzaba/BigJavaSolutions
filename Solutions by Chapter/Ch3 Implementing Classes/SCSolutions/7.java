/* 

7.- What is wrong with this sequence of statements?

BankAccount harrysChecking = new BankAccount(10000);
System.out.println(harrysChecking.withdraw(500));

A. The withdraw method clearly takes away money from the private "value" variable of every bank account but it does not return the new value. The problem here is that the method println expects a String for its argument but instead it gets nothing (void) in return from the withdraw method. To obtain the new balance after the withdrawal you would need to use the getBalance method.

*/
