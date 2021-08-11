package _2021;

import java.util.HashMap;
import java.util.Map;

public class _0020ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> characters =
                new HashMap<Character, Character>(){{
                    put('(', ')');
                    put('{', '}');
                    put('[', ']');
        }};

        System.out.println(characters.get(')'));

        for (int i = 0; i < s.length(); i+=2) {

        }
        return true;
    }
}
