// https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/description/

/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class lc430Helper {
    Node head;
    Node tail;
}

class Solution {
    public Node flatten(Node head) {
        return util1(head).head;
    }
    public lc430Helper util1(Node head) {
       Node dummy = new Node();
        dummy.next = head;
        Node temp = dummy;
        while (temp.next != null) {
            temp = temp.next;
            if (temp.child == null) {
                continue;
            } else {
                lc430Helper bottom = util1(temp.child);
                Node temp2 = temp.next;
                temp.child = null;
                temp.next = bottom.head;
                bottom.head.prev = temp;
                bottom.tail.next = temp2;
                if (temp2 != null) {
                    temp2.prev = bottom.tail;
                }
                temp = bottom.tail;
            }
        }
        lc430Helper ans = new lc430Helper();
        dummy.next = null;
        ans.head = head;
        ans.tail = temp;
        return ans;
    }
}