//UsingTabulation
class Solution {
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        int dp[][]=new int[n][n+1];
        for(int i=0;i<=n;i++){
            dp[0][i]=i*price[0];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=n;j++){
                int notpick=0+dp[i-1][j];
                int pick=0;
                int rodlength=i+1;
                if(rodlength<=j)
                pick=price[i]+dp[i][j-rodlength];
                dp[i][j]=Math.max(pick,notpick);
            }
            
        }
        return dp[n-1][n];
        
    }
    
}