//LeetCode 75. Sort Colors
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length,high=2,low=0,medium=1,l=0,m=0,h=n-1;
        while(m<=h){
            if(nums[m]==low){
                swap(nums,m,l);
                m++;
                l++;
            }
            else if(nums[m]==high)
            {
                swap(nums,m,h);
                h--;
            }
            else
            {
                m++;
            }
        }

    }
    static void  swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}