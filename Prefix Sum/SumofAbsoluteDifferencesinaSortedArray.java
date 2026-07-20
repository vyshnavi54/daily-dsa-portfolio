//Leetcode 1685. Sum of Absolute Differences in a Sorted Array
class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int prefix[]=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        for(int i=0;i<n;i++){
            if(i==0){
                ans[0]=(prefix[n-1]-prefix[i])-(n-1-i)*nums[i];
                continue;
            }
            int left=i*nums[i]-prefix[i-1];
            int right=(prefix[n-1]-prefix[i])-(n-1-i)*nums[i];
            ans[i]=left+right;
        }
        return ans;

    }
}