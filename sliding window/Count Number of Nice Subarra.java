#1248. Count Number of Nice Subarrays
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length,c=0,s=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else
            nums[i]=1;
            s=s+nums[i];
            if(hm.containsKey(s-k)){
                c=c+hm.get(s-k);
            }
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        return c;
    }
}