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
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return head;
        }
        ArrayList<Integer> nodeList = new ArrayList<>();
        ListNode firstIter = head;
        while (firstIter != null) {
            nodeList.add(firstIter.val);
            firstIter = firstIter.next;
        }
        Collections.sort(nodeList);
        int i = 0;
        ListNode head1 = head;
        while (head != null) {
            head.val = nodeList.get(i);
            head = head.next;
                i++;
        }
        
        return head1;
    }
}
