/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        /*
        HashSet<ListNode> al = new HashSet<>();
        ListNode temp = head;
        while(temp != null)
        {
            if(al.contains(temp))
            {
                return temp;
            }
            al.add(temp);
            temp = temp.next;
        }
        return null;
        */
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            // if node is connected
            if(slow == fast)
            {
                // checking from first node
                 ListNode entry = head;
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;
            }
        }
        return null;
    }
}