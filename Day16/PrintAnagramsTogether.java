// https://www.geeksforgeeks.org/problems/print-anagrams-together/1

class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        Map<String,List<String>> map = new HashMap();
        List<List<String>> ans = new ArrayList<>();
        
        for(int i = 0;i<string_list.length ;i++){
            char temp[] = string_list[i].toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            if(map.get(key) == null){
                List<String> value = new ArrayList<>();
                value.add(string_list[i]);
                map.put(key,value);
            }
            else{
                List<String> value = map.get(key);
                value.add(string_list[i]);
                map.put(key,value);
            }
        }
        
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            // String key = entry.getKey();
            List<String> values = entry.getValue();
            ans.add(values);
            // System.out.println("Key: " + key);
            // for (String value : values) {
            //     System.out.println("  Value: " + value);
            // }
        }
        
        return ans;
    }
}