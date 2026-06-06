//UsingTabulation
class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int inf=(int)1e9;
        int dp[][]=new int[n][amount+1];
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0)
            dp[0][i]=i/coins[0];
            else
            dp[0][i]=inf;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=amount;j++){
                int notpick=0+dp[i-1][j];
                int pick=inf;
                if(coins[i]<=j){
                    pick=1+dp[i][j-coins[i]];
                }
                dp[i][j]=Math.min(pick,notpick);
            }
        }
        if (dp[n-1][amount]>=1e9)return -1;
        return dp[n-1][amount];
    }
}