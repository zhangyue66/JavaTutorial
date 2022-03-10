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
        int carry = 0;
        ListNode cur = ansHead;
        while (l1 != null || l2 != null || carry == 1) {
            int x=0,y=0;
            if (l1 != null) {
                x = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                y = l2.val;
                l2 = l2.next;
            }
            int curVal = x+y+carry;
            carry = curVal/10;
            curVal %= 10;
            cur.next = new ListNode(curVal);
            cur = cur.next;       
        }
        return ansHead.next;
    }
}
