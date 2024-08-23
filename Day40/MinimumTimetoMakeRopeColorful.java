// https://leetcode.com/problems/minimum-time-to-make-rope-colorful/description/

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int prev = 0;
        int n = colors.length();
        int ans = 0;
        for(int i = 1;i<n;i++){
            if(colors.charAt(prev) == colors.charAt(i)){
                if(neededTime[prev] <= neededTime[i]){
                    ans+= neededTime[prev];
                    prev = i;
                }
                else{
                    ans+= neededTime[i];

                }
            }
            else{
                prev = i;
            }
        }
        return ans;
    }
}