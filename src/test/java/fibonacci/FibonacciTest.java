package fibonacci;

import static org.junit.Assert.assertEquals;

import com.google.common.base.Stopwatch;
import org.junit.Before;
import org.junit.Test;
import sorting.Sorting;

import java.util.concurrent.TimeUnit;

public class FibonacciTest {
    private Stopwatch sw;

    @Before
    public void setup() throws Exception {
        sw = Stopwatch.createUnstarted();
    }

    @Test
    public void testRecursive() throws Exception {
        Fibonacci fibonacci = new Fibonacci();

        sw.start();
        assertEquals(1, fibonacci.recursive(1));
        assertEquals(1, fibonacci.recursive(2));
        assertEquals(2, fibonacci.recursive(3));
        assertEquals(3, fibonacci.recursive(4));
        assertEquals(5, fibonacci.recursive(5));
        assertEquals(8, fibonacci.recursive(6));
        assertEquals(13, fibonacci.recursive(7));
        assertEquals(21, fibonacci.recursive(8));
        assertEquals(34, fibonacci.recursive(9));
        assertEquals(55, fibonacci.recursive(10));
        assertEquals(89, fibonacci.recursive(11));
        assertEquals(144, fibonacci.recursive(12));
        sw.stop();
        System.out.println(sw.elapsed(TimeUnit.NANOSECONDS) + " ns - recursive runtime");
    }

    @Test
    public void testMemoize() throws Exception {
        Fibonacci fibonacci = new Fibonacci();

        sw.start();
        assertEquals(1, fibonacci.memoize(1));
        assertEquals(1, fibonacci.memoize(2));
        assertEquals(2, fibonacci.memoize(3));
        assertEquals(3, fibonacci.memoize(4));
        assertEquals(5, fibonacci.memoize(5));
        assertEquals(8, fibonacci.memoize(6));
        assertEquals(13, fibonacci.memoize(7));
        assertEquals(21, fibonacci.memoize(8));
        assertEquals(34, fibonacci.memoize(9));
        assertEquals(55, fibonacci.memoize(10));
        assertEquals(89, fibonacci.memoize(11));
        assertEquals(144, fibonacci.memoize(12));
        sw.stop();
        System.out.println(sw.elapsed(TimeUnit.NANOSECONDS) + " ns - memoize runtime");
    }
}