//Using Memoization
class Solution {
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        int dp[][]=new int[arr.length][k+1];
        for (int i = 0; i<arr.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return isexist(arr,k,arr.length-1,dp);
        
    }
    static boolean isexist(int[] arr,int k,int i,int[][] dp){
        if(k==arr[i])
        return true;
        if(i==0){
            return arr[i]==k;
        }
        if(dp[i][k]!=-1) return dp[i][k]==1;
        boolean nottake=isexist(arr,k,i-1,dp);
        boolean take=false;
        if(k>arr[i]){
            take=isexist(arr,k-arr[i],i-1,dp);
        }
        dp[i][k]=(take||nottake)?1:0;
        return (take||nottake);
    }
}