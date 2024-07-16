// https://leetcode.com/problems/4sum/description/

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while(i < n){
            int j = i+1;
            while(j < n){
                int k = j+1,l = n-1;
                while(k < l){
                    long sum = (long)nums[i] +  (long)nums[j] +  (long)nums[k] +  (long)nums[l];
                   
                    // long check = (long)target;
                    // System.out.println(check + " " + sum);
                    if(sum == target){
                        ans.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k],nums[l])));
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(l > k && nums[l] == nums[l+ 1]) l--;
                    }
                    else if(sum > target){
                        l--;
                        while(l> k && nums[l] == nums[l+1]) l--;
                    }
                    else {
                        k++;
                        while(l <  k && nums[k] == nums[k-1]) k++;
                    }

                    
                }
                j++;
                while(j < n && nums[j] == nums[j-1]) j++;

            }
            i++;
            while(i < n && nums[i] == nums[i-1]) i++;
        }
        return ans;
    }
}