package array;

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

            if (isInvalid(matrix, r, c)) {
                r -= dr[dir];
                c -= dc[dir];

                dir = (dir + 1) % 4;

                r += dr[dir];
                c += dc[dir];
            }
        }

        return matrix;
    }

    private static boolean isInvalid(int[][] m, int r, int c) {
        return r < 0 || c < 0 || r >= m.length || c >= m.length || m[r][c] != 0;
    }
}
