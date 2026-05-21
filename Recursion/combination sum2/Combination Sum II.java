//LeetCode 40. Combination Sum II
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        cs2(candidates,target,0,ans,new ArrayList<>());
        return ans;
        
    }
    static void cs2(int[] c,int t,int i,List<List<Integer>> ans,List<Integer> al){
        
        if(t==0)
        {
            ans.add(new ArrayList<>(al));
            return;
        }           
        
        for(int j=i;j<c.length;j++){
            if(j>i && c[j]==c[j-1])
            continue;
            if(c[j]>t) break;
            al.add(c[j]);
            cs2(c,t-c[j],j+1,ans,al);
            al.remove(al.size()-1);
        }
        
    }
}