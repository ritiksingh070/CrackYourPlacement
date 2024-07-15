// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/


class Solution {
    public int removeDuplicates(int[] nums) {
        int dup = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                nums[i-1] = Integer.MAX_VALUE;
                dup++;
            }
           
        }
        
        Arrays.sort(nums);
        return nums.length - dup;
    }
}