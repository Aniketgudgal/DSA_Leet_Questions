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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
        {
            return head;
        }
        // use two pointer to check the next value of list
        ListNode temp = head;
        ListNode i = temp;
        ListNode j = temp.next;
        while(j != null)
        {
            if(i.val != j.val)
            {
                i.next = j;
                i = j;
            }
            j = j.next;
        }
        i.next = null;
        return head;
    }
}