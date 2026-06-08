//SpaceOptimization
class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[]=new int[amount+1];
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0)
            dp[i]=1;
            else
            dp[i]=0;
        }
        for(int i=1;i<n;i++){
            int dp2[]=new int[amount+1];
            for(int j=0;j<=amount;j++){
                int notpick=dp[j];
                int pick=0;
                if(coins[i]<=j)
                pick=dp2[j-coins[i]];
                dp2[j]=pick+notpick;
            }
            dp=dp2;
        }
        return dp[amount];
        
    }
}
