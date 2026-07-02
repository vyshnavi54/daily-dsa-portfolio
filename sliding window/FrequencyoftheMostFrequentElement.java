//LeetCode 1838. Frequency of the Most Frequent Element
class Solution {
    public int maxFrequency(int[] nums, int k) {
        int i=0,j=0,n=nums.length,maxlen=0;
        long ts=0,s=0;
        Arrays.sort(nums);
        while(j<n){
            s=(long)s+nums[j];
            ts=(long)(j-i+1)*nums[j]-s;
            while(ts>k){
                s=(long)s-nums[i];
                i++;
                ts=(long)(j-i+1)*nums[j]-s;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}