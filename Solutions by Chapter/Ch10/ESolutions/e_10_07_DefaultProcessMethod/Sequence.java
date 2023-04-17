package e_10_07_DefaultProcessMethod;

/**
 * Declares {@code Sequence} interface.
 */
public interface Sequence
{
    int next();

    /**
     * Computes the powers of {@code n} of this sequence.
     *
     * @param n the exponent
     * @return the sequence of the powers of {@code n}
     */
    static Sequence powersOf(int n)
    {
        Sequence s = new Sequence()
        {
            private int base;

            @Override
            public int next()
            {
                base++;
                return (int) Math.pow(base, n);
            }
        };
        return s;
    }

    /**
     * Computes the multiples of {@code n}.
     * @param n the multiplier
     *
     * @return the sequence of the multiples of {@code n}
     */
    static Sequence multiplesOf(int n)
    {
        Sequence s = new Sequence()
        {
            private int x;

            @Override
            public int next()
            {
                x++;
                return x * n;
            }
        };
        return s;
    }

    /**
     * Generates the sequence of random numbers.
     *
     * @return the sequence of random numbers.
     */
    static Sequence randomSequence()
    {
        return () -> (int) (Integer.MAX_VALUE * Math.random());
    }

    /**
     * Yields an array of the first {@code n} values of the sequence.
     *
     * @param n the number of the first values
     * @return an array of the first {@code n} values of the sequence.
     */
    default int[] values(int n)
    {
        int[] result = new int[n];
        for (int i = 0; i < n; i++)
        {
            result[i] = next();
        }
        return result;
    }

    /**
     * Process values from this sequence.
     *
     * @param seq             the sequence from which to obtain the values
     * @param valuesToProcess the number of values to process
     */
    default int[] process(Sequence seq, int valuesToProcess)
    {
        int[] counters = new int[10];
        for (int i = 0; i < valuesToProcess; i++)
        {
            int value = seq.next();
            int lastDigit = value % 10;
            counters[lastDigit]++;
        }
        return counters;
    }
}
