package _2021;

public class _0915PartitionArrayIntoDisjointIntervals {
    public static void main(String[] args) {
        System.out.println(partitionDisjoint(new int[]{5,0,3,8,6}));
        System.out.println(partitionDisjoint(new int[]{1,1,1,0,6,12}));
        System.out.println(partitionDisjoint(new int[]{5,0,3,8,6}));
    }

    public static int partitionDisjoint(int[] nums) {
        int leftMax = 0;

        for (int i = 0; i < nums.length; i++) {

           leftMax = Math.max(leftMax, nums[i]);
           int rightMin = Integer.MAX_VALUE;

           for (int j = i + 1; j < nums.length; j++) {
                rightMin = Math.min(rightMin, nums[j]);
           }

           if (leftMax <= rightMin)
               return i + 1;
        }

        return nums.length;
    }
}
