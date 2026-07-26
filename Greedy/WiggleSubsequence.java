//Leetcode 376. Wiggle Subsequence
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int prevdiff=0,length=1;
        for(int i=1;i<nums.length;i++){
            int diff=nums[i]-nums[i-1];
            if((diff>0 && prevdiff<=0)||(diff<0 && prevdiff>=0)){
                length++;
                prevdiff=diff;
            }
        }
        return length;
    }
}