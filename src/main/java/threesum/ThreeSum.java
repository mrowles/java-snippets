package threesum;

public class ThreeSum {
    // find 3 numbers in an array that add up to equal a determined sum
    public static int[] recursive(int[] args, int sum) {
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
}
