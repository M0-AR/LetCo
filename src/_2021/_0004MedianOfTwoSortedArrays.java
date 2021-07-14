package _2021;

public class _0004MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
        System.out.println(findMedianSortedArrays(new int[]{0,0}, new int[]{0,0}));
        System.out.println(findMedianSortedArrays(new int[]{}, new int[]{1}));
        System.out.println(findMedianSortedArrays(new int[]{2}, new int[]{}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;

        int m = nums1.length;
        int n = nums2.length;

        if (m == 0 && n == 0) {
           median = 0;
        }
        else if (m == 0) {
            int index = n / 2;

            if (n % 2 == 0) {
                median = (nums2[index] + nums2[index - 1]) / 2.0;
            } else {
                median = nums2[index];
            }
        }
        else if (n == 0) {
            int index = m / 2;

            if (m % 2 == 0) {
                median = (nums1[index] + nums1[index - 1]) / 2.0;
            } else {
                median = nums1[index];
            }
        }
        else {
            int totalSize = m + n;

            int[] merge = new int[(totalSize / 2) + 1];

            int i = 0;
            int j = 0;
            int k = 0;

            while (i < m && j < n) {
                if (nums1[i] < nums2[j]) {
                    merge[k] = nums1[i++];
                }
                else if (nums2[j] < nums1[i]) {
                    merge[k] = nums2[j++];
                }
                else {
                    merge[k] = nums1[i++];
                }
                k++;

                if(k == merge.length)
                    break;
            }

            if (k < merge.length) {
                if (i >= m) {
                    while (k < merge.length) merge[k++] = nums2[j++];
                }else if (j >= n) {
                    while (k < merge.length) merge[k++] = nums1[i++];
                }
            }

            if (totalSize % 2 == 0) {
                median = (merge[merge.length - 1] + merge[merge.length - 2]) / 2.0;
            } else {
                median = merge[merge.length - 1];
            }
        }

        return median;
    }
}
