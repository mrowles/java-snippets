package fibonacci;

class Fibonacci {

    int recursive(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return recursive(n - 1) + recursive(n - 2);
    }
}
