//SpaceOptimized
class Solution {
    public int minDistance(String word1, String word2) {
        int n1=word1.length(),n2=word2.length();
        int dp[]=new int[n2+1];
        for(int j=1;j<=n2;j++){
            dp[j]=j;
        }
        for(int i=1;i<=n1;i++){
            int dp2[]=new int[n2+1];
            dp2[0]=i;
            for(int j=1;j<=n2;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1))
                dp2[j]=0+dp[j-1];
                else{
                    dp2[j]=Math.min(1+dp2[j-1],Math.min(1+dp[j-1],1+dp[j]));
                }
            }
            dp=dp2;
        }
        return dp[n2];
        
    }

}