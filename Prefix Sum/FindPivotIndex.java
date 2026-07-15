//LeetCode 724. Find Pivot Index
class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        for(int i=0;i<n;i++){
            int leftsum=(i==0)?0:prefix[i-1];
            int rightsum=(i==n-1)?0:prefix[n-1]-prefix[i];
            if(rightsum==leftsum)
            return i;
        }
        return -1;
    }
}