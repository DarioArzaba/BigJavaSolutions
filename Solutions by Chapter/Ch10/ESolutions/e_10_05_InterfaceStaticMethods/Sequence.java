package e_10_05_InterfaceStaticMethods;

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
}
