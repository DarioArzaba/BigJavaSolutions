package p_10_07_StaticCounterFilter;

import java.util.ArrayList;

/**
 * Describes any class whose objects can filter other objects.
 */
public interface Filter
{
    /**
     * Counts how many objects accepted by the filter.
     *
     * @param objects   an array of objects
     * @param condition the condition for filter
     * @return number of accepted objects
     */
    static int count(ArrayList objects, Filter condition)
    {
        int count = 0;
        for (Object o : objects)
        {
            if (condition.accept(o))
            {
                count++;
            }
        }
        return count;
    }

    /**
     * Accepts or refuses an object based on predefined requirements (filter).
     *
     * @param x an object to pass through the filter
     * @return true of false
     */
    boolean accept(Object x);
}
