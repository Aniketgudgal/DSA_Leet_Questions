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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp != null)
        {
            temp = temp.next;
            count++;
        }
        if(head.next == null)
        {
            return null;
        }
        count = count/2;
        temp = head;
        int n = 0;
        ListNode prev = null;
        while(temp != null)
        {
            if(n == count)
            {
                prev.next = temp.next;
                break;
            }
            n++;
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}