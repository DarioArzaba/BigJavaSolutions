package e_18_03_static_PairUtil_swap_method;

import e_18_02_swap_elements_of_the_pair.Pair;

/**
 * Implement a static generic method {@code PairUtil.swap} whose argument is
 * a {@code Pair} object, using the generic class declared in Section 18.2.
 * The method should return a new pair, with the first and second element swapped.
 */
public class PairUtilDemo
{
    public static void main(String[] args)
    {
        // Swap strings

        Pair<String> stringPair = new Pair<>("Carl", "Tony");
        System.out.print("Before swap: ");
        System.out.println(stringPair.getFirst() + " " + stringPair.getSecond());

        Pair<String> swappedPair = PairUtil.swap(stringPair);

        System.out.print("After swap: ");
        System.out.println(swappedPair.getFirst() + " " + swappedPair.getSecond());

        // Swap integers

        Pair<Integer> integerPair = new Pair<>(1, 0);
        System.out.print("Before swap: ");
        System.out.println(integerPair.getFirst() + " " + integerPair.getSecond());

        Pair<Integer> swappedInts = PairUtil.swap(integerPair);

        System.out.print("After swap: ");
        System.out.println(swappedInts.getFirst() + " " + swappedInts.getSecond());
    }
}
