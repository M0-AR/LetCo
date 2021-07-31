package _2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0015ThreeSum {
    public static void main(String[] args) {
        /*System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
        System.out.println(threeSum(new int[]{}));
        System.out.println(threeSum(new int[]{0}));*/
        System.out.println(threeSumOptimizeSolution(new int[]{-1,0,1,2,-1,-4}));
        System.out.println(threeSumOptimizeSolution(new int[]{}));
        System.out.println(threeSumOptimizeSolution(new int[]{0}));
        System.out.println(threeSumOptimizeSolution(new int[]{0,0,0,0}));
        System.out.println(threeSumOptimizeSolution(new int[]{-2,0,1,1,2}));
    }

    public static List<List<Integer>> threeSumOptimizeSolution(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int listIndex = 0;

        if (nums.length == 0) return list;
        else if (nums.length == 1 && nums[0] == 0) return list;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int n = nums[i] + nums[left] + nums[right];

                if (n == 0) {
                    if (!list.contains(Arrays.asList(nums[i], nums[left], nums[right]))) {
                        list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                    }else
                        left++;
                }
                else if (n > 0) right--;
                else if (n < 0) left++;
            }
        }

        return list;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int listIndex = 0;

        if (nums.length == 0) return list;
        else if (nums.length == 1 && nums[0] == 0) return list;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int zero = nums[i] + nums[j] + nums[k];
                    if (zero == 0)
                        if (!list.contains(Arrays.asList(nums[i], nums[j], nums[k])))
                            list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
            }
        }

        return list;
    }
}
