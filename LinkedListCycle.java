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
    public boolean hasCycle(ListNode head) {
        boolean flag = false;
        if(head == null)
        {
            return false;
        }
        /*
        LinkedHashSet<ListNode> al = new LinkedHashSet<>();
        ListNode temp = head;
        while(temp != null)
        {
            if(al.contains(temp))
            {
                flag = true;
                break;
            }
            al.add(temp);
            temp = temp.next;
        }
        return flag;
        */
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }
}