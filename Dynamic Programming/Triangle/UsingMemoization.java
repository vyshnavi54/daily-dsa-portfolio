//Using Memoization
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[][]=new int[triangle.size()][triangle.size()];
        return minval(0,0,triangle,dp);
        
    }
    static int minval(int i,int j,List<List<Integer>> t,int[][] dp){
        if(i==t.size()-1)
        return t.get(i).get(j);
        if(i>=t.size())
        return 0;
        if(dp[i][j]!=0) return dp[i][j];
        int down=t.get(i).get(j)+minval(i+1,j,t,dp);
        int downadj=t.get(i).get(j)+minval(i+1,j+1,t,dp);
        return dp[i][j]=Math.min(down,downadj);
    }
}