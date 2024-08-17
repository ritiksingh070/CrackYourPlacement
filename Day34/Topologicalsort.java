// https://www.geeksforgeeks.org/problems/topological-sort/1

class Solution
{
    //Function to return list containing vertices in Topological order. 
    static void solve(int node,boolean[] vis,ArrayList<ArrayList<Integer>> adj,Stack<Integer> st){
        vis[node] = true;
        
        for(int it : adj.get(node)){
            if(vis[it] == false){
                solve(it,vis,adj,st);
            }
        }
        st.push(node);
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        Stack<Integer> st = new Stack<>();
        boolean vis[] = new boolean[V];
        
        for(int i = 0;i<V;i++){
            if(vis[i] == false){
                solve(i,vis,adj,st);
            }
        }
        
        int ans[] = new int[V];
        int i = 0;
        while(!st.isEmpty()){
            ans[i] = st.pop();
            i++;
        }
        
        return ans;
    }
}
