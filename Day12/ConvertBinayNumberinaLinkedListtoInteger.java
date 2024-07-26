// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int power = 1;
        while(temp.next != null){
            power*= 2;
            temp = temp.next;
        }
        temp = head;
        int ans = 0;
        while(temp != null){
            if(temp.val == 1) ans+= power;
            power/= 2;
            temp = temp.next;
        }

        return ans;
    }
}