//Using Memoization
import java.util.*;
public class Solution {
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        // Write your code here.
        int dp[][]=new int[n][w+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return maxvalue(weight.length-1,w,profit,weight,dp);
    }
    static int maxvalue(int i,int w,int[] profit,int[] weight,int[][] dp){
        if(i==0){
            return (w/weight[0])*profit[0];
        }
        if(dp[i][w]!=-1)return dp[i][w];
        int notpick=0+maxvalue(i-1,w,profit,weight,dp);
        int pick=Integer.MIN_VALUE;
        if(weight[i]<=w){
            pick=profit[i]+maxvalue(i,w-weight[i],profit,weight,dp);
        }
        return dp[i][w]=Math.max(pick,notpick);
    }
}
