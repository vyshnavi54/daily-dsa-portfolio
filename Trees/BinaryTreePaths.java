//Leetcode 257. Binary Tree Paths
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>res=new ArrayList<>();
        List<Integer>al=new ArrayList<>();
        path(root,res,al);
        return res;
    }
    void path(TreeNode root,List<String> res,List<Integer> al){
        if(root==null)
        return;
        al.add(root.val);
        if(root.left==null && root.right==null){
            StringBuilder sb=new StringBuilder();
            for(int ans:al){
                sb.append(ans).append("->");
            }
            res.add(sb.substring(0,sb.length()-2));
        }
        else{
            path(root.left,res,al);
            path(root.right,res,al);
        }
        al.remove(al.size()-1);
    }
}