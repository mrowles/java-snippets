package algorithms.strStr;

public class StrStr {
    public static int iterative(String primaryStr, String subStr) {
        if (subStr.length() > primaryStr.length()) {
            return -1;
        }

        if (subStr.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= primaryStr.length() - subStr.length(); i++) {
            int j;

            for (j = 0; j < subStr.length(); j++) {
                if (subStr.charAt(j) != primaryStr.charAt(i + j)) {
                    break;
                }
            }

            if (j == subStr.length()) {
                return i;
            }
        }

        return -1;
    }

    // https://en.wikipedia.org/wiki/Knuth-Morris-Pratt_algorithm
    public static int kmp(String primaryStr, String subStr) {
        if (subStr.length() > primaryStr.length()) {
            return -1;
        }

        if (subStr.length() == 0) {
            return 0;
        }

        int[] next = getKmpArray(subStr);
        int i = 0;

        while (i <= primaryStr.length() - subStr.length()) {
            int success = 1;

            for (int j = 0; j < subStr.length(); j++) {
                // match first character of substring to current pointer
                if (subStr.charAt(0) != primaryStr.charAt(i)) {
                    success = 0;
                    i++;
                    break;
                }
                //
                else if (subStr.charAt(j) != primaryStr.charAt(i + j)) {
                    success = 0;
                    i = i + j - next[j - 1];
                    break;
                }
            }

            if (success == 1) {
                return i;
            }
        }

        return -1;
    }

    private static int[] getKmpArray(String subStr) {
        int[] next = new int[subStr.length()];
        next[0] = 0;

        for (int i = 1; i < subStr.length(); i++) {
            int index = next[i - 1];

            while (index > 0 && subStr.charAt(index) != subStr.charAt(i)) {
                index = next[index - 1];
            }

            if (subStr.charAt(index) == subStr.charAt(i)) {
                next[i] = next[i - 1] + 1;
            } else {
                next[i] = 0;
            }
        }

        return next;
    }
}
