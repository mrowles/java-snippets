package algorithms.number;

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

    public static String addTwoBinaryNumbers(String n1, String n2) {
        StringBuilder result = new StringBuilder();

        int s = 0;

        int i = n1.length() - 1;
        int j = n2.length() - 1;

        while (i >= 0 || j >= 0 || s == 1) {
            // compute sum of last digits + carry
            s += ((i >= 0) ? n1.charAt(i) - '0' : 0);
            s += ((j >= 0) ? n2.charAt(j) - '0' : 0);

            result.insert(0, (char) (s % 2 + '0'));

            s /= 2;

            i--;
            j--;
        }

        return result.toString();
    }
}
