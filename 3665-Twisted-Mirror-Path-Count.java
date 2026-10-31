
class Solution {
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int mod = 1000000007;

        int dp[] = new int[n];
        dp[0] = 1;

        for(int i=0;i<m;i++)
        {
            int right = 0;

            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 1)
                {
                    int temp = right;
                    right = dp[j];
                    dp[j] = temp;
                }
                else
                {
                    right = (right + dp[j]) % mod;
                    dp[j] = right;
                }
            }
        }

        return dp[n-1];
    }
}
