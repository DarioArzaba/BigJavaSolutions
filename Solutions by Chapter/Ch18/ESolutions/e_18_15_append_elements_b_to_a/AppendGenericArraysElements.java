package e_18_15_append_elements_b_to_a;

import java.util.ArrayList;

/**
 * Provide a static method {@code void append(ArrayList<T> a, ArrayList<T> b)}
 * that appends the elements of {@code b} to {@code a}.
 */
public class AppendGenericArraysElements
{
    public static void main(String[] args)
    {
        ArrayList<String> a = new ArrayList<>();
        a.add("Tony");
        a.add("Carl");

        ArrayList<String> b = new ArrayList<>();
        b.add("Carl");
        b.add("Harry");
        b.add("Tony");
        b.add("Tony");

        append(a, b);

        System.out.println(a);
    }

    /**
     * Appends the elements of array list b to the array list a.
     *
     * @param a   array list
     * @param b   array list
     * @param <T> the type of elements to append
     */
    public static <T> void append(ArrayList<T> a, ArrayList<T> b)
    {
        a.addAll(b);
    }
}
