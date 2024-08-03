// https://leetcode.com/problems/merge-k-sorted-lists/description/

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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 ) return null;
        else if(lists.length == 1) return lists[0];

        return mergeKLists(lists,0,lists.length -1);


    }

    public ListNode mergeKLists (ListNode[] lists, int startIdx,int endIdx){
        if(startIdx == endIdx) return lists[startIdx];
        else if(startIdx + 1 == endIdx){
            return mergeTwoList(lists[startIdx],lists[endIdx]);
        }

        int mid = startIdx + (endIdx -startIdx )/2;

        ListNode left = mergeKLists(lists,startIdx,mid -1);
        ListNode right = mergeKLists(lists,mid,endIdx);

        return mergeTwoList(left,right);
    }

    public ListNode mergeTwoList (ListNode h1,ListNode h2){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(h1 != null && h2 != null){
            if(h1.val <= h2.val){
                temp.next = h1;
                h1 = h1.next;
            }
            else{
                temp.next = h2;
                h2 = h2.next;
            }
            temp = temp.next;
        }

        if(h1 != null) temp.next = h1;
        if(h2 != null ) temp.next = h2;

        return dummy.next;
    }
}