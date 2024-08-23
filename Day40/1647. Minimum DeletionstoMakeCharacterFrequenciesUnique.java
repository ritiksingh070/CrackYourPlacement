// https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/description/

class Solution {
    public int minDeletions(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(Map.Entry<Character,Integer> me : map.entrySet()){
            int val = me.getValue();
            if(set.size() == 0){
                set.add(val);
            }
            else if(!set.contains(val)){
                set.add(val);
            }
            else{
                while(set.contains(val) && val > 0){
                    ans++;
                    val--;
                }
                if(val != 0) set.add(val);
            }
        }

        return ans;
    }
}