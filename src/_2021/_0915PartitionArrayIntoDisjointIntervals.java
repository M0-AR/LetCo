package _2021;

public class _0915PartitionArrayIntoDisjointIntervals {
    public static void main(String[] args) {
        System.out.println(partitionDisjoint(new int[]{5,0,3,8,6}));
        System.out.println(partitionDisjoint(new int[]{1,1,1,0,6,12}));
        System.out.println(partitionDisjoint(new int[]{5,0,3,8,6}));
    }

    public static int partitionDisjoint(int[] nums) {
        int leftMax = nums[0], globalMax = nums[0], index = 0;

        for (int i = 1; i < nums.length; i++) {
            globalMax = Math.max(globalMax, nums[i]);
            if (nums[i] < leftMax) {
                leftMax = globalMax;
                index = i;
            }
        }

        return index + 1;
    }
}
