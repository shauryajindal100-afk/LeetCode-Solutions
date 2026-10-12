class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int find = 0;
        int len2 = nums1.length + nums2.length;
        int len1;
        double num1 = 0, num2 = 0;
        int test = 1, n1 = 0, n2 = 0;

        if (len2 % 2 == 0) {
            len2 = len2 / 2 + 1;
            len1 = len2 - 1;
        } else {
            len2 = len2 / 2 + 1;
            len1 = len2;
        }

        for (int i = 0; i < len2; i++) {
            int select;

            if (n1 < nums1.length && n2 < nums2.length) {
                select = Math.min(nums1[n1], nums2[n2]);

                if (nums1[n1] <= nums2[n2])
                    n1++;
                else
                    n2++;
            } else if (n1 < nums1.length) {
                select = nums1[n1++];
            } else {
                select = nums2[n2++];
            }

            if (test == len1)
                num1 = select;

            if (test == len2)
                num2 = select;

            test++;
        }

        return (num1 + num2) / 2.0;
    }
}