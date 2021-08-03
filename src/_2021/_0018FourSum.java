package _2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Todo:
public class _0018FourSum {
    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{1,0,-1,0,-2,2}, 0));
        System.out.println(fourSum(new int[]{2,2,2,2,2}, 8));
        System.out.println(fourSum(new int[]{0,0,0,0}, 0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();


        if (nums.length == 4) {
            int sum = nums[0] + nums[1] + nums[2] + nums[nums.length - 1];
            if (sum == target)
                result.add(new ArrayList<>(Arrays.asList(nums[0], nums[1], nums[2], nums[nums.length - 1])));

            return result;
        }


        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 4; i++) {
            for (int j = i + 1; j < nums.length - 3; j++) {
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[j] + nums[right];
                    if (target == sum && !result.contains(Arrays.asList(nums[i], nums[left], nums[j], nums[right]))) {
                        result.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[j], nums[right])));
                    }

                    if (sum <= 0) left++;
                    else right--;
                }
            }
        }
        return result;
    }
}
