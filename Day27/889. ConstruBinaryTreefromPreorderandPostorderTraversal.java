// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/

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
    public TreeNode solve(int[] preorder,int preStart,int preEnd,int[] postorder,int postStart,int postEnd){
        if(preStart > preEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);

        if(preStart ==  preEnd) return root;
        int postIndex = postStart;

        while(postorder[postIndex] != preorder[preStart + 1]) postIndex++;
        int len = postIndex - postStart + 1;

        root.left = solve(preorder,preStart + 1,preStart + len,postorder,postStart,postIndex );
        root.right = solve(preorder,preStart + len + 1,preEnd,postorder,postIndex + 1,postEnd);

        return root;

    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = preorder.length;
        return solve(preorder,0,n-1,postorder,0,n-1);
        
    }
}