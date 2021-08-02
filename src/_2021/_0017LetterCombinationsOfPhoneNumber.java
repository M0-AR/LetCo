package _2021;

import java.util.ArrayList;
import java.util.List;

public class _0017LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
        System.out.println(letterCombinations(""));
        System.out.println(letterCombinations("2"));
        System.out.println(letterCombinations("234"));
    }

    static String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs", "tuv","wxyz"};
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        // Convert to array of numbers
        char[] digitArray = digits.toCharArray();
        int[] numbers = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            numbers[i] = digitArray[i] - '0';
        }

        // Find the specified letters
        String[] str = new String[numbers.length];
        for (int i = 0; i < str.length; i++) {
            str[i] = letters[numbers[i]];
        }

        // Find all possible letter combinations
        int nStr = str.length - 1;

        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                for (int k = 0; k < str[i+1].length(); k++) {
                    result.add(String.valueOf(str[i].charAt(j)) + str[i + 1].charAt(k));
                }
            }
        }

        if (str.length == 1)
            for (int i = 0; i < str[0].length(); i++) {
                result.add(str[0].charAt(i)+"");
            }

        return result;
    }
}
