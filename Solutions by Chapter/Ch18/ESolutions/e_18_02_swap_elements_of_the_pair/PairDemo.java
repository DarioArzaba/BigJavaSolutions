package e_18_02_swap_elements_of_the_pair;

/**
 * Add a method {@code swap} to the {@code Pair} class of Exercise E18.1
 * that swaps the first and second elements of the pair.
 */
public class PairDemo
{
    public static void main(String[] args)
    {
        Pair<String> pair = new Pair<>("Tom", "Andy");
        System.out.print("Before swap: ");
        System.out.println(pair.getFirst() + " " + pair.getSecond());

        pair.swap();

        System.out.print("After swap: ");
        System.out.println(pair.getFirst() + " " + pair.getSecond());
    }
}
