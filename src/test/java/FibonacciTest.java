import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    private void assertFibonacciOf(int n, int expected) {
        assertEquals(expected, Fibonacci.of(n));
    }

    @Test
    public void zero() throws Exception {
        assertFibonacciOf(0, 0);
    }

    @Test
    public void one() throws Exception {
        assertFibonacciOf(1, 1);
    }

    @Test
    public void two() throws Exception {
        assertFibonacciOf(2, 1);
    }
}
