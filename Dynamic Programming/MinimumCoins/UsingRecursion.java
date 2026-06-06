//LeetCode 322
//Using Recursion
class Solution {
    public int coinChange(int[] coins, int amount) {
        int ans= count(coins,coins.length-1,amount);
        if(ans>=1e9)return -1;
        return ans;

    }
    static int count(int[] coins,int i,int amount){
        if(i==0){
            if(amount%coins[i]==0)
            return amount/coins[i];
            return (int)1e9;
        }
        int notpick=0+count(coins,i-1,amount);
        int pick=Integer.MAX_VALUE;
        if(coins[i]<=amount){
            pick=1+count(coins,i,amount-coins[i]);
        }
        return Math.min(pick,notpick);
    }
}