// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j< matrix.length;j++){
                minHeap.offer(matrix[i][j]);
            }
            
        }

        while( k > 1){
            minHeap.poll();
            k--;
        }
        return minHeap.peek();
    }
}