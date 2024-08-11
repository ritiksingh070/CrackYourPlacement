// https://leetcode.com/problems/maximum-width-of-binary-tree/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    class TreeNodePair {
        TreeNode node;
        int value;

        TreeNodePair(TreeNode node, int value) {
            this.node = node;
            this.value = value;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
       
       Deque<TreeNodePair > dq = new ArrayDeque<>();
       int ans = 0;

       if(root == null){
        return ans;
       }

       dq.add(new TreeNodePair(root,1));

       while(!dq.isEmpty()){
        // TreeNodePair  front = dq.peekFirst();
        // TreeNodePair  last = dq.peekLast();
        int max = (dq.getLast().value - dq.getFirst().value +1 );
        ans = Math.max(ans , max);
        int size = dq.size();

        for(int i =0 ; i< size ; i++){

        TreeNodePair  tp = dq.pop();
        TreeNode temp  = tp.node;
        int val = tp.value;

        if(temp.left!=null){
            dq.add(new TreeNodePair(temp.left , val*2));
        }

         if(temp.right!=null){
            dq.add(new TreeNodePair(temp.right , val*2+1));
        }
        }
        
       }

       return ans;
    }
}