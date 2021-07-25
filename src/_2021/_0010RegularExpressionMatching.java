package _2021;

public class _0010RegularExpressionMatching {
    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a"));
        System.out.println(isMatch("aa", "a*"));
        System.out.println(isMatch("ab", ".*"));
        System.out.println(isMatch("aab", "c*a*b"));
        System.out.println(isMatch("mississippi", "mis*is*p*."));
    }

    public static boolean isMatch(String s, String p) {
       if (!p.contains("*") && !p.contains(".")) { // No * and . case
           return s.equals(p);
       }

       if (p.contains("*") && !p.contains(".")) {
           String[] sP = new String[p.length()];
           for (int i = 0; i < p.length(); i++) {
               if (i > 1 && p.charAt(i) == '*') {
                   sP[i] = String.valueOf(p.charAt(i - 1) + p.charAt(i));
               }
           }


       }

       return false;
    }
}
