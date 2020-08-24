package _2020.August.Week1;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        System.out.println(findDuplicates( new int[]{1,1} ));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> dublicate = new ArrayList<>();
        boolean[] appearInNums = new boolean[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            if (!appearInNums[nums[i]])
                appearInNums[nums[i]] = true;
            else
                dublicate.add(nums[i]);
        }
        return dublicate;
    }
}

