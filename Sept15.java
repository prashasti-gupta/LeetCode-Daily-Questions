public class Sept15 {

}

class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int mask = 0;
        map.put(mask, -1);
        int subStringLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                mask = (mask ^ (1 << 0));
            } else if (s.charAt(i) == 'e') {
                mask = (mask ^ (1 << 1));
            } else if (s.charAt(i) == 'i') {
                mask = (mask ^ (1 << 2));
            } else if (s.charAt(i) == 'o') {
                mask = (mask ^ (1 << 3));
            } else if (s.charAt(i) == 'u') {
                mask = (mask ^ (1 << 4));
            }
            if (map.containsKey(mask)) {
                subStringLength = Math.max(subStringLength, i - map.get(mask));
            } else {
                map.put(mask, i);
            }
        }
        return subStringLength;
    }
}