package _2021;

public class _0009PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(-101));
    }

    public static boolean isPalindrome0(int x) {
        if (x < 0)
            return false;

        String n = String.valueOf(x);
        for (int i = 0, j = n.length() - 1; i < n.length(); i++, j--) {
            if (i == j)
                return true;
            else if (n.charAt(i) != n.charAt(j))
                return false;
        }

        return true;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int reverse = 0, copy = x;
        while (copy > 0) {
            reverse = reverse*10 + copy%10;
            copy /= 10;
        }

        if (reverse == x)
            return true;
        else
            return false;
    }
}
