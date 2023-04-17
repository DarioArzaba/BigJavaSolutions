package p_10_10_DefaultInvertFilter;

import java.util.ArrayList;

/**
 * Describes any class whose objects can filter other objects.
 */
public interface Filter
{
    /**
     * Retains all objects accepted by the filter and removes the others.
     *
     * @param values    the list of values
     * @param condition the condition for filter
     */
    static void retainAll(ArrayList<BankAccount> values, Filter condition)
    {
        ArrayList<BankAccount> retain = new ArrayList<>();
        for (BankAccount account : values)
        {
            if (condition.accept(account))
            {
                retain.add(account);
            }
        }
        values.retainAll(retain);
    }

    /**
     * Counts how many objects accepted by the filter.
     *
     * @param values    an array of objects
     * @param condition the condition for filter
     * @return number of accepted objects
     */
    static int count(ArrayList values, Filter condition)
    {
        int count = 0;
        for (Object o : values)
        {
            if (condition.accept(o))
            {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns a filter that accepts the objects that this filter rejects.
     *
     * @return inverted filter
     */
    default Filter invert()
    {
        return x ->
        {
            BankAccount account = (BankAccount) x;
            return account.getBalance() <= 1000;
        };
    }

    /**
     * Returns true for all objects that this filter doesn't accept.
     *
     * @param x an object to pass through the filter
     * @return true for all objects that the filter doesn't accept
     */
    default boolean reject(Object x)
    {
        return !accept(x);
    }

    /**
     * Accepts or refuses an object based on predefined requirements (filter).
     *
     * @param x an object to pass through the filter
     * @return true of false
     */
    boolean accept(Object x);
}
