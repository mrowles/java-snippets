package algorithms.abcCount;

public class AbcCount {
    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    // length = n, aCount < n, bCount <= 1, cCount <=2
    public static int findCombinations(int n) {
        int aCount;
        int bCount;
        int cCount;
        int result = 0;

        for (int a = 0; a <= n; a++) {
            aCount = a;

            for (int b = 0; b <= n - aCount; b++) {
                bCount = b;

                if (bCount > 1) {
                    continue;
                }

                cCount = n - (aCount + bCount);

                if (cCount > 2) {
                    continue;
                }

                System.out.println(aCount + " " + bCount + " " + cCount);
                result = result + (factorial(n) / (factorial(aCount) * factorial(bCount) * factorial(cCount)));
            }
        }

        return result;
    }
}
