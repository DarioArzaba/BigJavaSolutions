package p_10_07_StaticCounterFilter;

import java.util.ArrayList;

public class BankAccountOperations
{
    private ArrayList<BankAccount> accounts;
    private Measurer measurer;
    private Filter filter;

    /**
     * Constructs a bank account filter with measurer and filter as parameters.
     *
     * @param measurer
     * @param filter
     */
    public BankAccountOperations(Measurer measurer, Filter filter)
    {
        this.measurer = measurer;
        this.filter = filter;
        accounts = new ArrayList<>(10);
    }

    /**
     * Computes the average of the filtered accounts.
     *
     * @return the average of filtered measures
     */
    public double getAverage()
    {
        if (accounts.size() < 1)
        {
            return 0;
        }

        double sum = 0;
        int count = Filter.count(accounts, filter);

        for (Object obj : accounts)
        {
            if (filter.accept(obj))
            {
                sum += measurer.measure(obj);
            }
        }
        return sum / count;
    }

    /**
     * Gets the filtered bank account with maximum measure.
     *
     * @return the account with highest balance
     */
    public Object getMaximum()
    {
        Object maxObject = accounts.get(0);
        double max = measurer.measure(accounts.get(0));

        for (Object obj : accounts)
        {
            if (filter.accept(obj) && max < measurer.measure(obj))
            {
                maxObject = obj;
            }
        }
        return maxObject;
    }

    /**
     * Adds a bank account to the accounts array list.
     *
     * @param account the account to add to the list
     */
    public void add(BankAccount account)
    {
        accounts.add(account);
    }
}
