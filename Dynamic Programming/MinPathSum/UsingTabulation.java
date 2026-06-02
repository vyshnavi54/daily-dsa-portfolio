//UsingTabulation
class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int u=0,l=0;
                if(i==0 && j==0)
                dp[0][0]=grid[0][0];
                else{
                    if(i>0)
                    u=dp[i-1][j]+grid[i][j];
                    else
                    u=Integer.MAX_VALUE;
                    if(j>0)
                    l=dp[i][j-1]+grid[i][j];
                    else
                    l=Integer.MAX_VALUE;
                    dp[i][j]=Math.min(u,l);
                }
                
            }
        }
        return dp[m-1][n-1];
        
    }
}