// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1 ){
            if(nums[0] == target) return 0;
            else return -1;
        }
        int left = 0,right = nums.length -1;
        
        int ans = -1;
        while(left <= right ){
            if(right == left ){
                if(nums[right] == target) return right;
                else return -1;
            }
            int mid = left + (right -left )/2;

            if(nums[mid] == target){
                ans = mid;
                break;
            }
            else{
                if(nums[mid+1] <= nums[right]){
                    //right sorted
                    if(target >= nums[mid+1] && target <= nums[right]){
                        left = mid + 1;
                    }
                    else{
                        right = mid-1;
                    }
                }
                else {
                    //left sorted
                    if(target >= nums[left] && target <= nums[mid -1]){
                        right = mid -1;
                    }
                    else{
                        left = mid+1;
                    }
                }
            }
        }
        return ans;
    }
}