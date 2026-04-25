#Using memorization
class Solution {
    int minCost(int[] height) {
        // code here
        int dp[]=new int[height.length];
        Arrays.fill(dp,-1);
        return frog(height,height.length-1, dp);
    }
    static int frog(int[] height,int f,int[] dp){
        if(f==0)
        return 0;
        if(dp[f]!=-1)
        return dp[f];
        int left=frog(height,f-1,dp)+Math.abs(height[f]-height[f-1]);
        int right = Integer.MAX_VALUE;
        if(f>1)
        right=frog(height,f-2,dp)+Math.abs(height[f]-height[f-2]);
        dp[f]=Math.min(left,right);
        return dp[f];
    }
}