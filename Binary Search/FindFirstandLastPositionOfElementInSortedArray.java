//LeetCode 34. Find First and Last Position of Element in Sorted Array
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int f=firstoccurence(nums,target);
        return (f==n || nums[f]!=target)? new int[]{-1,-1}:new int[]{f,lastoccurence(nums,target)-1};
    }
    static int firstoccurence(int[] nums,int target){
        int low=0,n=nums.length,high=n-1,first=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                first=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return first;
    }
    static int lastoccurence(int[] nums,int target){
        int low=0,n=nums.length,high=n-1,last=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target){
                last=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return last;
    }
}