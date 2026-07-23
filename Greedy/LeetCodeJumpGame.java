//Leetcode 55. Jump Game
class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1)return true;
        if(nums[0]==0)return false;
        int reach=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(i>reach)
            return false;
            reach=Math.max(reach,nums[i]+i);
            if(reach>=n-1)
            return true;
        }
        return false;
    }
}