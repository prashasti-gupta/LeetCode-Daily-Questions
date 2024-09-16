class Solution {
    public int minBitFlips(int start, int goal) {
        int flips = 0;
        int xorVal = start ^ goal;
        while (xorVal != 0) {
            flips += xorVal & 1;
            xorVal >>= 1;
        }
        return flips;
    }
}