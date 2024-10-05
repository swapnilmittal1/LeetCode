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

        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode curr = head;

        if(head == null || head.next == null) {
            return false;
        } 

        while(curr.next != null) {
            if(! map.containsKey(curr.next)) {
                map.put(curr.next, curr.next.val);
                curr = curr.next;
            } else {
                return true;
            }
        }
        return false;
    }
}