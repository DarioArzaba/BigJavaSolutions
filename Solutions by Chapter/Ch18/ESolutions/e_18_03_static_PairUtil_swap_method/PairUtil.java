package e_18_03_static_PairUtil_swap_method;

import e_18_02_swap_elements_of_the_pair.Pair;

/**
 * {@code PairUtil} class.
 */
public class PairUtil
{
    /**
     * Swaps first and second elements of the pair.
     *
     * @param pair the pair of elements of the same type
     * @param <T>  the class of the objects to be swapped
     * @return new pair with swapped elements
     */
    public static <T> Pair<T> swap(Pair<T> pair)
    {
        return new Pair<>(pair.getSecond(), pair.getFirst());
    }
}
