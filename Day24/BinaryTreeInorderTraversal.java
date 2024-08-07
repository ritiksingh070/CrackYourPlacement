// https://leetcode.com/problems/binary-tree-inorder-traversal/description/

class Solution {
    public void solve(TreeNode root,List<Integer> ans){
        if(root == null) return;

        solve(root.left,ans);
        ans.add(root.val);
        solve(root.right,ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        solve(root,ans);
        return ans;
    }
}