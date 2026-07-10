//LeetCode 581. Shortest Unsorted Continuous Subarray
//O(N) time complexity
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int n=nums.length,start=-1,end=-1,maxv=nums[0],minv=nums[n-1];
        for(int i=1;i<n;i++){
            if(nums[i]<maxv)
            end=i;
            else
            maxv=nums[i];
        }
        for(int i=n-2;i>=0;i--){
            if(nums[i]>minv)
            start=i;
            else
            minv=nums[i];
        }
        return start==-1? 0:end-start+1;
       
        
    }
}