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
}
