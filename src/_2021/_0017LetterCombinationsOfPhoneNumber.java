package _2021;

import java.util.LinkedList;
import java.util.List;
// Solution from: https://www.youtube.com/watch?v=imD5XeNaJXA
public class _0017LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
        System.out.println(letterCombinations(""));
        System.out.println(letterCombinations("2"));
        System.out.println(letterCombinations("234"));
    }

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();

        if (digits.length() == 0) return result;

        result.add("");

        String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs", "tuv","wxyz"};

        for (int i = 0; i < digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while (result.peek().length() == i) {
                String current = result.remove();
                for (char c : letters[index].toCharArray()) {
                    result.add(current + c);
                }
            }
        }

        return result;
    }
}
