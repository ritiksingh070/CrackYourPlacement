// https://leetcode.com/problems/balanced-binary-tree/description/

class Solution {
    public int depth(TreeNode root){
        if(root == null) return 0;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);

        if(leftDepth == -1 || rightDepth == -1) return -1;
        if(Math.abs(leftDepth - rightDepth) > 1) return -1;

        return 1 + Math.max(leftDepth,rightDepth);
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root == null ) return true;
        else if(depth(root) != -1) return true;

        return false;
    }
}