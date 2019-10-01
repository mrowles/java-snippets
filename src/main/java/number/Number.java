package number;

import java.util.ArrayList;
import java.util.List;

public class Number {
    public static int reverseInt(int n) {
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return reversed;
    }

    public static List<Integer> findPrimeNumbers(int[] data) {
        List<Integer> primeList = new ArrayList<>();

        if (data.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Zero numbers passed");
        }

        for (int possiblePrimeNumber : data) {

            if (possiblePrimeNumber > 1) {
                boolean isPrime = true;
                int count = 0;

                for (int divisor = 1; divisor <= possiblePrimeNumber; divisor++) {
                    if (possiblePrimeNumber % divisor == 0) {
                        count++;
                    }

                    if (count > 2) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primeList.add(possiblePrimeNumber);
                }
            }
        }

        return primeList;
    }
}
