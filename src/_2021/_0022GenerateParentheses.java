package _2021;

import java.util.ArrayList;
import java.util.List;
// Solution By: https://www.youtube.com/watch?v=qBbZ3tS0McI
public class _0022GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
        System.out.println(generateParenthesis(3));
        System.out.println(generateParenthesis(1));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        backtrack(list, "", 0, 0, n);

        return list;
    }

    private static void backtrack(List<String> list, String s, int open, int close, int max) {
        if (s.length() == max*2) {
            list.add(s);
            return;
        }

        if (open < max) backtrack(list, s + "(", open + 1, close, max);
        if (close < open) backtrack(list, s + ")", open, close + 1, max);
    }
}
