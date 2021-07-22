package _2021;

public class _0007ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(0));
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        String s = String.valueOf(x);
        if (s.length() <= 1) {
            return x;
        }
        String number = "";

        int n = x;
        int l = s.length();
        for (int i = l - 1; i >= 0; i--) {
            number = number + ((i == l - 1 && s.charAt(i) == '0' || s.charAt(i) == '-') ? "" : s.charAt(i));
            s = String.valueOf(n / 10);
        }

        long outSideRange = Long.parseLong(number);
        if (outSideRange < Integer.MIN_VALUE || outSideRange > Integer.MAX_VALUE)
            return 0;

        if (x < 0) {
            n = Integer.parseInt(number);
            n *= -1;
        }
        else {
            n = Integer.parseInt(number);
        }

        return n;
    }
}
