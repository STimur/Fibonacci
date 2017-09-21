import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    @Test
    public void zero() throws Exception {
        assertEquals(0, Fibonacci.of(0));
    }

    @Test
    public void one() throws Exception {
        assertEquals(1, Fibonacci.of(1));
    }
}
