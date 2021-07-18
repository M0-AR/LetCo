package _2021;

public class _0005LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("ac"));
    }

    public static String longestPalindrome(String s) {
        int maxLength = 0, start = -1;

        for (int i = 0; i < s.length(); i++) {
            int length = Math.max(getLength(i, i, s), getLength(i, i + i, s));

            if (maxLength < length) {
                maxLength = length;
                start = i - (length - 1) / 2;
            }
        }

        return s.substring(start, start + maxLength);
    }

    private static int getLength(int i, int j, String s) {
        if (j >= s.length()) return 0;

        int length = (i == j) ? -1 : 0;

        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) != s.charAt(j)) break;

            length += 2;
            i--; j++;
        }

        return length;
    }

}
