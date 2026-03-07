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
    public ListNode reverseList(ListNode head) {
       ArrayList<Integer> al = new ArrayList<>();
       ListNode temp = head;
       while(temp!= null)
       {
        al.add(temp.val);
        temp = temp.next;
       } 
       temp = head;
       int i = al.size() - 1;
       while(temp != null && i >= 0)
       {
        temp.val = al.get(i);
        i--;
        temp = temp.next;
       }
       return head;
    }
}