//SpaceOptimized
class Solution {
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        int n=arr.length;
        boolean dp[]=new boolean[k+1];
        dp[0]=true;
        if(arr[0] <= k)
        dp[arr[0]]=true;
        for(int i=1;i<n;i++){
            boolean curr[]=new boolean[k+1];
            curr[0]=true;
            for(int j=1;j<=k;j++){
                boolean nottake=dp[j];
                boolean take=false;
                if(j>=arr[i])
                take=dp[j-arr[i]];
                curr[j]=take || nottake;
                
            }
            dp=curr;
        }
        return dp[k];
        
    }
    
}