// https://leetcode.com/problems/diameter-of-binary-tree/description/

class Solution {
    
    public int  depth(TreeNode root,int[] diameter){
        if(root == null) return 0;
        
        int leftDepth = depth(root.left,diameter);
        int rightDepth = depth(root.right,diameter);

        diameter[0] = Math.max(diameter[0],leftDepth + rightDepth);
       
        return 1 + Math.max(leftDepth,rightDepth);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter[] = new int[1];

        depth(root,diameter);

        return diameter[0];
    }
}