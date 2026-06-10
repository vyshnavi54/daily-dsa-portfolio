//SpaceOptimized
class Solution {
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        int dp[]=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=i*price[0];
        }
        for(int i=1;i<n;i++){
            int dp2[]=new int[n+1];
            for(int j=0;j<=n;j++){
                int notpick=0+dp[j];
                int pick=0;
                int rodlength=i+1;
                if(rodlength<=j)
                pick=price[i]+dp2[j-rodlength];
                dp2[j]=Math.max(pick,notpick);
            }
            dp=dp2;
            
        }
        return dp[n];
        
    }
    
}