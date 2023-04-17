package e_16_13_queue_firstToLast;

/**
 * {@code LinkedListQueue} class.
 */
public class LinkedListQueue
{
    private Node first;
    private Node last;
    private int size;

    /**
     * Inserts an element at the rear of the queue.
     *
     * @param element the element to add
     * @return true
     */
    public boolean offer(Object element)
    {
        // Check for empty queue
        if (first == null)
        {
            last = new Node();
            last.data = element;
            first = last;
        }
        else
        {
            // Allocate a new node at end, store item in it, and
            // link it to old end of queue.
            last.next = new Node();
            last = last.next;
            last.data = element;
        }
        size++;
        return true;
    }

    /**
     * Remove the entry at the front of the queue and
     * return it if the queue is not empty.
     *
     * @return the item removed if successful, or null otherwise
     */
    public Object poll()
    {
        Object element = peek();
        if (element == null)
        {
            return null;
        }
        else
        {
            first = first.next;
            size--;
            return element;
        }
    }

    /**
     * Return the item at the front of the queue without removing it.
     *
     * @return the item at the front of the queue if successful;
     * return null if queue is empty
     */
    public Object peek()
    {
        if (size == 0)
        {
            return null;
        }
        else
        {
            return first.data;
        }
    }

    /**
     * Moves the element at the head of the queue to the tail of the queue.
     * The element that was second in line will now be at the head.
     *
     * @return the first element that has been moved to the tail of the queue
     */
    public Object firstToLast()
    {
        Object firstElement = peek();
        if (firstElement == null)
        {
            return null;
        }
        else
        {
            last.next = first;
            first = first.next;
            last = last.next;
            return firstElement;
        }
    }

    /**
     * Gets the size of this queue.
     *
     * @return current size
     */
    public int size()
    {
        return size;
    }

    class Node
    {
        public Object data;
        public Node next;
    }
}
