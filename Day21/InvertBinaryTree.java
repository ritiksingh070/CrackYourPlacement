// https://leetcode.com/problems/invert-binary-tree/description/

class Solution {
    public void solve(TreeNode root){
        if(root == null) return ;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        solve(root.left);
        solve(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        solve(root);
        return root;
    }
}