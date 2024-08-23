// https://leetcode.com/problems/restore-the-array-from-adjacent-pairs/description/

class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer,ArrayList<Integer> > map = new HashMap<>();

        int n = adjacentPairs.length;
        for(int i = 0;i<n;i++){
            int first = adjacentPairs[i][0];
            int second = adjacentPairs[i][1];

            if(map.get(first) == null){
                map.put(first,new ArrayList<Integer>(Arrays.asList(second)));
            }
            else{
                ArrayList<Integer> temp = map.get(first);
                temp.add(second);
                map.put(first,temp);
            }


            if(map.get(second) == null){
                map.put(second,new ArrayList<Integer>(Arrays.asList(first)));
            }
            else{
                ArrayList<Integer> temp = map.get(second);
                temp.add(first);
                map.put(second,temp);
            }
        }
        int start = -1;
        for(Map.Entry<Integer,ArrayList<Integer>> me : map.entrySet()){
            System.out.println(me.getKey() + " " + me.getValue());
            if(me.getValue().size() == 1) {
                start = me.getKey();
                
            }
        }
        System.out.println(start);
        int ans[] = new int [n + 1];
        ans[0] = start;
        int i = 0;
        while(i < n){
            ArrayList<Integer> temp = map.get(ans[i]);
            if(temp.size() ==1) {
                ans[i+1] = temp.get(0);
            }
            else{
                if(temp.get(0) == ans[i-1]){
                    ans[i+1] = temp.get(1);
                }
                else{
                    ans[i+1] = temp.get(0);
                }
            }
            i++;
        }



        return ans;
    }
}