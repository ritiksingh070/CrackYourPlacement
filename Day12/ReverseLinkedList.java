// https://leetcode.com/problems/reverse-linked-list/description/


class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode toBeCurr = curr.next;
        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = toBeCurr;
            if(curr == null) break;
            toBeCurr = curr.next;
        }
        return prev;
    }
}