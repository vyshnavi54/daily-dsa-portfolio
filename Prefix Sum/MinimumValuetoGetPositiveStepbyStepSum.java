//LeetCode 1413. Minimum Value to Get Positive Step by Step Sum
class Solution {
    public int minStartValue(int[] nums) {
        int n=nums.length,startvalue=0,prefix=nums[0];
        startvalue=Math.max(1,1-prefix);
        for(int i=1;i<n;i++){
            prefix+=nums[i];
            startvalue=Math.max(startvalue,1-prefix);
        }
        return startvalue;
    }
}