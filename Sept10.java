/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null)
            return head;
        ListNode temp = head;
        ListNode curr = temp.next;
        while (curr != null) {
            int gcdVal = gcd(temp.val, curr.val);
            ListNode newNode = new ListNode(gcdVal);
            temp.next = newNode;
            newNode.next = curr;
            temp = curr;
            curr = curr.next;
        }
        return head;

    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}