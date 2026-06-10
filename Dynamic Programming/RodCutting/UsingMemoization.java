//Using Memoization
class Solution {
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        int dp[][]=new int[n][n+1];
        return maxvalue(price.length-1,price.length,price,dp);
        
    }
    static int maxvalue(int i,int n,int[] price,int[][] dp){
        if(i==0)
        return price[0]*n;
        if(dp[i][n]!=0)
        return dp[i][n];
        int notpick=0+maxvalue(i-1,n,price,dp);
        int pick=0;
        int rodlength=i+1;
        if(rodlength<=n)
        pick=price[i]+maxvalue(i,n-rodlength,price,dp);
        return dp[i][n]=Math.max(pick,notpick);
    }
}