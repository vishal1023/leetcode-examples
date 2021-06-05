package leetcode.examples.string;

public class StringToInteger {

    public int stringToInteger(String str) {
        int result = 0;
        int i = 0;
        int sign = 1;
        if (str.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        for (; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return -1;
            int n = str.charAt(i) - '0';
            result = (result * 10) + n;
        }
        return result * sign;
    }
}
