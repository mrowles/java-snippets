package stringReverse;

public class StringReverse {

    public StringReverse() {
    }

    public String reverse(String str) {
        if (str.length() < 2) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }
}
