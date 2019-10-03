package algorithms.isSubset;

import java.util.Arrays;

public class IsSubset {
    public static boolean isSubsetIterative(int[] primary, int[] subset) {
        int primaryLen = primary.length;
        int subsetLen = subset.length;

        Arrays.sort(primary);
        Arrays.sort(subset);

        for (int i = 0; i < subsetLen; i++) {
            for (int j = i; j < primaryLen; j++) {
                if (subset[i] == primary[j]) {
                    break;
                }

                // loop not broken, no match
                if (j == (primaryLen - 1)) {
                    return false;
                }
            }
        }

        return true;
    }
}
