//Max Sum without Adjacents(GFG)
//(Using Tabulation)


class Solution {
    int findMaxSum(int arr[]) {
        // code here
        int dp[]=new int[arr.length];
        dp[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            int pick=arr[i];
            if(i>1)
            pick +=dp[i-2];
            int notpick=0+dp[i-1];
            dp[i]=Math.max(pick,notpick);
        }
        return dp[dp.length-1];
    }
   
}