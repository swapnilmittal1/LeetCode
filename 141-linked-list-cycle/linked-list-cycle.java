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

        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = head;

        if (head == null || head.next == null) {
            return false;
        } 

        while (curr != null) {
            if (!set.contains(curr)) {
                set.add(curr);
                curr = curr.next;
            } else {
                return true;  // Cycle detected
            }
        }
        return false;  // No cycle found
    }
}
