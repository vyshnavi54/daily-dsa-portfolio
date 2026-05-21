//LeetCode 39. Combination Sum
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        cs(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    static void cs(int i,int[] c,int t,List<List<Integer>> ans,List<Integer> al){
        if(i==c.length){
            if(t==0)
            ans.add(new ArrayList<>(al));
            return;
        }
        if(c[i]<=t){
            al.add(c[i]);
            cs(i,c,t-c[i],ans,al);
            al.remove(al.size()-1);
        }
        cs(i+1,c,t,ans,al);
    }
    
}