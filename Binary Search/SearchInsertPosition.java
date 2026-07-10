//LeetCode 35. Search Insert Position
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length,low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target<nums[mid]){
                high=mid-1;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else
            return mid;
        }
        return low;
    }
}