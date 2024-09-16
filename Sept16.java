class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> list = new ArrayList<>();
        for (String timePoint : timePoints) {
            int minutes = Integer.parseInt(timePoint.substring(0, 2)) * 60 + Integer.parseInt(timePoint.substring(3));
            list.add(minutes);
        }
        Collections.sort(list);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            minDiff = Math.min(minDiff, list.get(i) - list.get(i - 1));
        }
        // minDiff = Math.min(minDiff, (1440 + list.get(0)-list.get(list.size()-1)));
        return Math.min(minDiff, (1440 + list.get(0) - list.get(list.size() - 1)));
    }
}