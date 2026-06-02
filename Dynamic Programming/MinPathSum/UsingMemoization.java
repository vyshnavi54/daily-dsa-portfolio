//Using Memoization
class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        return minsum(grid,dp,grid.length-1,grid[0].length-1);
        
    }
    static int minsum(int[][] grid,int[][] dp,int i,int j){
        if(i==0 && j==0){
            return grid[i][j];
        }
        if(i<0 || j<0)
        return Integer.MAX_VALUE;
        if(dp[i][j]!=0)
        return dp[i][j];
        int u=minsum(grid,dp,i-1,j);
        int l=minsum(grid,dp,i,j-1);
        int s1=(u==Integer.MAX_VALUE)?Integer.MAX_VALUE:grid[i][j]+u;
        int s2=(l==Integer.MAX_VALUE)?Integer.MAX_VALUE:grid[i][j]+l;
        return dp[i][j]=Math.min(s1,s2);
    }
}