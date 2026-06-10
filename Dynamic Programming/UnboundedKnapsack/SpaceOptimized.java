//SpaceOptimized
import java.util.*;
public class Solution {
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        // Write your code here.
        int dp[]=new int[w+1];
        for(int i=0;i<=w;i++){
            dp[i]=(i/weight[0])*profit[0];
        }
        for(int i=1;i<n;i++){
            int dp2[]=new int[w+1];
            for(int j=0;j<=w;j++){
                int notpick=0+dp[j];
                int pick=0;
                if(weight[i]<=j)
                pick=profit[i]+dp2[j-weight[i]];
                dp2[j]=Math.max(pick,notpick);
            }
            dp=dp2;
        }
        return dp[w];
    }
}
