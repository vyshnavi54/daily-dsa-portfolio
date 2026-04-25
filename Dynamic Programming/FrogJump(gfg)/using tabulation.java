#using tabulation
class Solution {
    int minCost(int[] height) {
        // code here
        int dp[]=new int[height.length];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int i=1;i<height.length;i++){
            int left=dp[i-1]+Math.abs(height[i]-height[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1)
            right=dp[i-2]+Math.abs(height[i]-height[i-2]);
            dp[i]=Math.min(left,right);
        }
        return dp[height.length-1];
    }
    
    
}