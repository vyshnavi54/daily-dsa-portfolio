//Find how many times the array have been rotated
//Codechef problem
class Solution {
    public int countRotations(int[] nums) {
        // write your code here 
        int n=nums.length,low=0,high=n-1,ans=Integer.MAX_VALUE,index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[low]<=nums[mid]){
                if(ans>nums[low])
                {
                    ans=nums[low];
                    index=low;
                }
                low=mid+1;
            }
            else{
                if(ans>nums[mid]){
                    ans=nums[mid];
                    index=mid;
                }
                high=mid-1;
            }
        }
        return index;
    }
}
