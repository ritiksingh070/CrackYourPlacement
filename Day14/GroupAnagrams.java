// https://leetcode.com/problems/group-anagrams/description/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String curr = new String(charArray);
            
            if(map.get(curr) != null){
                
            }

        }
    }
}