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

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                double h = Math.min(height[i], height[j]);
                double w = j - i;
                int area = (int) (h * w);
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}
