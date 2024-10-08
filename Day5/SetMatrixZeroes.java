// https://leetcode.com/problems/set-matrix-zeroes/description/

class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length,m = matrix[0].length;
        int col0 = 1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j] == 0){
                    if(i == 0){
                        matrix[0][0] = 0;
                    }
                    if(j == 0){
                        col0 = 0;
                    }
                    else{
                        matrix[i][0] = 0;
                        matrix[0][j]  = 0;
                    }
                }
            }
        }

        for(int i = 1;i<n;i++){
            for(int j = 1;j<m;j++){
                if(matrix[i][j] == 0) continue;
                else if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0] == 0) {
            for(int i = 0;i < m;i++){
                matrix[0][i] = 0;
            }
        }
        if(col0 == 0){
            for(int i = 0;i < n;i++){
                matrix[i][0] = 0;
            }
        }
        System.out.println(col0);
    }
}