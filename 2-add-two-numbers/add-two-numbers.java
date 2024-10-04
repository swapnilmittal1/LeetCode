

import static java.lang.Math.log10;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ansHead = new ListNode(0);

        ListNode tail = ansHead;
        int carry = 0;


        while(l1 != null || l2 != null || carry != 0) {
            int num1 = (l1 != null) ? l1.val : 0;
            int num2 = (l2 != null) ? l2.val : 0;
            int sum =  num1 + num2  + carry;

            int digit = sum % 10;
            carry = sum / 10;

            ListNode digitNode= new ListNode(digit);
            tail.next = digitNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next :l1;
            l2 = (l2 != null) ? l2.next : l2;
 



        }
        ListNode result = ansHead.next;
        return result;

    }
}