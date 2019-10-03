package algorithms.palindrome;

import java.util.stream.IntStream;

public class Palindrome {
    public boolean simple(String x) {
        String clean = x.replaceAll("\\s+", "").toLowerCase();
        int len = clean.length();
        int forward = 0;
        int backward = len - 1;

        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar) {
                return false;
            }
        }

        return true;
    }

    public boolean reverseTheString(String x) {
        StringBuilder reverse = new StringBuilder();
        String clean = x.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();

        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }

        return (reverse.toString()).equals(clean);
    }

    public boolean streams(String x) {
        String clean = x.replaceAll("\\s+", "").toLowerCase();

        return IntStream.range(0, clean.length() / 2)
                .noneMatch(i -> clean.charAt(i) != clean.charAt(clean.length() - i - 1));
    }

    public boolean recursive(String x) {
        String clean = x.replaceAll("\\s+", "").toLowerCase();

        return recurse(clean, 0, clean.length() - 1);
    }

    private boolean recurse(String x, int forward, int backward) {
        if (forward == backward) {
            return true;
        }

        if ((x.charAt(forward)) != (x.charAt(backward))) {
            return false;
        }

        if (forward < backward + 1) {
            return recurse(x, forward + 1, backward - 1);
        }

        return true;
    }
}
