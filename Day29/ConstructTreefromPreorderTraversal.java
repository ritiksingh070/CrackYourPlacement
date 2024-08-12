// https://www.geeksforgeeks.org/problems/construct-tree-from-preorder-traversal/1

class Solution{
    static int idx = -1;
    public static Node buildTree(int[] pre , char[] preLN){
        if(idx >= pre.length)   return null;
        idx++;
        Node curr = new Node(pre[idx]);
        
        if(preLN[idx] == 'L'){
            return curr;
        }
        curr.left = buildTree(pre , preLN);
        curr.right = buildTree(pre , preLN);
        
        return curr;
    }
    Node constructTree(int n, int pre[], char preLN[]){
        // code here
        idx = -1;
        return buildTree(pre , preLN);
    }
}