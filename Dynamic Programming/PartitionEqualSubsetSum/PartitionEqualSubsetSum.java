//LeetCode 416
class Solution {
    public int minDifference(int nums[]) {
        // code here
        int s=0,n=nums.length;
        for(int i=0;i<n;i++)
        s=s+nums[i];
        boolean dp[]=new boolean[s+1];
        dp[0]=true;
        if(nums[0]<=s)
        dp[nums[0]]=true;
        for(int i=1;i<n;i++){
            boolean dp2[]=new boolean[s+1];
            dp2[0]=true;
            for(int j=1;j<=s;j++){
                boolean notpick=dp[j];
                boolean pick=false;
                if(j>=nums[i])
                pick=dp[j-nums[i]];
                dp2[j]=pick || notpick;
            }
            dp=dp2;
        }
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<=s;i++){
            if(dp[i]==true){
                int s1=i;
                int s2=s-s1;
                minsum=Math.min(minsum,Math.abs(s1-s2));
            }
        }
        return minsum;
    }
}
