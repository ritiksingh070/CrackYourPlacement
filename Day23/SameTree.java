// https://leetcode.com/problems/same-tree/description/

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(q == null || p == null) return false;
        if(p.val != q.val) return false;
        else if(p.val == q.val && q.left == null && p.left == null && q.right == null && p.right == null){
            return true;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}