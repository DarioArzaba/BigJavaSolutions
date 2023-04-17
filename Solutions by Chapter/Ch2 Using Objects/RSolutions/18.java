/* 

18.- Find the errors in the following statements:

	a. Rectangle r = (5, 10, 15, 20);
	b. double width = Rectangle(5, 10, 15, 20).getWidth();
	c. Rectangle r; r.translate(15, 25);
	d. r = new Rectangle(); r.translate("far, far away!");

A. 

 	a. A reference to a Rectangle object called (r) is being assigned what seems to be an Object. However to create an object you need the keyword (new) fallowed by the name of the class as a constructor. The correct version would be:
	
		Rectangle r = new Rectangle(5,10,15,20);

	b. You cannot use a method (getWidth) with a class contructor but you can use it with an already created object, accesing the object via its object variable. The correct version would be:
	
		Rectangle r = new Rectangle(5,10,15,20);
		double width = r.getWidth();
	
	c. The object variable hasn't been initialized with a constructor. The correct version would be:

		Rectangle r = new Rectangle(5,10,15,20);
		r.translate(15,25);
	
	d. The object variable needs to have its variable type at the start, before the identifier (r). Also the method (translate) of the Rectangle class does not accept Strings as arguments, only numeric integrals (int). The correct version would be:
	
		Rectangle r = new Rectangle();
		r.translate(15,25);

*/

