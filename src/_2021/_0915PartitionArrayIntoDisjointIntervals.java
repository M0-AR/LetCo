package _2021;

public class _0915PartitionArrayIntoDisjointIntervals {
    public static void main(String[] args) {

    }

    public static int partitionDisjoint(int[] nums) {
        int maxIndex = 0;
        int max = nums[0];

        for (int i = 1; i < nums.length / 2; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }

        return -1;
    }
}
