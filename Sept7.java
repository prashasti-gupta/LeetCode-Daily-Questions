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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        return helper(root, head);
    }

    public boolean helper(TreeNode root, ListNode head) {
        if (root == null)
            return false;
        if (dfs(root, head))
            return true;
        if (helper(root.left, head) || helper(root.right, head))
            return true;
        return false;
    }

    public boolean dfs(TreeNode root, ListNode head) {
        if (head == null)
            return true;
        if (root == null || head.val != root.val)
            return false;
        if (dfs(root.left, head.next) || dfs(root.right, head.next))
            return true;
        return false;
    }
}