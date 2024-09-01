class Solution {
    // Time Complexity: O(M*N)
    // Space Complexity: O(M*N)
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] ans = new int[m][n];
        // int len = original.length;
        if (original.length != m * n) {
            return new int[0][0];
        }
        int idx = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = original[idx++];
            }
        }
        return ans;
    }
}