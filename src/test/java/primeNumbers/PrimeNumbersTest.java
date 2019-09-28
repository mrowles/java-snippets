package primeNumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.List;

public class PrimeNumbersTest {

    @Test
    public void findPrimeNumbers() {
        int[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        PrimeNumbers primeNumbers = new PrimeNumbers(data);

        List<Integer> results = primeNumbers.findPrimeNumbers();

        assertEquals(2, results.get(0).intValue());
        assertEquals(3, results.get(1).intValue());
        assertEquals(5, results.get(2).intValue());
        assertEquals(7, results.get(3).intValue());
        assertEquals(11, results.get(4).intValue());
    }
}
