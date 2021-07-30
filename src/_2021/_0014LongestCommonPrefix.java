package _2021;

import java.util.Arrays;

public class _0014LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[]{"cir","car"}));
        System.out.println(longestCommonPrefix(new String[]{"reflower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"c","acc","ccc"}));
        System.out.println(longestCommonPrefix(new String[]{"ab","a"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];

        Arrays.sort(strs);

        String sol = "";
        int l = strs.length;

        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[l - 1].charAt(i) == strs[0].charAt(i))
                sol = sol + strs[0].charAt(i);
            else
                break;
        }

        return sol;
    }

    public static String longestCommonPrefix1(String[] strs) {
        if (strs.length == 1)
            return strs[0];

        String longestCommonPrefix = "";

        int n = strs[0].length();


        boolean isSub = false;
        String sub = "";
        for (int i = 0; i < n; i++) {
            sub = strs[0].substring(0, i + 1);

            for (int j = 1; j < strs.length; j++) {
                int length =strs[j].length();
                if (i >= length) {
                    isSub = false;
                    break;
                }
                String secondSub = strs[j].substring(0, i + 1);
                if (secondSub.equals(sub)) {
                    isSub = true;
                } else {
                   isSub = false;
                   break;
                }
            }

            if (longestCommonPrefix.length() < sub.length() && isSub)
                longestCommonPrefix = sub;
        }

        return longestCommonPrefix;
    }


}
