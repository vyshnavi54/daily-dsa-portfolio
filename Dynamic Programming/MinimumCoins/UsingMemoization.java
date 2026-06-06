//UsingMemoization
class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans= count(coins,coins.length-1,amount,dp);
        if(ans>=1e9)return -1;
        return ans;

    }
    static int count(int[] coins,int i,int amount,int[][] dp){
        if(i==0){
            if(amount%coins[i]==0)
            return amount/coins[i];
            return (int)1e9;
        }
        if(dp[i][amount]!=-1)return dp[i][amount];
        int notpick=0+count(coins,i-1,amount,dp);
        int pick=Integer.MAX_VALUE;
        if(coins[i]<=amount){
            pick=1+count(coins,i,amount-coins[i],dp);
        }
        return dp[i][amount]=Math.min(pick,notpick);
    }
}