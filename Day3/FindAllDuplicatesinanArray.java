// https://leetcode.com/problems/find-all-duplicates-in-an-array/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1;i<n;i++){
            if(nums[i] == nums[i-1]) ans.add(nums[i]);
        }
        return ans;
    }
}