//Using Tabulation
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[][]=new int[n][n];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                if(i==n-1){
                    dp[i][j]=triangle.get(i).get(j);
                }
                else{
                    int d=triangle.get(i).get(j)+dp[i+1][j];
                    int dadj=triangle.get(i).get(j)+dp[i+1][j+1];
                    dp[i][j]=Math.min(d,dadj);

                }
                
            }
        }
        return dp[0][0];
        
    }
}