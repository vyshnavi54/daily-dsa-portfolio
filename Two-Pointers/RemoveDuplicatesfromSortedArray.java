//LeetCode 26. Remove Duplicates from Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0,n=nums.length,k=1;
        while(j<n){
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
                k++;
            }
            j++;
        }
        return k;
    }
}