// https://leetcode.com/problems/majority-element/description/


class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int ans = -1;
        for(Map.Entry<Integer,Integer> me : m.entrySet()){
            if(me.getValue() > nums.length/2){
                ans = me.getKey();
            }
        }
        return ans;
    }
}