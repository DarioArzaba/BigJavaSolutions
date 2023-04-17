package e_16_13_queue_firstToLast;

/**
 * Add a method {@code firstToLast} to the implementation of a queue in
 * Exercise E16.12. The method moves the element at the head of the queue to
 * the tail of the queue. The element that was second in line will now be at
 * the head.
 */
public class LinkedListQueueDemo
{
    public static void main(String[] args)
    {
        LinkedListQueue queue = new LinkedListQueue();

        Integer x;
        for (int i = 0; i < 10; i++) {
            x = i;
            queue.offer(x);
        }

        queue.firstToLast();
        System.out.println(queue.peek());
    }
}
