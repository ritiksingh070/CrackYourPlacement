// https://leetcode.com/problems/3sum/description/




class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        while(i < n){
            int j = i+ 1,k = n-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    
                   
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                    j++;
                    k--;
                    while(nums[j] == nums[j-1] && j < k) j++;
                    while(nums[k] == nums[k+1] && k > j) k--;
                }
                else if(sum > 0){
                    k--;
                }
                else j++;
            }
            i++;
            while(i < n && nums[i] == nums[i-1] ) i++;
        }
        return ans;
    }
}