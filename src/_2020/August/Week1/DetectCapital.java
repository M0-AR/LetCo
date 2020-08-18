package _2020.August.Week1;

import java.sql.Time;

public class DetectCapital {
    public static void main(String[] args) {
        long start1 = System.nanoTime();
        System.out.println(detectCapitalUse( "USA" ));
        System.out.println(detectCapitalUse( "FlaG" ));
        long finish1 = System.nanoTime();
        System.out.println(finish1-start1);


        long start2 = System.nanoTime();
        System.out.println(detectCapitalUse1( "USA" ));
        System.out.println(detectCapitalUse1( "FlaG" ));
        long finish2 = System.nanoTime();
        System.out.println(finish2-start2);


    }

    public static boolean detectCapitalUse(String word) {
        return word.toUpperCase().equals( word ) ||
                word.toLowerCase().equals( word) ||
                (word.charAt( 0 ) >= 'A'  && checkLowerCase(word));
    }


    public static boolean checkLowerCase(String word) {
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt( i ) < 'a' || word.charAt( i ) > 'z') {
                return false;
            }
        }
        return true;
    }



    public static boolean IsCapitalCharacter(char c){
        if(c >= 'A' && c <= 'Z'){
            return true;
        }
        return false;
    }
    public static boolean detectCapitalUse1(String word) {
        boolean result = false;
        char C;
        int cChar = 0;
        int wordLength = word.length();

        for(int i = 0; i < wordLength; ++i){
            C = word.charAt(i);
            if(IsCapitalCharacter(C)){
                cChar++;
            }
        }
        C = word.charAt(0);
        if(cChar == 1 && IsCapitalCharacter(C)){
            return true;
        }

        if(cChar == wordLength || cChar == 0){
            result = true;
        }else{
            result = false;
        }

        return result;
    }
}
