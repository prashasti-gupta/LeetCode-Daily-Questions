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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] splitList = new ListNode[k];
        ListNode curr = head;
        int length = 0;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        int partSize = length / k; // same for all
        int remaining = length % k;

        for (int i = 0; i < k && head != null; i++) {
            splitList[i] = head;
            int part = partSize + (i < remaining ? 1 : 0);
            for (int j = 1; j < part; j++) {
                head = head.next;
            }
            ListNode nextPart = head.next;
            head.next = null;
            head = nextPart;
        }
        return splitList;
    }
}