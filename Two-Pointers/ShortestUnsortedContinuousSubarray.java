//LeetCode 581. Shortest Unsorted Continuous Subarray
//Approach 1(space complexity o(n))
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        boolean lastm=false,firstm=false;
        int i=0,n=nums.length,j=n-1;
        if(n==1)return 0;
        int copy[]=Arrays.copyOf(nums,n);
        Arrays.sort(copy);
        while(i<j){
            if(!firstm ){
                if(nums[i]!=copy[i])
                firstm=true;
                else
                i++;
            }
            if(!lastm){
                if(nums[j]!=copy[j])
                lastm=true;
                else
                j--;
            }
            if(firstm==true && lastm==true)
            return j-i+1;
        }
        return 0;
        
    }
}