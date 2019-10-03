package algorithms.addTwoBinaryNumbers;

public class AddTwoBinaryNumbers {
    public static String addTwoBinaryNumbers(String n1, String n2) {
        StringBuilder result = new StringBuilder();

        int s = 0;

        int i = n1.length() - 1;
        int j = n2.length() - 1;

        while (i >= 0 || j >= 0 || s == 1) {
            // compute sum of last digits + carry
            s += ((i >= 0) ? n1.charAt(i) - '0' : 0);
            s += ((j >= 0) ? n2.charAt(j) - '0' : 0);

            result.insert(0, (char) (s % 2 + '0'));

            s /= 2;

            i--;
            j--;
        }

        return result.toString();
    }
}
