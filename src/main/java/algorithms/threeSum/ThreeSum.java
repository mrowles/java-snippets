package algorithms.threeSum;

import java.util.HashSet;

public class ThreeSum {
    // find 3 numbers in an algorithms.array that add up to equal a determined sum
    public static int[] iterative(int[] args, int sum) {
        for (int i = 0; i < args.length; i++) {
            for (int j = i; j < args.length; j++) {
                for (int k = j; k < args.length; k++) {
                    if (args[i] + args[j] + args[k] == sum) {
                        return new int[]{args[i], args[j], args[k]};
                    }
                }
            }
        }

        return null;
    }

    public static int[] hashing(int[] args, int sum) {
        for (int i = 0; i < args.length - 2; i++) {
            HashSet<Integer> s = new HashSet<>();
            int currentSum = sum - args[i];

            for (int j = i + 1; j < args.length; j++) {
                if (s.contains(currentSum - args[j]) && (currentSum - args[j]) != (s.size() - 1)) {
                    return new int[]{args[i], args[j], currentSum - args[j]};
                }
                s.add(args[j]);
            }
        }

        return null;
    }
}
