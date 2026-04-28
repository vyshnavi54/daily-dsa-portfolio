#Subsets(LeetCode 78)
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l=new ArrayList<>();
        subsetsum(0,new ArrayList<>(),nums,l);
        return l;

    }
    static void subsetsum(int index, List<Integer> ds,int[] nums,List<List<Integer>> l){
        l.add(new ArrayList<>(ds));
        for(int i=index;i<nums.length;i++){
            if(i!=index && nums[i]==nums[i-1])
            continue;
            ds.add(nums[i]);
            subsetsum(i+1,ds,nums,l);
            ds.remove(ds.size()-1);
        }
    }
}