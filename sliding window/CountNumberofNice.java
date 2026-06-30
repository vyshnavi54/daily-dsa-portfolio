//LeetCode 1248. Count Number of Nice Subarrays
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return count(nums,k)-count(nums,k-1);
        
    }
    static int count(int nums[],int k){
        int n=nums.length,j=0,i=0,c=0,k1=0;
        while(j<n){
            if(nums[j]%2!=0)
            k1++;
            while(k1>k){
                if(nums[i]%2!=0)
                k1--;
                i++;
            }
            c=c+(j-i+1);
            j++;
        }
        return c;
    }
}