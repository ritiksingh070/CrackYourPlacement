// https://leetcode.com/problems/sort-list/description/

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
    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        while(left != null && right != null){
            if(left.val < right.val){
                temp.next = left;
                left = left.next;
                
            }
            else{
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        while(left != null){
            temp.next = left;
            temp = temp.next;
            left = left.next;
        }
        while(right != null){
            temp.next = right;
            temp = temp.next;
            right = right.next;
        }
        return ans.next;
    }

    public ListNode sortList(ListNode head) {
        if(head == null ||  head.next == null) return head;

        ListNode middle = findMiddle(head);
        ListNode right = middle.next;
        middle.next = null;
        ListNode left = head;

        left = sortList(left);
        right = sortList(right);

        return merge(left,right);
    }
}