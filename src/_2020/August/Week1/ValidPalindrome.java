package _2020.August.Week1;

public class ValidPalindrome {
    public static void main(String[] args) {

        long sStart = System.nanoTime();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome( s ));

        s = "race a car";
        System.out.println(isPalindrome( s ));

        s = "aa";
        System.out.println(isPalindrome( s ));
        long sFinish = System.nanoTime();
        System.out.println(sFinish-sStart);


        long s1Start = System.nanoTime();
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome1( s1 ));

        s1 = "race a car";
        System.out.println(isPalindrome1( s1 ));

        s1 = "aa";
        System.out.println(isPalindrome1( s1 ));
        long s1Finish = System.nanoTime();
        System.out.println(s1Finish-s1Start);

    }

    public static boolean isPalindrome(String s) {
        String newString = justAlphanumeric(s);
        if (s.length() < 2)
            return true;
        for(int i = 0, j = newString.length()-1; i < newString.length(); i++,j--) {
            if(newString.charAt(i) != newString.charAt(j))
                return false;
        }
        return true;
    }


    public static String justAlphanumeric(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit( s.charAt(i) ))
                newString += Character.toLowerCase( s.charAt(i) );
        }
        return newString;
    }

    public static boolean isPalindrome1(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        for(int i=0;i<s.length()/2;i++) {
            if(!(s.charAt(i)==s.charAt(s.length()-i-1)))
                return false;
        }
        return true;
    }
}

