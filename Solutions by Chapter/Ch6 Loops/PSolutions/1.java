/*

1.- Enhance Worked Example 6.1 to check that the credit card number is valid.

A credit card number will yield a result divisible by 10 when you:
    Form the sum of all digits.
    Add to that sum every second digit, starting with the second digit from the right.
    Then add the number of digits in the second step that are greater than four.
    The result should be divisible by 10.

For example, consider the number 4012 8888 8888 1881. The sum of all digits is 89.
The sum of the colored digits is 46. There are five colored digits larger than four, so
the result is 140. 140 is divisible by 10 so the card number is valid

*/

public class CreditCardNumberValidation {

    public static void main(String[] args) {

        // Credit Card Number to Test
        String creditCardNumber = "4012-8888-8888-1881";
        int CCsize = creditCardNumber.length();

        int i = 0, j = 0, first = 0, second = 0 , third = 0;
        int numberOne, numberTwo;
        boolean CCValid = false, digitValid = false, digitValidTwo = false, digitValidThree = false;
        String digitOne, digitTwo, digitThree;

        // Repeat for all digits of the CC Number
        while (i < CCsize) {

            // Capture every digits
            digitOne = String.valueOf(creditCardNumber.charAt(i));
            digitValid = !(digitOne.equals(" ") || digitOne.equals("-"));

            // If every digit is valid sum it to first result
            if (digitValid) {
                numberOne = Integer.valueOf(digitOne);
                first += numberOne;
            }


            if (j == 0) {
                // Test first digit and add 2 to second index
                digitTwo = String.valueOf(creditCardNumber.charAt(j));
                digitValidTwo = !(digitTwo.equals(" ") || digitTwo.equals("-"));
                if (digitValidTwo) {
                    numberTwo = Integer.valueOf(digitTwo);
                    second += numberTwo;
                    if (numberTwo > 4) {
                        third++;
                    }
                }
                j+=2;
            } else if (j == CCsize-2) {
                // Test last digit and end second testing cicle
                digitTwo = String.valueOf(creditCardNumber.charAt(j));
                digitValidTwo = !(digitTwo.equals(" ") || digitTwo.equals("-"));
                if (digitValidTwo) {
                    numberTwo = Integer.valueOf(digitTwo);
                    second += numberTwo;
                    if (numberTwo > 4) {
                        third++;
                    }
                }
                j=CCsize;
            } else if (j < CCsize) {
                // Test every second digit
                digitTwo = String.valueOf(creditCardNumber.charAt(j));
                digitValidTwo = !(digitTwo.equals(" ") || digitTwo.equals("-"));
                if (digitValidTwo) {
                    numberTwo = Integer.valueOf(digitTwo);
                    second += numberTwo;
                    if (numberTwo > 4) {
                        third++;
                    }
                }

                // Skip Invalid chars, adding 3 to j instead of 2
                if (j < CCsize-2) {
                    digitThree = String.valueOf(creditCardNumber.charAt(j+2));
                    digitValidThree = !(digitThree.equals(" ") || digitThree.equals("-"));
                    if (digitValidThree) {
                        j += 2;
                    } else {
                        j += 3;
                    }
                }

            }

            i++;

        }

        // Validate Credit Card Number
        int result = first + second + third;
        if (result % 10 == 0){
            CCValid = true;
        }
        System.out.println("Credit Card Number is:" + CCValid);

        System.exit(0);

    }
}