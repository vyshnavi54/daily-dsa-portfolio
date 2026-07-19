//LeetCode 1248.Count Number of Nice Subarrays
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length,c=0;
        int prefix[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0)
            nums[i]=1;
            else
            nums[i]=0;
        }
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++){
            if(hm.containsKey(prefix[i]-k))
            c=c+hm.get(prefix[i]-k);
            hm.put(prefix[i],hm.getOrDefault(prefix[i],0)+1);
        }
        return c;
    }
}