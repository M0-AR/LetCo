package _2021;

public class _0005LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("ac"));
    }

    public static String longestPalindrome(String s) {
        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j++) {
                //if ()
            }
        }
        return "";
    }

}
