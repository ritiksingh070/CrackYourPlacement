// https://www.geeksforgeeks.org/problems/median-of-bst/1
class Tree


{
    public static void solve(Node root,ArrayList<Integer> arr){
        if(root == null ) return ;
        
        solve(root.left,arr);
        arr.add(root.data);
        solve(root.right,arr);
    }
    public static float findMedian(Node root)
    {
        // code here.
        ArrayList<Integer> arr = new ArrayList<>();
        solve(root,arr);
        int n = arr.size();
       
        if(n%2 == 0){
            int temp = arr.get(n/2) + arr.get(n/2 -1);
            
            
            return (float)temp/2;
        }
        
        
        return (float)(arr.get(n/2));
        
        
    }
}