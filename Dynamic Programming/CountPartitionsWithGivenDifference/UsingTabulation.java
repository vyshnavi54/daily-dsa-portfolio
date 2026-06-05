//Using Tabulation
class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int sum=0,n=arr.length;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        if(sum-diff<0 || (sum-diff)%2!=0) return 0;
        int target=(sum-diff)/2;
        int dp[][]=new int[n][target+1];
        if(arr[0]==0)
        dp[0][0]=2;
        else
        dp[0][0]=1;
        if(arr[0]!=0 && arr[0]<=target)
        dp[0][arr[0]]=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<=target;j++){
                int notpick=dp[i-1][j];
                int pick=0;
                if(j>=arr[i]){
                    pick=dp[i-1][j-arr[i]];
                }
                dp[i][j]=pick+notpick;
            }
        }
        return dp[n-1][target];
        
    }
}
