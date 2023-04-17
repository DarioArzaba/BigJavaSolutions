package e_16_20_multiply_add_divide_HashSet;

import java.util.Iterator;

/**
 * Implement the hash set in Section 16.4, using the "MAD (multiply-add-divide)
 * method" for hash code compression. For that method, you choose a prime number
 * <em>p</em> larger than the length <em>L</em> of the hash table and two values
 * <em>a</em> and <em>b</em> between 1 and <em>p</em> – 1.
 * Then reduce <em>h</em> to <em>((a h + b) % p) % L</em>.
 */
public class HashSetDemo {

    public static void main(String[] args) {
        HashSet names = new HashSet(33);

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
//        names.remove("George");

        Iterator iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println(names.size());
    }
}
