// https://leetcode.com/problems/spiral-matrix/description/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length,n = matrix[0].length;
        int left = 0,right = n-1,top = 0,bottom = m-1;
        List<Integer> ans = new ArrayList<>();
        int size = 0;
        while(top <= bottom && left <= right){
            for(int i = left;i<= right;i++){
                ans.add(matrix[top][i]);
                size++;
            }
            top++;
            if(size == m * n) break;
            for(int i = top;i<= bottom;i++){
                ans.add(matrix[i][right]);
                size++;
            }
            right--;
             if(size == m * n) break;
            for(int i = right;i>= left;i--){
                ans.add(matrix[bottom][i]);
                size++;
            }
             if(size == m * n) break;
            bottom--;
            for(int i = bottom ;i>= top;i--){
                ans.add(matrix[i][left]);
                size++;
            }
             if(size == m * n) break;
            left++;
        }
        return ans;
    }
}