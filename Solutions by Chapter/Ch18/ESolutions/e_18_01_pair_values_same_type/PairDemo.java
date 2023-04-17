package e_18_01_pair_values_same_type;

/**
 * Modify the generic {@code Pair} class so that both values have the same type.
 */
public class PairDemo
{
    public static void main(String[] args)
    {
        Pair<String> pair = new Pair<>("Tom", "Andy");
        System.out.println(pair.getFirst() + " " + pair.getSecond());
    }
}
