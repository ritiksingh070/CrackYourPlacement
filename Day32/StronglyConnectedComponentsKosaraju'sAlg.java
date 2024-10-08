// https://www.geeksforgeeks.org/problems/strongly-connected-components-kosarajus-algo/1



//User function Template for Java


class Solution{
    
    void DFS(int s,ArrayList<ArrayList<Integer>> adj,
                           Stack<Integer> st,boolean[] visited){
                               
        visited[s]=true;
        for(int u:adj.get(s)){
            if(visited[u]==false){
                DFS(u,adj,st,visited);
            }
        }
        st.push(s);
    }
    
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj){
        
        Stack<Integer> st=new Stack<Integer>();
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                DFS(i,adj,st,visited);
            }
        }
        
        ArrayList<ArrayList<Integer>> rev=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++){
            rev.add(new ArrayList<Integer>());
        }
        for(int i=0;i<V;i++){
            for(int u:adj.get(i)){
                rev.get(u).add(i);
            }
        }
        
        int count=0;
        Arrays.fill(visited,false);
        while(!st.isEmpty()){
            int u=st.pop();
            Queue<Integer> q=new ArrayDeque<>();
            if(visited[u]==false){
                count++;
                q.add(u);
                visited[u]=true;
            }
            while(!q.isEmpty()){
                int v=q.poll();
                for(int a:rev.get(v)){
                    if(visited[a]==false){
                        visited[a]=true;
                        q.add(a);
                    }
                }
            }
        }
        
        return count;
        
    }
}