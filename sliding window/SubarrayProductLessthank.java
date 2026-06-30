//LeetCode 713. Subarray Product Less Than K
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0 || k==1)return 0;
        int len=nums.length,i=0,j=0,s=1,c=0;
        while(j<len){
            s=s*nums[j];
            while(s>=k){
                s=s/nums[i];
                i++;
            }
            c=c+(j-i+1);
            j++;
        }
        return c;
    }
}