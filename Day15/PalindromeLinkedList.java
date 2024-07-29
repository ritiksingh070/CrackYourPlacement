// https://leetcode.com/problems/palindrome-linked-list/description/

class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(head != null){
            arr.add(head.val);
            head = head.next;
        }
        for(int i = 0 ;i< arr.size()/2;i++){
            if(arr.get(i) != arr.get(arr.size()-i -1)){
                return false;
            }
        }
        return true;
    }
}