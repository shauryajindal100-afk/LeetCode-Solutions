
class Solution {
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int mod = 1000000007;

        int dp[][] = new int[m][n];
        dp[0][0] = 1;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(dp[i][j] == 0)
                    continue;

                int ways = dp[i][j];

                if(j+1<n)
                {
                    int x = i;
                    int y = j+1;
                    boolean right = true;

                    while(x<m && y<n && grid[x][y]==1)
                    {
                        if(right)
                            x++;
                        else
                            y++;

                        right = !right;
                    }

                    if(x<m && y<n)
                        dp[x][y] = (dp[x][y]+ways)%mod;
                }

                if(i+1<m)
                {
                    int x = i+1;
                    int y = j;
                    boolean right = false;

                    while(x<m && y<n && grid[x][y]==1)
                    {
                        if(right)
                            x++;
                        else
                            y++;

                        right = !right;
                    }

                    if(x<m && y<n)
                        dp[x][y] = (dp[x][y]+ways)%mod;
                }
            }
        }

        return dp[m-1][n-1];
    }
}
