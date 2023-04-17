package p_10_09_DefaultRejectFilter;

import java.util.ArrayList;

/**
 * In Exercise P10.5, add a method {@code default boolean reject(Object x)}
 * to the {@code Filter} interface that returns true for all objects that
 * this filter doesn’t accept.
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

        // Test static void reject() method of Filter interface

        for (BankAccount acc : accounts)
        {
            if (f.reject(acc))
            {
                System.out.println(acc.getBalance());
            }
        }
    }
}
