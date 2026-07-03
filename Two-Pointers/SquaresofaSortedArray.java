//LeetCode 977. Squares of a Sorted Array
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0,n=nums.length,j=n-1,p=n-1;
        int arr[]=new int[n];
        while(i<=j){
            if(nums[i]*nums[i] >= nums[j]*nums[j])
            {   
                arr[p]=nums[i]*nums[i];
                i++;
            }
            else{
                arr[p]=nums[j]*nums[j];
                j--;
            }
            p--;
        }
        return arr;

    }
}