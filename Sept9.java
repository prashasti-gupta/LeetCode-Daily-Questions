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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        for (int[] mat : matrix) {
            Arrays.fill(mat, -1);
        }
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        while (head != null) {
            for (int col = left; col <= right && head != null; col++) {
                matrix[top][col] = head.val;
                head = head.next;
            }
            top++;
            for (int row = top; row <= bottom && head != null; row++) {
                matrix[row][right] = head.val;
                head = head.next;
            }
            right--;
            for (int col = right; col >= left && head != null; col--) {
                matrix[bottom][col] = head.val;
                head = head.next;
            }
            bottom--;
            for (int row = bottom; row >= top && head != null; row--) {
                matrix[row][left] = head.val;
                head = head.next;
            }
            left++;
        }
        return matrix;
    }
}