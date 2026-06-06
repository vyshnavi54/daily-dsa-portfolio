//SpaceOptimized
class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int inf=(int)1e9;
        int dp[]=new int[amount+1];
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0)
            dp[i]=i/coins[0];
            else
            dp[i]=inf;
        }
        for(int i=1;i<n;i++){
            int dp2[]=new int[amount+1];
            for(int j=0;j<=amount;j++){
                int notpick=0+dp[j];
                int pick=inf;
                if(coins[i]<=j){
                    pick=1+dp2[j-coins[i]];
                }
                dp2[j]=Math.min(pick,notpick);
            }
            dp=dp2;
        }
        if (dp[amount]>=1e9)return -1;
        return dp[amount];
    }
}