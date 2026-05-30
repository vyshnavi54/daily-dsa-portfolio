//Ninja's Training (GFG)[2D DP]
//solved using memoization

class Solution {
    public int maximumPoints(int mat[][]) {
        // code here
        int dp[][]=new int[mat.length][4];
        return training(mat.length-1,3,mat,dp);
        
        
    }
    static int training(int i,int last,int mat[][],int dp[][]){
        if(i==0){
            int maxi=0;
            for(int j=0;j<3;j++){
                if(j!=last){
                    maxi=Math.max(maxi,mat[i][j]);
                }
            }
            return maxi;
        }
        if(dp[i][last]!=0)
        return dp[i][last];
        int maxi=0;
        for(int j=0;j<3;j++){
            if(j!=last){
                maxi=Math.max(mat[i][j]+training(i-1,j,mat,dp),maxi);
            }
        }
        return dp[i][last]=maxi;
    }
}