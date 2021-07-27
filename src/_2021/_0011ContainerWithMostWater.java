package _2021;

public class _0011ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[] {1,1}));
        System.out.println(maxArea(new int[] {4,3,2,1,4}));
        System.out.println(maxArea(new int[] {1,2,1}));
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;

        for (int i = 0, j = height.length - 1; i < j;) {
            int h = Math.min(height[i], height[j]);
            int w = j - i;
            int area = (h * w);
            maxArea = Math.max(maxArea, area);
            if (height[i] < height[j])
                i++;
            else
                j--;
        }

        return maxArea;
    }
}
