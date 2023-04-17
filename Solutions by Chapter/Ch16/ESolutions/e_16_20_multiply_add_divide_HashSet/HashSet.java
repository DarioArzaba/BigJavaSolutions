package e_16_20_multiply_add_divide_HashSet;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class implements a hash set using separate chaining.
 */
public class HashSet {

    private Node[] buckets;
    private int currentSize;
    private int prime;

    /**
     * Constructs a hash table.
     *
     * @param bucketsLength the length of the buckets array
     */
    public HashSet(final int bucketsLength) {
        buckets = new Node[bucketsLength];
        currentSize = 0;
        prime = nearestLargerPrime();
    }

    private int multiplyAddDivide(Object x) {
        int a = (int) (Math.random() * (prime - 1)) + 1;    // 1 to prime - 1
        int b = (int) (Math.random() * (prime));            // 0 to prime - 1
        int h = x.hashCode();
        h = ((a * h + b) % prime) % buckets.length;
        if (h < 0) {
            h = -h;
        }
        return h;
    }

    /**
     * Finds nearest prime number that is larger
     * than the {@code buckets.length}.
     *
     * @return nearest larger prime that is larger than {@code buckets.length}
     */
    private int nearestLargerPrime() {
        int prime = 0;
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if (isPrime(i) && i > buckets.length) {
                prime = i;
                break;
            }
        }
        return prime;
    }

    /**
     * @return true if the argument to the method is prime number
     */
    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Tests for set membership.
     *
     * @param x an object
     * @return true if x is an element of this set
     */
    public boolean contains(Object x) {
        int h = multiplyAddDivide(x);

        Node current = buckets[h];
        while (current != null) {
            if (current.data.equals(x)) {
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
     * @return true if x is a new object, false if x was
     * already in the set
     */
    public boolean add(Object x) {
        int h = multiplyAddDivide(x);

        Node current = buckets[h];
        while (current != null) {
            if (current.data.equals(x)) {
                return false;
            }
            // Already in the set
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
     * Removes an object from this set.
     *
     * @param x an object
     * @return true if x was removed from this set, false
     * if x was not an element of this set
     */
    public boolean remove(Object x) {
        int h = multiplyAddDivide(x);

        Node current = buckets[h];
        Node previous = null;
        while (current != null) {
            if (current.data.equals(x)) {
                if (previous == null) {
                    buckets[h] = current.next;
                } else {
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
    public Iterator iterator() {
        return new HashSetIterator();
    }

    /**
     * Gets the number of elements in this set.
     *
     * @return the number of elements
     */
    public int size() {
        return currentSize;
    }

    class Node {

        public Object data;
        public Node next;
    }

    class HashSetIterator implements Iterator {

        private int bucketIndex;
        private Node current;

        /**
         * Constructs a hash set iterator that points to the
         * first element of the hash set.
         */
        public HashSetIterator() {
            current = null;
            bucketIndex = -1;
        }

        public boolean hasNext() {
            if (current != null && current.next != null) {
                return true;
            }
            for (int b = bucketIndex + 1; b < buckets.length; b++) {
                if (buckets[b] != null) {
                    return true;
                }
            }
            return false;
        }

        public Object next() {
            if (current != null && current.next != null) {
                current = current.next; // Move to next element in bucket
            } else { // Move to next bucket
                do {
                    bucketIndex++;
                    if (bucketIndex == buckets.length) {
                        throw new NoSuchElementException();
                    }
                    current = buckets[bucketIndex];
                } while (current == null);
            }
            return current.data;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
