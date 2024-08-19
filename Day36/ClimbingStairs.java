// https://leetcode.com/problems/climbing-stairs/description/

class Solution {
    public int solve(int i,int top,int [] dp){
        if(i == top) return 1;
        else if(i > top) return 0;
        if(dp[i] != -1) return dp[i];
        dp[i] = solve(i+1,top,dp) + solve(i+2,top,dp);
        return dp[i];
    }
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0,n,dp);
    }
}