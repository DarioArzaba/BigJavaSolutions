package e_10_07_DefaultProcessMethod;

/**
 * This class analyzes the distribution of the last digit of values
 * from a sequence.
 */
public class LastDigitDistribution
{
    private int[] counters;

    /**
     * Constructs a distribution whose counters are set to zero.
     */
    public LastDigitDistribution()
    {
        counters = new int[10];
    }

    /**
     * Process values from this sequence.
     *
     * @param seq             the sequence from which to obtain the values
     * @param valuesToProcess the number of values to process
     */
    public void process(Sequence seq, int valuesToProcess)
    {
        for (int i = 0; i < valuesToProcess; i++)
        {
            int value = seq.next();
            int lastDigit = value % 10;
            counters[lastDigit]++;
        }
    }

    /**
     * Displays the counter values of this distribution.
     */
    public void display()
    {
        for (int i = 0; i < counters.length; i++)
        {
            System.out.println(i + ": " + counters[i]);
        }
    }
}
