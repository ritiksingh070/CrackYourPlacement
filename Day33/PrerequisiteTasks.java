// https://www.geeksforgeeks.org/problems/prerequisite-tasks/1?

class Solution {
    public boolean isPossible(int N,int P, int[][] arr)
    {
        // Your Code goes here
        int inDegree[]=new int[N];
    int k=0;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<P;i++){
            int u = arr[i][0];
            int v = arr[i][1];
            adj.get(v).add(u);
            inDegree[u]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        
       
        int count = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            count++;
            for (int neighbor : adj.get(current)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }
        
       
        return count == N;
       
    }
    
}