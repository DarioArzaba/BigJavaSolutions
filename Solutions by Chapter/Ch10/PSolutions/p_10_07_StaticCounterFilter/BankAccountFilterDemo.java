package p_10_07_StaticCounterFilter;

/**
 * In Exercise P10.5, add a method to the {@code Filter} interface that counts
 * how many objects are accepted by the filter:
 * <p><pre>
 *      static int count(Object[] values, Filter condition)</pre>
 */
public class BankAccountFilterDemo
{
    public static void main(String[] args)
    {
        Measurer m = (Object anObject) ->
        {
            BankAccount account = (BankAccount) anObject;
            return account.getBalance();
        };

        Filter f = (Object x) ->
        {
            BankAccount account = (BankAccount) x;
            return account.getBalance() > 1000;
        };

        BankAccountOperations balanceFilter = new BankAccountOperations(m, f);

        balanceFilter.add(new BankAccount(10));
        balanceFilter.add(new BankAccount(100));
        balanceFilter.add(new BankAccount(2000));
        balanceFilter.add(new BankAccount(999));
        balanceFilter.add(new BankAccount(1000));
        balanceFilter.add(new BankAccount(4000));

        System.out.println("Average balance: " + balanceFilter.getAverage());
        System.out.println("Expected:        3000");

        BankAccount account = (BankAccount) balanceFilter.getMaximum();
        double balance = account.getBalance();

        System.out.println("Highest balance: " + balance);
        System.out.println("Expected:        4000");
    }
}
