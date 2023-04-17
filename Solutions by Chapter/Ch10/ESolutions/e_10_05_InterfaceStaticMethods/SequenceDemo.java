package e_10_05_InterfaceStaticMethods;

/**
 * In the {@code Sequence} interface of Worked Example 10.1, add static
 * methods that yield {@code Sequence} instances:
 * <p><pre>
 *      static Sequence multiplesOf(int n)
 *      static Sequence powersOf(int n)</pre>
 * For example, {@code Sequence.powersOf(2)} should return the same sequence
 * as the {@code SquareSequence} class in the worked example.
 */
public class SequenceDemo
{
    public static void main(String[] args)
    {
        LastDigitDistribution dist1 = new LastDigitDistribution();
        dist1.process(Sequence.powersOf(2), 1000);
        dist1.display();

        System.out.println();

        LastDigitDistribution dist2 = new LastDigitDistribution();
        dist2.process(Sequence.multiplesOf(7), 1000);
        dist2.display();
    }
}
