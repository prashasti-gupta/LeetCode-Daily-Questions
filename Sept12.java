class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int consistentString = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                if (!set.contains(str.charAt(j))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                consistentString++;
            }
        }
        return consistentString;
    }
}