package e_16_17_hashSet_hasNext_mehtod;

import java.util.Iterator;

/**
 * The {@code hasNext} method of the hash set implementation in Section 16.4
 * finds the location of the {@code next} element, but when next is called,
 * the same search happens again. Improve the efficiency of these methods so
 * that {@code next} (or a repeated call to {@code hasNext}) uses the position
 * located by a preceding call to {@code hasNext}.
 */
public class HashSetDemo
{
    public static void main(String[] args)
    {
        HashSet names = new HashSet(30);

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
        names.remove("Romeo");
        names.remove("George");

        Iterator iter = names.iterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}
