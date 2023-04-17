package e_16_11_implement_stack_using_array;

/**
 * Stack interface.
 */
public interface MyStackInterface
{
    /**
     * Pushes an item onto the top of the stack and returns the item pushed.
     *
     * @param x the object to be inserted
     * @return the object inserted
     */
    Object push(Object x);

    /**
     * Returns the object at the top of the stack without removing it.
     *
     * @return the object at the top of the stack
     * @throws java.util.NoSuchElementException if stack is empty
     */
    Object peek();

    /**
     * Returns the object at the top of the stack and removes it.
     *
     * @return the object at the top of the stack
     * @throws java.util.NoSuchElementException if stack is empty
     */
    Object pop();

    /**
     * Returns true if the stack is empty; otherwise, returns false.
     *
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();
}
