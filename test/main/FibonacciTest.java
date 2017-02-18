package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFibonacci() throws Exception {
        Fibonacci fibonacci = new Fibonacci();

        assertEquals(1, fibonacci.calculateFibonacci(1));
        assertEquals(1, fibonacci.calculateFibonacci(2));
        assertEquals(2, fibonacci.calculateFibonacci(3));
        assertEquals(3, fibonacci.calculateFibonacci(4));
        assertEquals(5, fibonacci.calculateFibonacci(5));
        assertEquals(8, fibonacci.calculateFibonacci(6));
        assertEquals(13, fibonacci.calculateFibonacci(7));
        assertEquals(21, fibonacci.calculateFibonacci(8));
        assertEquals(34, fibonacci.calculateFibonacci(9));
        assertEquals(55, fibonacci.calculateFibonacci(10));
        assertEquals(89, fibonacci.calculateFibonacci(11));
        assertEquals(144, fibonacci.calculateFibonacci(12));
    }

}