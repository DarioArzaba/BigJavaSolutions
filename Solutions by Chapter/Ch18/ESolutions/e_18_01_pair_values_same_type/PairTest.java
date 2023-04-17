package e_18_01_pair_values_same_type;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * {@code PairTest} test class.
 */
public class PairTest
{
    private Pair<String> stringPair;
    private Class stringClass;

    @Before
    public void setUp() throws Exception
    {
        stringPair = new Pair<>("Harry", "Carl");
        stringClass = String.class;
    }

    @Test
    public void getFirst() throws Exception
    {
        Class first = stringPair.getFirst().getClass();
        assertThat(first, equalTo(stringClass));
    }

    @Test
    public void getSecond() throws Exception
    {
        Class second = stringPair.getSecond().getClass();
        assertThat(second, is(equalTo(stringClass)));
    }

    @After
    public void tearDown() throws Exception
    {
        stringPair = null;
        stringClass = null;
    }
}
