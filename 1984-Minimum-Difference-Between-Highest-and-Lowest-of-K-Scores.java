class Solution {
    public int minimumDifference(int[] nums, int k) {
        int sum = Integer.MAX_VALUE;
        int temp = 0;

        Arrays.sort(nums);

        for (int i = 0; i <= nums.length - k; i++) {
            temp = nums[i + k - 1] - nums[i];
            sum = Math.min(temp, sum);
        }

        return sum;
    }
}