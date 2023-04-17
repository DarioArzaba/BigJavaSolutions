package p_10_05_FilterInterface;

/**
 * Declare an interface {@code Filter} as follows:
 * <p><pre>
 *      public interface Filter { boolean accept(Object x); }</pre>
 * Modify the implementation of the {@code BankAccountOperations} class in
 * Section 10.4 to use both a {@code Measurer} and a {@code Filter} object.
 * Only objects that the filter accepts should be processed. Demonstrate your
 * modification by processing a collection of bank accounts, filtering out all
 * accounts with balances less than $1,000.
 */
public class BankAccountFilterDemo
{
    public static void main(String[] args)
    {
        class BalanceMeasurer implements Measurer
        {
            @Override
            public double measure(Object anObject)
            {
                BankAccount account = (BankAccount) anObject;
                return account.getBalance();
            }
        }

        class BalanceFilter implements Filter
        {
            @Override
            public boolean accept(Object x)
            {
                BankAccount account = (BankAccount) x;
                return account.getBalance() > 1000;
            }
        }

        Measurer m = new BalanceMeasurer();
        Filter f = new BalanceFilter();
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
