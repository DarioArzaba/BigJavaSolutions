package e_16_12_queue_implementation;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * {@code ListQueue} class that implements {@code Queue} interface.
 */
public class ListQueue extends AbstractQueue implements Queue
{
    private Node first;
    private Node last;
    private int size;

    @Override
    public Iterator iterator()
    {
        return new Iterator()
        {
            Node current = first;

            @Override
            public boolean hasNext()
            {
                return current != null;
            }

            @Override
            public Object next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                }
                else
                {
                    Node returnNode = current;
                    current = current.next;
                    return returnNode.data;
                }
            }

            @Override
            public void remove()
            {
                throw new UnsupportedOperationException("remove");
            }
        };
    }

    /**
     * Gets the size of the list.
     *
     * @return current size
     */
    @Override
    public int size()
    {
        return size;
    }

    /**
     * Inserts an element at the rear of the queue.
     *
     * @param o the element to add
     * @return true
     */
    @Override
    public boolean offer(Object o)
    {
        // Check for empty queue
        if (first == null)
        {
            last = new Node(o);
            first = last;
        }
        else
        {
            // Allocate a new node at end, store item in it, and
            // link it to old end of queue.
            last.next = new Node(o);
            last = last.next;
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
    @Override
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
    @Override
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
     * A Node is a building block for a single-linked list.
     */
    private static class Node
    {
        private Object data;
        private Node next;

        /**
         * Creates a new node with a null next field.
         *
         * @param data the data stored
         */
        private Node(Object data)
        {
            this.data = data;
            this.next = null;
        }

        /**
         * Creates a new node that references another node.
         *
         * @param data    the data stored
         * @param nodeRef the node referenced by new node
         */
        private Node(Object data, Node nodeRef)
        {
            this.data = data;
            this.next = nodeRef;
        }
    }
}
