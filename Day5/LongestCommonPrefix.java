// https://leetcode.com/problems/longest-common-prefix/description/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int len = Math.min(first.length(),last.length());
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<len;i++){
            if(first.charAt(i) == last.charAt(i)){
                ans.append(first.charAt(i));
            }
            else break;
        }
        return ans.toString();
    }
}