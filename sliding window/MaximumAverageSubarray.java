//LeetCode 643. Maximum Average Subarray I
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=nums.length;
        if(k>l) return 0;
        int i=0,j=k-1,s=0;
        for(int a=0;a<k;a++){
            s=s+nums[a];
        }
        double maxval=(double)s/k;
        while(j<l-1){
            s=s-nums[i]+nums[j+1];
            i++;j++;
            double avg=(double)s/k;
            maxval=Math.max(avg,maxval);
            
        }
        return maxval;

    }
}