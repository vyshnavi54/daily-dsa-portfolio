//LeetCode 560. Subarray Sum Equals K
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        int prefix=0,count=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            if(hm.containsKey(prefix-k))
            count+=hm.get(prefix-k);
            hm.put(prefix,hm.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}