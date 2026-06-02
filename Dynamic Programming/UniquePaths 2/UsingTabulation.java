//Using Tabulation
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int u=0,l=0;
                if(i==0 && j==0 && obstacleGrid[i][j]!=1){
                    dp[i][j]=1;
                    continue;
                }
               
                if(obstacleGrid[i][j]!=1){
                    if(i>0)
                    u=dp[i-1][j];
                    if(j>0)
                    l=dp[i][j-1];
                    dp[i][j]=l+u;
                }
                
            }
        }
        return dp[m-1][n-1];
        
    }
   
}