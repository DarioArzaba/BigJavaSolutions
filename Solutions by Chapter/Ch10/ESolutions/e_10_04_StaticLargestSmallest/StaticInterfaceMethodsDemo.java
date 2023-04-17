package e_10_04_StaticLargestSmallest;

/**
 * Add static methods {@code largest} and {@code smallest} to the {@code
 * Measurable} interface. The methods should return the object with the
 * largest or smallest measure from an array of {@code Measurable} objects.
 */
public class StaticInterfaceMethodsDemo
{
    public static void main(String[] args)
    {

        // Compute the account with smallest and largest balance

        Measurable[] accounts = new Measurable[3];
        accounts[0] = new BankAccount(0);
        accounts[1] = new BankAccount(10000);
        accounts[2] = new BankAccount(2000);

        double smallestBalance = Measurable.smallest(accounts);
        System.out.println("Smallest balance: " + smallestBalance);
        System.out.println("Expected: " + 0);

        double largestBalance = Measurable.largest(accounts);
        System.out.println("Largest balance " + largestBalance);
        System.out.println("Expected: " + 10000);

        // Compute the country with smallest and largest area

        Measurable[] countries = new Measurable[3];
        countries[0] = new Country("Uruguay", 176220);
        countries[1] = new Country("Thailand", 513120);
        countries[2] = new Country("Belgium", 30510);

        double smallestArea = Measurable.smallest(countries);
        System.out.println("Smallest area: " + smallestArea);
        System.out.println("Expected: " + 30510);

        double largestArea = Measurable.largest(countries);
        System.out.println("Largest area: " + largestArea);
        System.out.println("Expected: " + 513120);
    }
}
