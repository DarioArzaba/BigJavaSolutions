package p_10_10_DefaultInvertFilter;

import java.util.ArrayList;

/**
 * In Exercise P10.5, add a method {@code default Filter invert()} to the
 * {@code Filter} interface that yields a filter accepting exactly the objects
 * that this filter rejects.
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

        ArrayList<BankAccount> accounts = balanceFilter.getAccounts();

        // Test default void reject() method of Filter interface

        System.out.println("Reject using reject(): ");
        for (BankAccount acc : accounts)
        {
            if (f.reject(acc))
            {
                System.out.println(acc.getBalance());
            }
        }

        // Test default Filter invert() method of Filter interface

        System.out.println("Accept using invert().reject(): ");
        for (BankAccount acc : accounts)
        {
            if (f.invert().reject(acc))
            {
                System.out.println(acc.getBalance());
            }
        }
    }
}
