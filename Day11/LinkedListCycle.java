// https://leetcode.com/problems/linked-list-cycle/description/


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode oneStep = head;
        ListNode twoStep = head;
        while(twoStep != null && twoStep.next != null){
            twoStep= twoStep.next.next;
            oneStep = oneStep.next;
            if(oneStep == twoStep){
                return true;
            }
        }
        return false;
    }
}