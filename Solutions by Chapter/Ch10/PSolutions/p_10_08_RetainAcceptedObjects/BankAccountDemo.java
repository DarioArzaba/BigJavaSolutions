package p_10_08_RetainAcceptedObjects;

import java.util.ArrayList;

/**
 * In Exercise P10.5, add a method to the {@code Filter} interface that retains
 * all objects accepted by the filter and removes the others:
 * <p><pre>
 *      static void retainAll(Object[] values, Filter condition)</pre>
 */
public class BankAccountDemo
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

        ArrayList<BankAccount> accounts = balanceFilter.getAccounts();

        System.out.print("Number of objects that accepted by filter: ");
        int count = Filter.count(accounts, f);
        System.out.println(count);

        System.out.println("Values that accepted by the filter: ");
        Filter.retainAll(accounts, f);
        for (BankAccount acc : accounts)
        {
            System.out.println(acc.getBalance());
        }
    }
}
