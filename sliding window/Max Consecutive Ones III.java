1004. Max Consecutive Ones III
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,maxl=0,n=nums.length,z=0;
        while(r<n){
            if(nums[r]==0){
                z++;
            }
            if(z>k){
                if(nums[l]==0)
                z--;
                l++;
            }
            if(z<=k){
                maxl=Math.max(maxl,r-l+1);
            }
            r++;
        
        }
        return maxl;
        
    }
}