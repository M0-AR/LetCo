package _2020.August.Week1;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        System.out.println(findDuplicates1( new int[]{1,9,3,9,1,2,4,5,2} ));
    }
    // O(n) with memmory using
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


    // O(n)
    public static List<Integer> findDuplicates1(int[] nums) {
        List<Integer> res = new ArrayList();
        for (int i = 0; i < nums.length; i++){
            int abs = Math.abs(nums[i])-1;
            int number = nums[abs];
            if (number < 0)
                res.add(Math.abs(nums[i]));
            nums[Math.abs(nums[i])-1] *= -1;
        }
        return res;

    }




}

