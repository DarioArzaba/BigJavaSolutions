package e_10_07_DefaultProcessMethod;

/**
 * In Worked Example 10.1, make the {@code process} method
 * a default method of the {@code Sequence} interface.
 */
public class DefaultDemo
{
    public static void main(String[] args)
    {
        Sequence squares = Sequence.powersOf(3);
        int[] lastDigitDistribution1 = squares.process(squares, 1000);
        display(lastDigitDistribution1);

        System.out.println();

        Sequence multiples = Sequence.multiplesOf(2);
        int[] lastDigitDistribution2 = multiples.process(multiples, 1000);
        display(lastDigitDistribution2);

        System.out.println();

        Sequence randoms = Sequence.randomSequence();
        int[] lastDigitDistribution3 = randoms.process(randoms, 1000);
        display(lastDigitDistribution3);

    }

    /**
     * Displays the counter values of this distribution.
     */
    public static void display(int[] anArray)
    {
        for (int i = 0; i < anArray.length; i++)
        {
            System.out.println(i + ": " + anArray[i]);
        }
    }
}
