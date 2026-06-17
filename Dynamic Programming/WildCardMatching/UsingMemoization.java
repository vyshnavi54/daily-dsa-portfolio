//Using Memoization
class Solution {
    public boolean isMatch(String s, String p) {
        int n1=s.length(),n2=p.length();
        int dp[][]=new int[n1][n2];
        for(int i=0;i<n1;i++){
            Arrays.fill(dp[i],-1);
        }
        return wildcard(n1-1,n2-1,s,p,dp);
    }
    static boolean wildcard(int i,int j,String s,String p,int[][] dp){
        if(i<0 && j<0) return true;
        if(j<0 && i>=0) return false;
        if(j>=0 && i<0){
            for(int k=j;k>=0;k--){
                if(p.charAt(k)!='*')
                return false;
            }
            return true;
        }
        if(dp[i][j]!=-1) return (dp[i][j]==1)?true:false;
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
            dp[i][j]=(wildcard(i-1,j-1,s,p,dp))?1:0;
            return dp[i][j]==1;
        }
        else if(p.charAt(j)=='*'){
            dp[i][j]=(wildcard(i,j-1,s,p,dp)||wildcard(i-1,j,s,p,dp))?1:0;
            return dp[i][j]==1;
        }
        else
        return false;
    }
}