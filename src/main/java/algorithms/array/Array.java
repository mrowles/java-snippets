package algorithms.array;

import java.util.Arrays;

public class Array {
    public static int[][] spiral(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N must be > 0");
        }

        int[] dc = new int[]{1, 0, -1, 0};
        int[] dr = new int[]{0, 1, 0, -1};
        int dir = 0;
        int val = 0;
        int r = 0;
        int c = 0;
        int limit = n * n;
        int[][] matrix = new int[n][n];

        while (val++ < limit) {
            matrix[r][c] = val;
            r += dr[dir];
            c += dc[dir];

            if (spiralIsInvalid(matrix, r, c)) {
                r -= dr[dir];
                c -= dc[dir];

                dir = (dir + 1) % 4;

                r += dr[dir];
                c += dc[dir];
            }
        }

        return matrix;
    }

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

    private static boolean spiralIsInvalid(int[][] m, int r, int c) {
        return r < 0 || c < 0 || r >= m.length || c >= m.length || m[r][c] != 0;
    }
}
