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
    public ListNode modifiedList(int[] nums, ListNode head) {
        LinkedHashMap<ListNode, Integer> al  = new LinkedHashMap<>();
        ListNode temp = head;
        Set<Integer> setArray = new HashSet<>();
        // convert array into set
        for (int num : nums) {
        setArray.add(num);
        }
        // converting linked list into the map
        while(temp != null)
        {
            al.put(temp, temp.val);
            temp = temp.next;
            head = null;
            head = temp;
        }
        // checking the set and map values are same or not, if same delete that map value
        Iterator<Map.Entry<ListNode, Integer>> it = al.entrySet().iterator();
        while (it.hasNext()) 
        {
            Map.Entry<ListNode, Integer> entry = it.next();
            if (setArray.contains(entry.getValue())) 
            {
                it.remove();   // delete from map
            }
        }
        // converting map into linked list
        head = null;
        temp = null;
        for(Map.Entry<ListNode, Integer> entry : al.entrySet())
        {
            if(head == null)
            {
                head = new ListNode(entry.getValue());
                temp = head;
            }
            else
            {
                temp.next = new ListNode(entry.getValue());
                temp = temp.next;
            }
        }
        return head;
    }
}