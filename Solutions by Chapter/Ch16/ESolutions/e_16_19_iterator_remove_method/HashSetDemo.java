package e_16_19_iterator_remove_method;

import java.util.Iterator;

/**
 * Implement the {@code remove} operation for iterators
 * on the hash set in Section 16.4.
 */
public class HashSetDemo
{
    public static void main(String[] args)
    {
        HashSet names = new HashSet(101);

        names.add("Harry");
        names.add("Sue");
        names.add("Nina");
        names.add("Susannah");
        names.add("Larry");
        names.add("Eve");
        names.add("Romeo");
        names.remove("Romeo");
        names.remove("George");

        Iterator iterator = names.iterator();

        System.out.println("Before remove():");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println();

        System.out.println("After remove():");

        iterator = names.iterator();
        iterator.next();
        iterator.remove();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
