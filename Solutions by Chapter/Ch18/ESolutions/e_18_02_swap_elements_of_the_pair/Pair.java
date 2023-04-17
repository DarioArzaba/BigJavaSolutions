package e_18_02_swap_elements_of_the_pair;

/**
 * This class collects a pair of elements of same type.
 */
public class Pair<T>
{
    private T first;
    private T second;

    /**
     * Constructs a pair containing two given elements.
     * @param first the first element
     * @param second the second element
     */
    public Pair(final T first, final T second)
    {
        this.first = first;
        this.second = second;
    }

    /**
     * Gets the first element of the pair.
     * @return the first element
     */
    public T getFirst()
    {
        return first;
    }

    /**
     * Gets the second element of the pair.
     * @return the second element
     */
    public T getSecond()
    {
        return second;
    }

    /**
     * Swaps the first and second elements of the pair.
     */
    public void swap()
    {
        T temp = first;
        first = second;
        second = temp;
    }
}
