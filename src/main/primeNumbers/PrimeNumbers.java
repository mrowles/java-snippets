package main.primeNumbers;

import java.util.ArrayList;
import java.util.List;

class PrimeNumbers {
    private int[] data;

    PrimeNumbers(int[] data) {
        this.data = data;
    }

    List<Integer> findPrimeNumbers() {
        List<Integer> primeList = new ArrayList<Integer>();

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
