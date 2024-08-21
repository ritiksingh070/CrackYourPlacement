// https://leetcode.com/problems/longest-increasing-subsequence/description/

class Solution {
    public int solve(int[] nums,int n,int idx,int prev_idx,int dp[][]){
        if(idx == n) return 0;
        if(prev_idx != -1){
             if(dp[idx][prev_idx] != -1 ) return dp[idx][prev_idx];
        }
       
        int len = 0 + solve(nums,n,idx+1,prev_idx,dp);
        
        if(prev_idx == -1 || nums[idx] > nums[prev_idx]){
            len = Math.max(len,1 + solve(nums,n,idx+1,idx,dp));
        }
        if(prev_idx == -1) return len;
        return dp[idx][prev_idx] = len;
        
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[][] = new int[n+1][n+1];
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return solve(nums,nums.length,0,-1,dp);
    }
}