package e_10_10_ComparableCoin;

import java.util.Arrays;

/**
 * Modify the {@code Coin} class from Chapter 8 to have it implement
 * the {@code Comparable} interface.
 */
public class CoinDemo
{
    public static void main(String[] args)
    {
        Coin[] coins = {
                new Coin(0.01, "Penny"),
                new Coin(0.5, "Half Dollar"),
                new Coin(0.05, "Nickel"),
                new Coin(0.25, "Quarter"),
                new Coin(1, "Golden Dollar"),
                new Coin(0.1, "Dime")
        };

        // Test max method

        System.out.println("Coins to test: ");
        System.out.println(coins[0].getName() + " & " + coins[3].getName());

        Coin larger = (Coin) max(coins[0], coins[3]);
        System.out.println("Larger coin: " + larger.getName());
        System.out.println();

        // Test sorting

        System.out.println("Before sorting:");
        for (Coin c : coins)
        {
            System.out.printf("%-15s%.2f%n", c.getName(), c.getValue());
        }
        System.out.println();

        Arrays.sort(coins);

        System.out.println("After sorting:");
        for (Coin c : coins)
        {
            System.out.printf("%-15s%.2f%n", c.getName(), c.getValue());
        }
    }

    /**
     * Finds the larger of any two {@code Comparable} objects.
     *
     * @param o1 comparable object
     * @param o2 comparable object
     * @return the larger of two objects
     */
    public static Comparable max(Comparable o1, Comparable o2)
    {
        if (o1.compareTo(o2) > 0)
        {
            return o1;
        }
        else
        {
            return o2;
        }
    }
}
