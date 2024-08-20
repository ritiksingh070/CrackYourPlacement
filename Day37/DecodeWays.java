// https://leetcode.com/problems/decode-ways/description/

class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0) == '0') return 0;
        int n = s.length();
        if(n == 0 || n == 1) return 1;
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i<= n;i++){
            if(s.charAt(i-1) != '0') dp[i] += dp[i-1];
            if(Integer.parseInt(s.substring(i-2,i)) <= 26 && Integer.parseInt(s.substring(i-2,i)) >= 10) dp[i] += dp[i-2];


        }
        return dp[n];

    }
}