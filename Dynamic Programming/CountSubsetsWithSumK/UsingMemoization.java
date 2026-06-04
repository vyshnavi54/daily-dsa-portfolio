//Using Memoization
class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int dp[][]=new int[nums.length][target+1];
        for (int i = 0; i <nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return count(nums.length-1,target,nums,dp);
    }
    static int count(int i,int target,int[] a,int dp[][]){
        if(i==0){
            if(target==0 && a[i]==0)return 2;
            if(target==0 || target==a[i]) return 1;
            return 0;
        }
        if(dp[i][target]!=-1)
        return dp[i][target];
        int notpick=count(i-1,target,a,dp);
        int pick=0;
        if(target>=a[i])
        pick=count(i-1,target-a[i],a,dp);
        return dp[i][target]=pick+notpick;
    }
}