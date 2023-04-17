package p_10_01_LastDigitDistributionHistogram;

public class SquareSequence implements Sequence
{
    private int n;

    public int next()
    {
        n++;
        return n * n;
    }
}
