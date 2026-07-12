//LeetCode 153. Find Minimum in Rotated Sorted Array
class Solution {
    public int findMin(int[] nums) {
        int n=nums.length,low=0,high=n-1,ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[low]<=nums[mid]){
                ans=Math.min(nums[low],ans);
                low=mid+1;
                
            }
            else{
                ans=Math.min(nums[mid],ans);
                high=mid-1;
                

            }
        }
        return ans;
    }
}