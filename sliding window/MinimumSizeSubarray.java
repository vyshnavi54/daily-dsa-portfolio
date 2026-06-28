//LeetCode 209. Minimum Size Subarray Sum
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,n=nums.length,s=0,minlen=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            s=s+nums[j];
            while(s>=target){
                minlen=Math.min(minlen,j-i+1);
                s=s-nums[i];
                i++;
            }
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}