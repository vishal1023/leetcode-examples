package leetcode.examples.string;

public class MultiplyTwoStrings {


    public String multiplyStrings(String num1, String num2) {
        String temp1 = num1;
        String temp2 = num2;

        if (num1.charAt(0) == '-')
            num1 = num1.substring(1);

        if (num2.charAt(0) == '-')
            num2 = num2.substring(1);

        int len1 = num1.length();
        int len2 = num2.length();

        if (len1 == 0 || len2 == 0) return "0";

        int[] result = new int[len1 + len2];

        int i_n1 = 0;
        int i_n2;

        for (int i = len1 - 1; i >= 0; i--) {
            int carry = 0;
            int n1 = num1.charAt(i) - '0';
            i_n2 = 0;

            for (int j = len2 - 1; j >= 0; j--) {
                int n2 = num2.charAt(j) - '0';
                int sum = n1 * n2 + result[i_n1 + i_n2] + carry;
                carry = sum / 10;
                result[i_n1 + i_n2] = sum % 10;
                i_n2++;
            }

            if (carry > 0) {
                result[i_n1 + i_n2] += carry;
            }
            i_n1++;
        }

        int i = result.length - 1;

        while (i >= 0 && result[i] == 0)
            i--;

        if (i == -1) return "0";

        StringBuilder sb = new StringBuilder();
        while (i >= 0) {
            sb.append(result[i--]);
        }

        if ((temp1.charAt(0) == '-' && temp2.charAt(0) != '-') ||
                (temp1.charAt(0) != '-' && temp2.charAt(0) == '-')) {
            sb.insert(0, '-');
        }
        return sb.toString();
    }
}
