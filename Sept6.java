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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        ListNode temp = new ListNode();
        temp.next = head;

        ListNode result = temp;
        while (head != null) {
            if (!set.contains(head.val)) {
                temp.next = head;
                temp = temp.next;
            }
            head = head.next;
        }
        temp.next = head;
        return result.next;
    }
}