/* 

13.- How would you explain assignment using the parking space analogy?

A.

	Variables are like parking spaces of different sizes.
	When we create a new parking space we define its size via its data type.
	Parking spaces usually are identifiable by a number, after defining its size we can specify our own identifier.
	Finally, we can store a car of the appropriate size inside the parking space.
	Once created the parking space will stay there.
	If we need to store a different car in that parking space the first one needs to disoccupy it.
	The new car must be of the appropriate size.

*/

public class ParkingSpaceAnalogy {
		
	public static void main(String[] args){
		
		//Create an empty "parking space" named (A33) of size (int)
		//Size int is appropiate for "parking" numbers without a decimal point.
		int A33;
		//"Parking" the car 2 on that space. 
		A33 = 2;
		//"Parking" the car 3 on that space. The previous car 2 goes away.
		A33 = 3;
		//If we need to use the last parked car we can find it using the parking space identifier.
		System.out.println("On the parking space A33 there is a car with the number " + A33 );
		System.exit(0);
		
	}

}

