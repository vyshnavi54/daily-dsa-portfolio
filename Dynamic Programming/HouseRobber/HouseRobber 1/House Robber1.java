//House Robber(Leetcode 198)

class Solution {
    public int rob(int[] nums) {
        int prev=nums[0];
        int nextprev=0;
        for(int i=1;i<nums.length;i++){
            int pick=nums[i];
            if(i>1)
            pick +=nextprev;
            int notpick=prev;
            nextprev=prev;
            prev=Math.max(pick,notpick);
        }
        return prev;
    }

}
