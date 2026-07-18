//Leetcode 525. Contiguous Array
class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0)
            nums[i]=-1;
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,-1);
        int s=0,len=0;
        for(int i=0;i<n;i++){
            s=s+nums[i];
            if(hm.containsKey(s))
            len=Math.max(len,i-hm.get(s));
            else
            hm.put(s,i);
        }
        return len;
    }
}