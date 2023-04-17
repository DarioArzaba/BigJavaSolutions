package e_10_01_LargestMeasure;

/**
 * Add a method
 * <p><pre>
 *      public static Measurable max(Measurable[] objects)</pre>
 * to the {@code Data} class that returns the object with the largest measure.
 */
public class MeasurableMaxDemo
{
    public static void main(String[] args)
    {
        // Calling the average method with an array of BankAccount objects
        Measurable[] accounts = new Measurable[3];
        accounts[0] = new BankAccount(0);
        accounts[1] = new BankAccount(10000);
        accounts[2] = new BankAccount(2000);

        Measurable maxBalance = Data.max(accounts);
        System.out.println("Maximum balance: " + maxBalance.getMeasure());
        System.out.println("Expected: 10000");

        // Calling the average method with an array of Country objects
        Measurable[] countries = new Measurable[3];
        countries[0] = new Country("Uruguay", 176220);
        countries[1] = new Country("Thailand", 513120);
        countries[2] = new Country("Belgium", 30510);

        Measurable maxArea = Data.max(countries);
        System.out.println("Maximum area: " + maxArea.getMeasure());
        System.out.println("Expected: 513120");
    }
}
