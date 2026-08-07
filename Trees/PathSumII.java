//Leetcode 113. Path Sum II
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>al=new ArrayList<>();
        path(root,targetSum,result,al);
        return result;
    }
    void path(TreeNode root,int target,List<List<Integer>> result,List<Integer>al){
        if(root==null)
        return;
        al.add(root.val);
        if(root.left==null && root.right==null && root.val==target){
            result.add(new ArrayList<>(al));
        }
        else{
            path(root.left,target-root.val,result,al);
            path(root.right,target-root.val,result,al);
        }
        al.remove(al.size()-1);
        
    }
}