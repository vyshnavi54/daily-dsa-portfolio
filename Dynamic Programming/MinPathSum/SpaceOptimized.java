//SpaceOptimized
class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[]=new int[n];
        int temp=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int u=0,l=0;
                if(i==0 && j==0){
                    dp[0]=grid[0][0];
                }
                
                else{
                    if(i>0)
                    u=dp[j]+grid[i][j];
                    else
                    u=Integer.MAX_VALUE;
                    if(j>0)
                    l=temp+grid[i][j];
                    else
                    l=Integer.MAX_VALUE;
                    dp[j]=Math.min(u,l);
                }
                temp=dp[j];
                
            }
        }
        return dp[n-1];
        
    }
}