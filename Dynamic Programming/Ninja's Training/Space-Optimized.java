//Space-Optimized
class Solution {
    public int maximumPoints(int mat[][]) {
        // code here
        int n=mat.length;
        int dp[]=new int[4];
        dp[0]=Math.max(mat[0][1],mat[0][2]);
        dp[1]=Math.max(mat[0][0],mat[0][2]);
        dp[2]=Math.max(mat[0][0],mat[0][1]);
        dp[3]=Math.max(mat[0][0],Math.max(mat[0][1],mat[0][2]));
        for(int i=1;i<mat.length;i++){
            int cdp[]=new int[4];
            for(int last=0;last<4;last++){
                cdp[last]=0;
                for(int task=0;task<3;task++){
                    if(task!=last){
                        cdp[last]=Math.max(mat[i][task]+dp[task],cdp[last]);
                    }
                }
            }
            dp=cdp;
        }
        return dp[3];
        
        
    }
 
}