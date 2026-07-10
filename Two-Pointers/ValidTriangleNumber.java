//LeetCode 611. Valid Triangle Number
class Solution {
    public int triangleNumber(int[] nums) {
        int n=nums.length;
        if(n==1 || n==2)return 0;
        Arrays.sort(nums);
        int j=0,i=0,count=0;
        for(int k=n-1;k>1;k--){
            j=k-1;
            i=0;
            while(i<j){
                if(nums[i]+nums[j]>nums[k]){
                    count+=j-i;
                    j--;
                }
                else
                i++;
            }
        }
        return count;
        
    }
}