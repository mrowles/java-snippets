package algorithms.fibonacci;

class Fibonacci {

    int recursive(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return recursive(n - 1) + recursive(n - 2);
    }

    int memoize(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        int[] memo = new int[n];
        memo[0] = 0;
        memo[1] = 1;

        for (int i = 2; i < n; i++) {
            memo[i] = memoize(i - 1) + memoize(i - 2);
        }

        return memo[n - 1] + memo[n - 2];
    }
}
