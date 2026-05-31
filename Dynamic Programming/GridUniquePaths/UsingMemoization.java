//LeetCode 62
//Using memoization
class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
       return count(m-1,n-1,dp);
    }
    static int count(int i,int j,int[][] dp){
        if(i==0 && j==0)
        return 1;
        if(i<0 || j<0)
        return 0;
        if(dp[i][j]!=0)
        return dp[i][j];
        dp[i][j]=count(i-1,j,dp)+count(i,j-1,dp);
        return dp[i][j];

    }
}