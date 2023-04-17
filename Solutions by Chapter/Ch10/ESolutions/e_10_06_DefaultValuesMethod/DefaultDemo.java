package e_10_06_DefaultValuesMethod;

import java.util.Arrays;

/**
 * In Worked Example 10.1, add a default method
 * <p><pre>
 *      default int[] values(int n)</pre>
 * that yields an array of the first {@code n} values of the sequence.
 */
public class DefaultDemo
{
    public static void main(String[] args)
    {
        LastDigitDistribution dist1 = new LastDigitDistribution();
        dist1.process(Sequence.powersOf(4), 1000);
        dist1.display();

        System.out.println();

        int[] squares = Sequence.powersOf(4).values(20);
        System.out.println(Arrays.toString(squares));

        System.out.println();

        LastDigitDistribution dist2 = new LastDigitDistribution();
        dist2.process(Sequence.multiplesOf(4), 1000);
        dist2.display();

        System.out.println();

        int[] multiples = Sequence.multiplesOf(4).values(20);
        System.out.println(Arrays.toString(multiples));

        System.out.println();

        LastDigitDistribution dist3 = new LastDigitDistribution();
        dist3.process(Sequence.randomSequence(), 10);
        dist3.display();

        System.out.println();

        int[] random = Sequence.randomSequence().values(10);
        System.out.println(Arrays.toString(random));
    }
}
