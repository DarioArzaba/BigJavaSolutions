package e_16_11_implement_stack_using_array;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Class {@code ArrayListStack} implements {@code MyStackInterface}.
 */
public class ArrayListStack implements MyStackInterface
{
    private ArrayList array;

    /**
     * Constructs an empty stack using {@code ArrayList} as the container.
     */
    public ArrayListStack()
    {
        array = new ArrayList();
    }

    /**
     * Pushes an object onto the stack.
     *
     * @param x the object to be pushed
     * @return the object pushed
     */
    @Override
    public Object push(Object x)
    {
        array.add(x);
        return x;
    }

    /**
     * Peek at the top object on the stack.
     *
     * @return the top object on the stack
     * @throws NoSuchElementException if the stack is empty
     */
    @Override
    public Object peek()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        return array.get(array.size() - 1);
    }

    /**
     * Pop the top object off the stack.
     *
     * @return the top object which is removed
     * @throws NoSuchElementException if the stack is empty
     */
    @Override
    public Object pop()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        return array.remove(array.size() - 1);
    }

    /**
     * See whether the array is empty
     *
     * @return true if the stack is empty, false otherwise
     */
    @Override
    public boolean isEmpty()
    {
        return array.isEmpty();
    }

    /**
     * Gets the size of the stack.
     *
     * @return the current size of the stack
     */
    public int size()
    {
        return array.size();
    }
}
