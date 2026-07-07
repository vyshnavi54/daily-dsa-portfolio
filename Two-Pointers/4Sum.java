//LeetCode 18. 4Sum
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> al=new ArrayList<>();
        int l=0,r=0,n=nums.length;long t=(long)target;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(i>0 && nums[i]==nums[i-1])continue; 
            for(int j=i+1;j<=n-1;j++){
                if(j>1 && nums[j]==nums[j-1]) continue;
                t=(long)target;
                l=j+1;
                r=n-1;
                t=(long)t-nums[i]-nums[j];
                while(l<r){
                    if(nums[l]+nums[r]==t){
                        al.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        while(l<r && nums[l]==nums[l+1])l++;
                        while(l<r && nums[r]==nums[r-1])r--;
                        l++;r--;
                    }
                    else if(nums[l]+nums[r]<t){
                        l++;
                    }
                    else
                    r--;
                }

            }
        
        }
        return al;
        
    }
}