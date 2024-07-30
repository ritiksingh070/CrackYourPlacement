// https://leetcode.com/problems/reorder-list/description/


class Solution {
    private ListNode temp;
    private boolean stop;
    public void reorderList(ListNode head) {
        temp = head;
        stop = false;
        reorder(head);
    }

    private void reorder (ListNode node) {
        if(node == null)
            return;
       
        reorder(node.next);

        
        if(stop)
            return;

        
        if(node == temp || node == temp.next) {
         
            node.next = null;
            stop = true;
        }
        else {
         
            ListNode next = temp.next;
            temp.next = node;
            temp = temp.next;
            temp.next = next;
            temp = temp.next;
        }
    }
}