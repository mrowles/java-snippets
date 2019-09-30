package lookAndSay;

public class LookAndSay {
    public static String iterative(int n) {
        if (n == 1) {
            return "1";
        }

        if (n == 2) {
            return "11";
        }

        StringBuilder str = new StringBuilder();
        str.append("11");

        for (int i = 3; i <= n; i++) {
            str.append('$'); // add dummy char for extra iteration below
            int len = str.length();
            int cnt = 1;
            StringBuilder tmp = new StringBuilder();

            for (int j = 1; j < len; j++) {
                if (str.charAt(j) != str.charAt(j - 1)) {
                    tmp.append(cnt);
                    tmp.append(str.charAt(j - 1));
                    cnt = 1;
                } else {
                    cnt++;
                }
            }

            str = tmp;
        }

        return str.toString();
    }
}
