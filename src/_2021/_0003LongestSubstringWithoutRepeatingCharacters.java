package _2021;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _0003LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("cdd"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int i = 0, max = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);

            while (seen.contains(c))
                seen.remove(s.charAt(i++));

            seen.add(c);
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}
