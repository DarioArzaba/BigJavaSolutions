/*

40.- In the Sherlock Holmes story “The Adventure of the Sussex Vampire”, the inimitable detective uttered these words:

“Matilda Briggs was not the name of a young woman, Watson, … It was a ship which is associated with the giant rat of Sumatra, a story for which the world is not yet prepared.”

Over a hundred years later, researchers found giant rats in Western New Guinea, another part of Indonesia. Suppose you are charged with writing a program that processes rat weights. It contains the statements
		
		System.out.print("Enter weight in kg: ");
		double weight = in.nextDouble();
		
What input checks should you supply? When processing inputs, you want to reject values that are too large. But how large is too large? These giant rats, found in Western New Guinea, are about five times the size of a city rat.

A.

	Check that the input is a number using hasNextDouble.
	Check that the weight is more than 0 since it must have a positive weight.
	A regular rat weighs 0.2 kg.
	The weight of the New Guinea rat must be arround 2 kg
	Using the next decimal place we can say that any rat weight must be less than 10 kg.

The checks would be something like:

	if (in.hasNextDouble()) {
		double weight = in.nextDouble();
		if (weight < 0) {
	 		System.out.println("Error: Weight cannot be negative.");
		} else if (weight > 10) {
			System.out.println("Error: Weight > 10 kg.");
		} else {
			//Process valid weight.
		}
	} else {
		System.out.print("Error: Not a number");
	}

*/

