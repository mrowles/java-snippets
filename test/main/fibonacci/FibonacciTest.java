package main.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFibonacci() throws Exception {
        Fibonacci fibonacci = new Fibonacci();

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
    }

}