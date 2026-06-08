//Leetcode 518
//Using Recursion
class Solution {
    public int change(int amount, int[] coins) {
        return count(amount,coins,coins.length-1);
        
    }
    static int count(int amount,int[] coins,int i){
        if(i==0){
            return (amount%coins[i]==0)?1:0;
        }
        int notpick=count(amount,coins,i-1);
        int pick=0;
        if(coins[i]<=amount)
        pick=count(amount-coins[i],coins,i);
        return pick+notpick;
    }
}