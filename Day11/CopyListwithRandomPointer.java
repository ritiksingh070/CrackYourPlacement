// https://leetcode.com/problems/copy-list-with-random-pointer/description/

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> Newlist = new HashMap<>();
        Node curr = head;
        while(curr != null){
            Newlist.put(curr,new Node(curr.val));
            curr = curr.next;

        }
        curr = head;
        while(curr != null){
            Newlist.get(curr).next = Newlist.get(curr.next);
            Newlist.get(curr).random = Newlist.get(curr.random);
            curr = curr.next;
        }
        return Newlist.get(head);
    }
}