class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] pref = new int[n];

        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1];

            if (nums[i] % 2 == nums[i - 1] % 2) {
                pref[i]++;
            }
        }

        boolean[] ans = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            ans[i] = pref[r] - pref[l] == 0;
        }

        return ans;
    }
}