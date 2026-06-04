//GFG Perfect Sum Problem
//Using Recursion
class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        return count(nums.length-1,target,nums);
    }
    static int count(int i,int target,int[] a){
        if(i==0){
            if(target==0 && a[i]==0)return 2;
            if(target==0 || target==a[i]) return 1;
            return 0;
        }
        int notpick=count(i-1,target,a);
        int pick=0;
        if(target>=a[i])
        pick=count(i-1,target-a[i],a);
        return pick+notpick;
    }
}