//UsingMemoization
class Solution {
    public int minDistance(String word1, String word2) {
        int n1=word1.length(),n2=word2.length();
        int dp[][]=new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++){
            Arrays.fill(dp[i],-1);
        }
        return count(n1-1,n2-1,word1,word2,dp);
        
    }
    static int count(int i,int j,String s1,String s2,int[][] dp){
        if(i<0)
        return j+1;
        if(j<0)
        return i+1;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
        return 0+count(i-1,j-1,s1,s2,dp);
        int insert=1+count(i,j-1,s1,s2,dp);
        int update=1+count(i-1,j-1,s1,s2,dp);
        int delete=1+count(i-1,j,s1,s2,dp);
        return dp[i][j]=Math.min(insert,Math.min(update,delete));
    }

}