//Using Memoization
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        return count(m-1,n-1,obstacleGrid,dp);
        
    }
    static int count(int i,int j,int[][] a,int[][] dp){
        if(i==0 && j==0 && a[i][j]!=1)
        return 1;
        if(i<0 || j<0 || a[i][j]==1)
        return 0;
        if(dp[i][j]!=0)
        return dp[i][j];
        int u=count(i-1,j,a,dp);
        int l=count(i,j-1,a,dp);
        return dp[i][j]=l+u;
    }
}