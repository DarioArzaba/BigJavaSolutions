package e_16_18_loadfactor_reallocate_buckets;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * {@code HashSet} class.
 */
public class HashSet
{
    private Node[] buckets;
    private int currentSize;

    /**
     * Constructs a hash table.
     *
     * @param bucketsLength the length of the buckets array
     */
    public HashSet(int bucketsLength)
    {
        buckets = new Node[bucketsLength];
        currentSize = 0;
    }

    /**
     * Tests for set membership.
     *
     * @param x an object
     * @return true if x is an element of this set
     */
    public boolean contains(Object x)
    {
        int h = x.hashCode();
        h = h % buckets.length;
        if (h < 0) { h = -h; }

        Node current = buckets[h];
        while (current != null)
        {
            if (current.data.equals(x))
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Adds an element to this set.
     *
     * @param x an object
     * @return true if x is a new object,
     * false if x was already in the set
     */
    public boolean add(Object x)
    {
        if (loadFactor() > 1)
        {
            resize(nearestPrime(2 * buckets.length - 1));
        }

        int h = x.hashCode();
        h = h % buckets.length;
        if (h < 0) { h = -h; }

        Node current = buckets[h];
        while (current != null)
        {
            if (current.data.equals(x))
            {
                return false; // Already in the set
            }
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = buckets[h];
        buckets[h] = newNode;
        currentSize++;
        return true;
    }

    /**
     * Finds nearest prime number value to the new hash table length which
     * is approximately double size of the old hash table length.
     *
     * @param newTableLength doubled size of the current hash table
     * @return prime number value for resized hash table length
     */
    private int nearestPrime(int newTableLength)
    {
        int nearestPrimeTableLength = newTableLength;
        for (int i = 2; i < Integer.MAX_VALUE; i++)
        {
            if (isPrime(i) && i >= newTableLength)
            {
                nearestPrimeTableLength = i;
                break;
            }
        }
        return nearestPrimeTableLength;
    }

    /**
     * @return true if the argument to the method is prime number
     */
    private boolean isPrime(int n)
    {
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    /**
     * Computes load factor of the hash table F = n / L, where n is
     * the number of elements and L is the table length.
     *
     * @return the load factor.
     */
    private double loadFactor()
    {
        double bucketsLength = buckets.length;
        return currentSize / bucketsLength;
    }

    /**
     * Reallocates the buckets of the hash set, doubling or
     * halving the size of of the buckets array.
     *
     * @param newCapacity the length of the buckets array after resizing
     */
    private void resize(int newCapacity)
    {
        Node[] buffer = new Node[newCapacity];

        for (Node bucket : buckets)
        {
            if (bucket != null)
            {
                Node current = bucket;
                while (current != null)
                {
                    int h = current.hashCode();
                    h = h % buffer.length;
                    if (h < 0) { h = -h; }

                    buffer[h] = current;
                    current = current.next;
                }
            }
        }
        buckets = buffer;
    }

    /**
     * Removes an object from this set.
     *
     * @param x an object
     * @return true if x was removed from this set, false
     * if x was not an element of this set
     */
    public boolean remove(Object x)
    {
        int h = x.hashCode();
        h = h % buckets.length;
        if (h < 0) { h = -h; }

        Node current = buckets[h];
        Node previous = null;
        while (current != null)
        {
            if (current.data.equals(x))
            {
                if (previous == null)
                {
                    buckets[h] = current.next;
                }
                else
                {
                    previous.next = current.next;
                }
                currentSize--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    /**
     * Returns an iterator that traverses the elements of this set.
     *
     * @return a hash set iterator
     */
    public Iterator iterator()
    {
        return new HashSetIterator();
    }

    /**
     * Gets the number of elements in this set.
     *
     * @return the number of elements
     */
    public int size()
    {
        return currentSize;
    }

    class Node
    {
        public Object data;
        public Node next;
    }

    class HashSetIterator implements Iterator
    {
        private int bucketIndex;
        private Node current;

        /**
         * Constructs a hash set iterator that points to the
         * first element of the hash set.
         */
        public HashSetIterator()
        {
            current = null;
            bucketIndex = -1;
        }

        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext()
        {
            if (current != null && current.next != null)
            {
                return true;
            }

            for (int b = bucketIndex + 1; b < buckets.length; b++)
            {
                if (buckets[b] != null)
                {
                    return true;
                }
            }
            return false;
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        public Object next()
        {
            if (current != null && current.next != null)
            {
                current = current.next; // Move to the next element in bucket
            }
            else // Move to next bucket
            {
                do
                {
                    bucketIndex++;
                    if (bucketIndex == buckets.length)
                    {
                        throw new NoSuchElementException();
                    }
                    current = buckets[bucketIndex];
                }
                while (current == null);
            }
            return current.data;
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }
    }
}
