//House Robber(Leetcode 213)

class Solution {
    public int rob(int[] nums) {
        if(nums.length==0)
        return 0;
        if(nums.length==1)
        return nums[0];
        int arr1[]=Arrays.copyOfRange(nums,1,nums.length);
        int arr2[]=Arrays.copyOfRange(nums,0,nums.length-1);
        return Math.max(maxsum(arr1),maxsum(arr2));
    }
    static int maxsum(int[] arr){
        int prev=arr[0];
        int nextprev=0;
        for(int i=1;i<arr.length;i++){
            int pick=arr[i];
            if(i>1)
            pick +=nextprev;
            int notpick=prev;
            nextprev=prev;
            prev=Math.max(pick,notpick);
        }
        return prev;
    }
}