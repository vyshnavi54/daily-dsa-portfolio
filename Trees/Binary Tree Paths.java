LeetCode 257. Binary Tree Paths
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
        List<String> al = new ArrayList<>();
        String p = "";
        path(root, p, al);
        return al;
    }

    void path(TreeNode root, String p, List<String> al) {
        if (root == null)
            return;
        if (p.isEmpty())
            p = Integer.toString(root.val);
        else {
            p = p + "->" + root.val;
        }
        if (root.left == null && root.right == null) {
            al.add(p);
            return;
        }
        path(root.left, p, al);
        path(root.right, p, al);
    }
}