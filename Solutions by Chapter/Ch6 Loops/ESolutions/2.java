/*

2.-  Write programs with loops that compute

    a. The sum of all even numbers between 2 and 100 (inclusive).
    b. The sum of all squares between 1 and 100 (inclusive).
    c. All powers of 2 from 20 up to 220.
    d. The sum of all odd numbers between a and b (inclusive), where a and b are inputs.
    e. The sum of all odd digits of an input. (For example, if the input is 32677, the sum would be 3 + 7 + 7 = 17.)

*/

import java.math.BigInteger;

public class computeSumsLoops {
    public static void main(String[] args)  {

        int startA = 2, endA = 100, stepA = 2;
        int resultA = 0;
        for (int i = startA; i <= endA; i+=stepA) {
            resultA += i;
        }
        System.out.println("Sum of Even Numbers: " + resultA);

        int startB = 1, endB = 100, stepB = 1;
        int resultB = 0;
        for (int i = startB; i <= endB; i+=stepB) {
            resultB += (i*i);
        }
        System.out.println("Sum of Squares: " + resultB);

        int startC = 20, endC = 220, stepC = 1;
        BigInteger resultC = new BigInteger("0");

        for (int i = startC; i <= endC; i+=stepC) {
            BigInteger power = BigInteger.valueOf((int)(Math.pow(2, i)));
            resultC = resultC.add(power);
        }
        System.out.println("Sum of Powers: " + resultC);

        int SUM_ODD_A = 2;
        int SUM_ODD_B = 100;
        int resultD = 0;
        if (SUM_ODD_A % 2 == 0) {
            SUM_ODD_A += 1;
        }
        if (SUM_ODD_B % 2 == 0) {
            SUM_ODD_B -= 1;
        }
        for (int i = SUM_ODD_A; i <= SUM_ODD_B; i+=2) {
            resultD += i;
        }
        System.out.println("Sum of Odd Numbers: " + resultD);

        int SUM_NUMBER_ODD  = 32677;
        String SUM_DIGITS_ODD = String.valueOf(SUM_NUMBER_ODD);
        int numberE = 0, resultE = 0;
        for (int i = 0; i < SUM_DIGITS_ODD.length(); i++) {
            numberE = Integer.valueOf(String.valueOf(SUM_DIGITS_ODD.charAt(i)));
            if ( numberE % 2 != 0  ){
                resultE += numberE;
            }
        }
        System.out.println("Sum of Odd Digits: " + resultE);


        System.exit(0);
    }

}
