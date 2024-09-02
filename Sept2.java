class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long totalReq = 0;
        for (int chalkPiece : chalk) {
            totalReq += chalkPiece;
        }
        int remainingChalk = (int) (k % totalReq);
        for (int idx = 0; idx < chalk.length; idx++) {
            if (remainingChalk < chalk[idx]) {
                return idx;
            }
            remainingChalk -= chalk[idx];
        }
        return -1;
    }
}