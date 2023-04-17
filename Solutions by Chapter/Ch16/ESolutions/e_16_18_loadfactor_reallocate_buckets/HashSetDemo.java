package e_16_18_loadfactor_reallocate_buckets;

import java.util.Iterator;

/**
 * Reallocate the buckets of the hash set implementation in Section 16.4
 * when the load factor is greater than 1.0 or less than 0.5, doubling or
 * halving its size. Note that you need to recompute the hash values of
 * all elements.
 */
public class HashSetDemo
{
    public static void main(String[] args)
    {
        HashSet names = new HashSet(17);

        // Add 12 elements

        names.add("Harry");
        names.add("Sue");
        names.add("Nina");
        names.add("Susannah");
        names.add("Larry");
        names.add("Eve");
        names.add("Sarah");
        names.add("Adam");
        names.add("Tony");
        names.add("Katherine");
        names.add("Juliet");
        names.add("Romeo");
        names.add("Kathryn");
        names.add("Maureen");
        names.add("Brandy");
        names.add("Rickey");
        names.add("Rosa");
        names.add("Deanna");
        names.add("Deanna");
        names.add("Deanna");
        names.add("Deanna");

        Iterator iterator = names.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
