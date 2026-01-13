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
       ArrayList<Integer> al = new ArrayList<>();
       /* 
       // this problem is solving merge sort of list
       ListNode current = null;
        ListNode dummy = null;
        ListNode head = null;
        ListNode prev = null;
        int i = 0;
        while(i < lists.length)
        {
            ListNode temp = lists[i];
            while(temp != null)
            {
                if(head == null)
                {
                    head = new ListNode(temp.val);
                    prev = head;
                }
                else
                {
                    dummy = new ListNode(temp.val);
                    prev.next = dummy;
                    prev = dummy;
                }
               
                temp = temp.next;
            }
            i++;
        }
        */

        // this solution from using array list
        int i = 0;
        ListNode head = null;
        ListNode prev = null;
        while(i < lists.length)
        {
            ListNode temp = lists[i];
            while(temp != null)
            {
                al.add(temp.val);
               temp = temp.next;
            }
            i++;
        }
        Collections.sort(al);
        ListNode temp = null;
        for(i = 0; i < al.size(); i++)
        {
           if(head == null)
            {
                head = new ListNode(al.get(i));
                prev = head;
            }
            else
            {
                temp = new ListNode(al.get(i));
                prev.next = temp;
                prev = temp;
            }
        }
        return head;
    }
    /*
      private ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode mid = getMiddle(head);
        ListNode rightHead = mid.next;
        mid.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        return merge(left, right);
    }

    // Find middle using slow-fast pointer
    private ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted linked lists
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        curr.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
    */
}