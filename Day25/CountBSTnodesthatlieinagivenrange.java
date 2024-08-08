// https://www.geeksforgeeks.org/problems/count-bst-nodes-that-lie-in-a-given-range/1


class Solution
{
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
        //Your code here
        if(root == null) return 0;
        
        int ans = 0;
        if(root.data >= l && root.data <= h) ans++;
        
        return ans + getCount(root.left,l,h) + getCount(root.right,l,h);
        
    }
}vv