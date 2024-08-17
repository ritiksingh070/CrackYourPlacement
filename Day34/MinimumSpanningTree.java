// https://www.geeksforgeeks.org/problems/minimum-spanning-tree/1

class Pair{
    int distance;
    int node;
    Pair(int distance ,int node){
        this.distance = distance;
        this.node = node;
    }
}
class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair a, Pair b) {  
               
                return Integer.compare(a.distance, b.distance); 
            }              
        });
        
        boolean vis[] = new boolean[V];
        
        pq.add(new Pair(0,0));
        int sum = 0;
        while(!pq.isEmpty()){
            int wt = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();
            if(vis[node]) continue;
            sum+= wt;
            vis[node] = true;
            
            for(int i = 0;i< adj.get(node).size();i++){
                int temp[] = adj.get(node).get(i);
                
                pq.add(new Pair(temp[1],temp[0]));
            }
           
        }
        
        
        return sum;
    }
}