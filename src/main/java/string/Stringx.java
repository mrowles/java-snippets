package string;

public class Stringx {
    public static String reverse(String str) {
        if (str.length() < 2) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static int strstrIterative(String primaryStr, String subStr) {
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
    public static int strstrKmp(String primaryStr, String subStr) {
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

    public static boolean oneEditAwayMatch(String word1, String word2) {
        int word1Len = word1.length();
        int word2Len = word2.length();

        if (word1Len == 0 || word2Len == 0) {
            return false;
        }

        if ((word1Len - word2Len) > 1 || (word2Len - word1Len) > 1) {
            return false;
        }

        int i = 0;
        int j = 0;
        int differences = 0;

        while (i < word1Len && j < word2Len) {
            char word1Char = word1.charAt(i);
            char word2Char = word2.charAt(j);

            if (word1Char != word2Char) {
                differences++;

                if (word1Len > word2Len) {
                    i++;
                }

                if (word2Len > word1Len) {
                    j++;
                }

                if (word1Len == word2Len) {
                    i++;
                    j++;
                }
            } else {
                i++;
                j++;
            }

            if (differences > 1) {
                return false;
            }
        }

        if (differences == 1 && word1Len != word2Len && (i != word1Len || j != word2Len)) {
            return false;
        }

        return true;
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
