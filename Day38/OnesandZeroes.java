// https://leetcode.com/problems/ones-and-zeroes/description/

class Solution {
    public int solve(String[] strs,int i,int j,int m,int n,int [] temp){
        if(temp[0] <= m && temp[1] <= n) return j -i + 1;
        else if(i > j ) return -1;

        
    }
    public int findMaxForm(String[] strs, int m, int n) {
        int temp[] = new int[2];
        int n = strs.length();
        for(int i = 0;i< n;i++){
            if(strs[i] == 1) temp[1]+= 1;
            else temp[0]+= 1;
        }

        
    }
}