package e_10_13_BagAndItems;

import java.util.ArrayList;

/**
 * Implement a class {@code Bag} that stores items represented as strings.
 * Items can be repeated. Supply methods for adding an item, and for counting
 * how many times an item has been added:
 * <p><pre>
 *      public void add(String itemName)
 *      public int count(String itemName)</pre>
 * Your {@code Bag} class should store the data in an {@code ArrayList&lt;Item&gt;},
 * where {@code Item} is an inner class with two instance variables: the name
 * of the item and the quantity.
 */
public class Bag
{
    private ArrayList<Item> items;

    /**
     * Constructs a bag class.
     */
    public Bag()
    {
        items = new ArrayList<>();
    }

    /**
     * Adds an item to the bag.
     *
     * @param itemName the name of the item
     */
    public void add(String itemName)
    {
        items.add(new Item(itemName, 1));
    }

    /**
     * Counts the items in the bag.
     *
     * @param itemName the name of the item to count
     * @return the number of the items in this bag
     */
    public int count(String itemName)
    {
        int count = 0;
        for (Item i : items)
        {
            if (i.getName().equalsIgnoreCase(itemName))
            {
                count += i.getQuantity();
            }
        }
        return count;
    }

    /**
     * Inner {@code Item} class.
     */
    public class Item
    {
        private String name;
        private int quantity;

        /**
         * Constructs an item with the name and quantity fields.
         *
         * @param name the name
         * @param quantity the quantity
         */
        public Item(String name, int quantity)
        {
            this.name = name;
            this.quantity = quantity;
        }

        /**
         * @return the name of the item
         */
        public String getName()
        {
            return name;
        }

        /**
         * @return the quantity of the item
         */
        public int getQuantity()
        {
            return quantity;
        }
    }
}
