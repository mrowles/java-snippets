package algorithms.oneEditAway;

public class OneEditAway {
    public static boolean isOneEditAway(String word1, String word2) {
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

        return differences != 1 || word1Len == word2Len || (i == word1Len && j == word2Len);
    }
}
