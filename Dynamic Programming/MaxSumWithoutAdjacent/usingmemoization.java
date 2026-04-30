#Max Sum without Adjacents(GFG)
(Using Memoization)

class Solution {
    int findMaxSum(int arr[]) {
        // code here
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        return maxsum(arr,dp,arr.length-1);
    }
    static int maxsum(int arr[],int dp[],int index){
        if(index==0)
        return arr[0];
        if(index<0)
        return 0;
        if(dp[index]!=-1)
        return dp[index];
        int pick=arr[index]+maxsum(arr,dp,index-2);
        int notpick=0+maxsum(arr,dp,index-1);
        return dp[index]=Math.max(pick,notpick);
    }
}