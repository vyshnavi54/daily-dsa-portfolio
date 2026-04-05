#930. Binary Subarrays With Sum
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int c=0,n=nums.length,s=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++){
            s=s+nums[i];
            if(hm.containsKey(s-goal)){
                c=c+hm.get(s-goal);
            }
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        return c;
    }
}