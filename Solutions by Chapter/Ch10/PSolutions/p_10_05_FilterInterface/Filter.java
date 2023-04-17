package p_10_05_FilterInterface;

/**
 * Describes any class whose objects can filter other objects.
 */
public interface Filter
{
    /**
     * Accepts or refuses an object based on predefined requirements (filter).
     *
     * @param x an object to pass through the filter
     * @return true of false
     */
    boolean accept(Object x);
}
