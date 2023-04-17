package p_10_01_LastDigitDistributionHistogram;

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
     * Processes values from this sequence.
     *
     * @param seq             the sequence from which to obtain the values
     * @param valuesToProcess the number of values to process
     */
    public void process(Sequence seq, int valuesToProcess)
    {
        for (int i = 1; i <= valuesToProcess; i++)
        {
            int value = seq.next();
            int lastDigit = value % 10;
            counters[lastDigit]++;
        }
    }

    /**
     * Displays the counter values of this distribution in a form of histogram.
     */
    public void display()
    {
        final int MAX_SCALE_LENGTH = 40;
        int largest = getLargestValue();

        for (int i = 0; i < counters.length; i++)
        {
            int actualScale = counters[i] / (largest / MAX_SCALE_LENGTH);
            System.out.print(i + ": ");
            for (int j = 0; j < actualScale; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Gets the largest value from the counters array.
     *
     * @return the largest value
     */
    private int getLargestValue()
    {
        int largest = counters[0];
        for (int n : counters)
        {
            if (n > largest)
            {
                largest = n;
            }
        }
        return largest;
    }
}
