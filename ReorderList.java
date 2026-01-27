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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
      /* ArrayList<Integer> al = new ArrayList<>();
       ListNode temp = head;
       while(temp != null)
       {
            al.add(temp.val);
            temp = temp.next;
       }
       int i = 0;
       int j = al.size() - 1;
       int[] nums = new int[al.size()];
       int k = 0;
       while(i <= j)
       {
            if(k < nums.length)
            {
                nums[k++] = al.get(i);
            }
            if(k < nums.length)
            {
                nums[k++] = al.get(j);
            }
            i++;
            j--;
       }
       temp = head;
       k = 0;
       while(k < nums.length)
       {
            temp.val = nums[k++];
            temp = temp.next;
       }
       */
        // Step 1: Find middle
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode prev = null, curr = slow;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Merge halves
        ListNode first = head;
        ListNode second = prev;

        while (second.next != null) {
            ListNode t1 = first.next;
            ListNode t2 = second.next;

            first.next = second;
            second.next = t1;

            first = t1;
            second = t2;
        }
    } 
}