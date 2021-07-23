package _2021;

public class _0008StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("+1"));
        System.out.println(myAtoi("+-12"));
        System.out.println(myAtoi("00000-42a1234"));
        System.out.println(myAtoi("9223372036854775808"));
    }

    public static int myAtoi(String s) {
        if (s == null)
            return 0;

        // Handle whitespace
        s = s.trim();

        if ( s.length() == 0)
            return 0;

        double n = 0;
        int startIndex = 0;
        boolean isNegative = false;

        // Handle positive and negative sign
        if (s.charAt(0) == '+') {
            startIndex = 1;
        }
        else if (s.charAt(0) == '-') {
            startIndex = 1;
            isNegative = true;
        }



        // Handle normal case "123"
        for (int i = startIndex; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                break;
            }
            n = (n * 10) + (s.charAt(i) - '0');
        }

        if (isNegative) {
           n = -n;
        }

        // Handle out of Integer range
        if(n < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else if (n > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        return (int) n;
    }
}
