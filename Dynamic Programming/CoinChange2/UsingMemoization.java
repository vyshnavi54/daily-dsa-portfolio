//Using Memoization
class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return count(amount,coins,coins.length-1,dp);
        
    }
    static int count(int amount,int[] coins,int i,int[][] dp){
        if(i==0){
            return (amount%coins[i]==0)?1:0;
        }
        if(dp[i][amount]!=-1)
        return dp[i][amount];
        int notpick=count(amount,coins,i-1,dp);
        int pick=0;
        if(coins[i]<=amount)
        pick=count(amount-coins[i],coins,i,dp);
        return dp[i][amount]=pick+notpick;
    }
}