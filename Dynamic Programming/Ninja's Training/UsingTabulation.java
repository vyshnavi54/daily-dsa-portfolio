//using tabulation
class Solution {
    public int maximumPoints(int mat[][]) {
        // code here
        int n=mat.length;
        int dp[][]=new int[n][4];
        dp[0][0]=Math.max(mat[0][1],mat[0][2]);
        dp[0][1]=Math.max(mat[0][0],mat[0][2]);
        dp[0][2]=Math.max(mat[0][0],mat[0][1]);
        dp[0][3]=Math.max(mat[0][0],Math.max(mat[0][1],mat[0][2]));
        for(int i=1;i<mat.length;i++){
            for(int last=0;last<4;last++){
                for(int task=0;task<3;task++){
                    if(task!=last){
                        dp[i][last]=Math.max(mat[i][task]+dp[i-1][task],dp[i][last]);
                    }
                }
            }
        }
        return dp[n-1][3];
        
        
    }
 
}