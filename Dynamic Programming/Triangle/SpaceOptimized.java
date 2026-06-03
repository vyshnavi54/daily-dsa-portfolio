//SpaceOptimized
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[]=new int[n];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                if(i==n-1){
                    dp[j]=triangle.get(i).get(j);
                }
                else{
                    int d=triangle.get(i).get(j)+dp[j];
                    int dadj=triangle.get(i).get(j)+dp[j+1];
                    dp[j]=Math.min(d,dadj);

                }
                
            }
        }
        return dp[0];
        
    }
}