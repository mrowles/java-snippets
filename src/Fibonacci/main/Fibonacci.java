package Fibonacci.main;

public class Fibonacci {

    public int calculateFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}
