// https://leetcode.com/problems/range-sum-of-bst/description/

class Solution {
    
    public int  inOrder(TreeNode root,int low ,int high){
        if(root == null) return 0;
        int left =  inOrder(root.left,low,high);
        int currVal = 0;
        if(root.val >= low && root.val <= high) currVal = root.val;
        int right = inOrder(root.right,low,high);

        return currVal + right + left;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        return inOrder(root,low,high);
    }
}