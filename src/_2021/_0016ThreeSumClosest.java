package _2021;

import java.util.Arrays;
// Solution by
// https://www.youtube.com/watch?v=qBr2hq4daWE
public class _0016ThreeSumClosest {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4}, 1));
        System.out.println(threeSumClosest(new int[]{0,0,0}, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int sum = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (currentSum > target) right--;
                else left++;

                if (Math.abs(currentSum - target) < Math.abs(sum - target))
                    sum = currentSum;
            }
        }

        return sum;
    }
}
