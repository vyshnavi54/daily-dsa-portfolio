//Using Tabulation
import java.util.*;
public class Solution {
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        // Write your code here.
        int dp[][]=new int[n][w+1];
        for(int i=0;i<=w;i++){
            dp[0][i]=(i/weight[0])*profit[0];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=w;j++){
                int notpick=0+dp[i-1][j];
                int pick=0;
                if(weight[i]<=j)
                pick=profit[i]+dp[i][j-weight[i]];
                dp[i][j]=Math.max(pick,notpick);
            }
        }
        return dp[n-1][w];
    }
}
