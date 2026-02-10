/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         if (headA == null || headB == null) return null;
        /*
        ArrayList<ListNode> al = new ArrayList<>();
        ListNode temp = headA;
        ListNode result = null;
        while(temp != null)
        {
            al.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while(temp != null)
        {
            if(al.contains(temp))
            {
                return temp;
            }
            temp = temp.next;
        }
        return result;
        */
        ListNode a = headA;
        ListNode b = headB;
        while(a != b)
        {
            a = (a == null) ? headB: a.next;
            b = (b== null) ? headA: b.next;
        }
        return a;
    }
}