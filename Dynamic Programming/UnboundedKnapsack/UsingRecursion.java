//Code360(coding ninjas)
//Using Recursion
public class Solution {
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        // Write your code here.
        return maxvalue(weight.length-1,w,profit,weight);
    }
    static int maxvalue(int i,int w,int[] profit,int[] weight){
        if(i==0){
            return (w/weight[0])*profit[0];
        }
        int notpick=0+maxvalue(i-1,w,profit,weight);
        int pick=Integer.MIN_VALUE;
        if(weight[i]<=w){
            pick=profit[i]+maxvalue(i,w-weight[i],profit,weight);
        }
        return Math.max(pick,notpick);
    }
}
