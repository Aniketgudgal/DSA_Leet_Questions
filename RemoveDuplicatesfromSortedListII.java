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
        /*
        ArrayList<Integer> al = new ArrayList<>();
        while(head != null)
        {
            al.add(head.val);
            head = head.next;
        }
       List<Integer> result = al.stream().filter(x -> Collections.frequency(al,x) == 1).toList();
       head = null;
       ListNode temp = null;
       for(int i = 0; i < result.size(); i++)
       {
        if(head == null)
        {
            head = new  ListNode(result.get(i));
            temp = head;
            continue;
        }
        temp.next = new ListNode(result.get(i));
        temp = temp.next;
       }
    return head;
    */
    ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;   // last node before duplicates
        ListNode curr = head;

        while (curr != null) {
            boolean duplicate = false;

            // skip all nodes with same value
            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
                duplicate = true;
            }

            if (duplicate) {
                // remove all duplicates
                prev.next = curr.next;
            } else {
                // move prev only if no duplicate
                prev = prev.next;
            }

            curr = curr.next;
        }

        return dummy.next;
    }
}