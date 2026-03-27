//LeetCode 45. Jump Game II
class Solution {
    public int jump(int[] nums) {
        if(nums.length==1)
        return 0;
       int c=0,j=0,far=0;
       for(int i=0;i<nums.length;i++){
        far=Math.max(far,nums[i]+i);
        if(i==c){
            j++;
            c=far;
            if(far>=nums.length-1)
            return j;
        
        }
       }
        return j;
    }
}