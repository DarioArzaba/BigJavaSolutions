package e_10_10_ComparableCoin;

/**
 * Modify the {@code Coin} class from Chapter 8 to have it implement
 * the {@code Comparable} interface.
 */
public class Coin implements Comparable<Coin>
{
    private double value;
    private String name;

    /**
     * Constructs a coin object.
     *
     * @param aValue the value
     * @param aName  the name
     */
    public Coin(double aValue, String aName)
    {
        value = aValue;
        name = aName;
    }

    /**
     * Gets the value of this coin.
     *
     * @return the value
     */
    public double getValue()
    {
        return value;
    }

    /**
     * Gets the name of the coin.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    public int compareTo(Coin other)
    {
        return Double.compare(this.value, other.value);
    }
}
