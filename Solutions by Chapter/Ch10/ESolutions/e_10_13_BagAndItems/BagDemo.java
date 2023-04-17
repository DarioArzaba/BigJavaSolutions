package e_10_13_BagAndItems;

/**
 * {@code BagDemo} class.
 */
public class BagDemo
{
    public static void main(String[] args)
    {
        Bag bag = new Bag();
        bag.add("Toothbrush");
        bag.add("Toothbrush");
        bag.add("Hair dryer");
        bag.add("Matches");
        bag.add("Bread");
        bag.add("Bread");
        bag.add("Bread");

        String itemToCount = "Bread";
        System.out.println(itemToCount + ": " + bag.count(itemToCount));
    }
}
