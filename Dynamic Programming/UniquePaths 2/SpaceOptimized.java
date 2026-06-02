//SpaceOptimized
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[]=new int[n];
        int temp=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int u=0,l=0;
                if(i==0 && j==0 && obstacleGrid[i][j]!=1){
                    dp[j]=1;
                    temp=1;
                    continue;
                }
               
                if(obstacleGrid[i][j]!=1){
                    if(i>0)
                    u=dp[j];
                    if(j>0)
                    l=temp;
                    dp[j]=l+u;
                    temp=dp[j];
                }
                else{
                    dp[j]=0;
                    temp=0;
                }
                
                
            }
            temp=0;
        }
        return dp[n-1];
        
    }
   
}