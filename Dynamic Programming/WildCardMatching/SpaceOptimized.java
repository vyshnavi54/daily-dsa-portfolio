//SpaceOptimized
class Solution {
    public boolean isMatch(String s, String p) {
        int n1=s.length(),n2=p.length();
        boolean dp[]=new boolean[n2+1];
        dp[0]=true;
        for(int j=1;j<=n2;j++){
            if(p.charAt(j-1)=='*')
            dp[j]=dp[j-1];
            else
            dp[j]=false;
        }
        for(int i=1;i<=n1;i++){
            boolean dp2[]=new boolean[n2+1];
            dp2[0]=false;
            for(int j=1;j<=n2;j++){
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?')
                dp2[j]=dp[j-1];
                else if(p.charAt(j-1)=='*')
                dp2[j]=dp2[j-1]||dp[j];
                else
                dp2[j]=false;
            }
            dp=dp2;
        }
        return dp[n2];
    }
    
}