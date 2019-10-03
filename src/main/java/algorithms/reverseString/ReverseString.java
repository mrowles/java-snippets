package algorithms.reverseString;

public class ReverseString {
    public static String reverse(String str) {
        if (str.length() < 2) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }
}
