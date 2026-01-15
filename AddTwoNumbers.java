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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      /*  long sum1 = Sum(l1);
        long sum2 = Sum(l2);
        long total = sum1+sum2;
        ListNode head = null;
        ListNode temp = null;
        if(total == 0)
        {
            head = new ListNode((int)total);
        }
        while(total != 0)
        {
            int rem = (int)(total % 10);
            if(head == null)
            {
                head = new ListNode(rem);
                temp = head;
            }
            else
            {
                temp.next = new ListNode(rem);
                temp = temp.next;
            }
            total /= 10;
        }
        return head;
        */
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0)
        {
            int sum = carry;
            if(l1 != null)
            {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum /10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }
    public long Sum(ListNode head)
    {
        long rem = 0;
        while(head != null)
        {
            rem = rem * 10+ head.val;
            head = head.next; 
        }
        return rem;
    }
}